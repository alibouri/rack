package com.wave.customer;

import Aa.n;
import Ab.o;
import B9.b;
import J9.d;
import J9.l;
import J9.m;
import J9.p;
import Vb.j;
import W4.f;
import Y8.O;
import Y8.R6;
import Y8.k;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import hd.c;
import mb.a;
import q9.C3;
import q9.l3;
import q9.m3;
import q9.p1;
import s.e;
import v1.q;

public final class CustomerFCMService extends FirebaseMessagingService {
    public final o f0;

    public CustomerFCMService() {
        this.f0 = f.A(new n(10, this));
    }

    @Override  // com.google.firebase.messaging.FirebaseMessagingService
    public final void c(RemoteMessage remoteMessage0) {
        String[] arr_s;
        hb.n.a("Push message received", null, null, null, null, 30);
        if(this.e().d().h() != null) {
            try {
                String s = (String)((e)remoteMessage0.g()).get("channel");
                if(s == null) {
                    s = this.e().v0;
                }
                if(!this.e().b(s)) {
                    return;
                }
                Object object0 = ((e)remoteMessage0.g()).get("mobile");
                if(((String)object0) != null && !this.e().d().f().contains(((String)object0))) {
                    return;
                }
                String s1 = CustomerFCMService.f(remoteMessage0, "title");
                String s2 = CustomerFCMService.f(remoteMessage0, "body");
                String s3 = (String)((e)remoteMessage0.g()).get("action_uri");
                if(s3 == null || j.c0(s3)) {
                    this.e().getClass();
                    s3 = "wave://mm/personal_home";
                }
                String s4 = ((String)object0) == null ? s3 : Uri.parse(s3).buildUpon().appendQueryParameter("mobile", ((String)object0)).build().toString();
                String s5 = (String)((e)remoteMessage0.g()).get("android_notification_id");
                if(s5 == null) {
                    s5 = "0";
                }
                String s6 = (String)((e)remoteMessage0.g()).get("group_key");
                if(s6 == null) {
                    s6 = "com.wave.personal.DEFAULT";
                }
                String s7 = (String)((e)remoteMessage0.g()).get("tags");
                if(s7 == null) {
                    arr_s = new String[0];
                }
                else {
                    arr_s = (String[])j.p0(s7, new String[]{","}, 0, 6).toArray(new String[0]);
                    if(arr_s == null) {
                        arr_s = new String[0];
                    }
                }
                this.g(s1, s2, s4, s, s5, s6);
                String s8 = (String)((e)remoteMessage0.g()).get("attempt_id");
                if(s8 != null) {
                    C3 c30 = ((p)this.e().u0.getValue()).a;
                    b b0 = ((String)object0) == null ? c30.d().c() : c30.d().a(((String)object0));
                    if(b0 != null) {
                        R6 r60 = b0.a();
                        if(r60 != null) {
                            a.a(null, null, new m(r60, new k(s8), null), 3);
                        }
                    }
                }
                i2.b.a(this).c(new Intent("com.wave.components.NOTIFICATION_RECEIVED").putExtra("tags", arr_s));
                return;
            }
            catch(d d0) {
            }
            hb.n.b(d0, null, null, 14);
            return;
        }
        ((p)this.e().u0.getValue()).getClass();
        p.a();
    }

    @Override  // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(String s) {
        Nb.j.f(s, "token");
        c.a.n("WaveFCMService");
        c.a.g("Received a new token from FCM: " + s, new Object[0]);
        hb.n.a("Received a new token from FCM", null, null, null, null, 30);
    }

    public final l e() {
        return (l)this.f0.getValue();
    }

    public static String f(RemoteMessage remoteMessage0, String s) {
        String s1 = (String)((e)remoteMessage0.g()).get(s);
        if(s1 != null) {
            return s1;
        }
        String s2 = "Message from server is missing \'data." + s + "\' property";
        Nb.j.f(s2, "message");
        throw new d(s2);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
    }

    public final void g(String s, String s1, String s2, String s3, String s4, String s5) {
        NotificationChannel notificationChannel0;
        Intent intent0;
        PendingIntent pendingIntent0;
        int v;
        Nb.j.f(s2, "actionUriString");
        Nb.j.f(s3, "channelId");
        Nb.j.f(s5, "groupKey");
        Object object0 = this.getSystemService("notification");
        Nb.j.d(object0, "null cannot be cast to non-null type android.app.NotificationManager");
        try {
            v = 0;
            v = Integer.parseInt(s4);
            pendingIntent0 = null;
        }
        catch(NumberFormatException unused_ex) {
        }
        try {
            Uri uri0 = Uri.parse(s2);
            try {
                l l0 = this.e();
                Nb.j.c(uri0);
                intent0 = l0.v(uri0, this.e());
            }
            catch(O unused_ex) {
                intent0 = new Intent(this, ((CustomerApp)this.e()).w0);
                intent0.addFlags(0x10000000);
            }
            pendingIntent0 = PendingIntent.getActivity(this, 0, intent0, 0x44000000);
        }
        catch(m3 m30) {
            c.a.n("WaveFCMService");
            c.a.m(m30, "This app cannot handle push notification action_uri \'" + s2 + "\'. Perhaps because it is an older version.", new Object[0]);
        }
        catch(p1 p10) {
            c.a.n("WaveFCMService");
            c.a.m(p10, "Failed to create pending intent for \'" + s2 + "\'. Possibly because more than one app on this device is a handler.", new Object[0]);
        }
        catch(l3 l30) {
            c.a.n("WaveFCMService");
            c.a.m(l30, "Failed to create pending intent for \'" + s2 + "\' because this user does not have permission to view this screen.", new Object[0]);
        }
        this.e().getClass();
        q q0 = new q(this, s3);
        this.e().getClass();
        q0.w.icon = 0x7F08025F;  // drawable:ic_mono_penguin
        q0.e = q.b(s);
        q0.f = q.b(s1);
        q0.c(16, true);
        q0.w.sound = Settings.System.DEFAULT_NOTIFICATION_URI;
        q0.w.audioStreamType = -1;
        q0.w.audioAttributes = v1.p.a(v1.p.d(v1.p.c(v1.p.b(), 4), 5));
        q0.w.vibrate = new long[]{0L, 1000L};
        q0.j = 1;
        q0.o = s5;
        v1.o o0 = new v1.o(3);  // initializer: LO3/j;-><init>(I)V
        o0.Z = q.b(s1);
        q0.e(o0);
        if(pendingIntent0 == null) {
            c.a.n("WaveFCMService");
            c.a.l("Disabling the notification\'s content intent (tap action) because we couldn\'t create an intent from the provided action_uri.", new Object[0]);
        }
        else {
            q0.g = pendingIntent0;
        }
        if(Build.VERSION.SDK_INT >= 26) {
            switch(s3.hashCode()) {
                case 0x841CD771: {
                    notificationChannel0 = s3.equals("rebalance_receipts") ? E3.a.C(s3, "Rebalance Receipts") : E3.a.e(s3, "Transaction Receipts");
                    break;
                }
                case -1415077225: {
                    notificationChannel0 = s3.equals("alerts") ? E3.a.e(s3, "Alerts") : E3.a.e(s3, "Transaction Receipts");
                    break;
                }
                case 0xDF847E34: {
                    notificationChannel0 = s3.equals("informational_messages") ? E3.a.C(s3, "Informational Messages") : E3.a.e(s3, "Transaction Receipts");
                    break;
                }
                case 0xC8D7C: {
                    notificationChannel0 = E3.a.e(s3, "Transaction Receipts");
                    break;
                }
                default: {
                    notificationChannel0 = E3.a.e(s3, "Transaction Receipts");
                }
            }
            ((NotificationManager)object0).createNotificationChannel(notificationChannel0);
        }
        ((NotificationManager)object0).notify(v, q0.a());
    }
}

