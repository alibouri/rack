package M4;

import E.f0;
import N4.j;
import U7.c;
import a5.w;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import i2.b;
import io.sentry.hints.i;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import v7.d;

public final class e {
    public final b a;
    public final c b;
    public AccessToken c;
    public final AtomicBoolean d;
    public Date e;
    public static final i f;
    public static e g;

    static {
        e.f = new i(6);
    }

    public e(b b0, c c0) {
        this.a = b0;
        this.b = c0;
        this.d = new AtomicBoolean(false);
        this.e = new Date(0L);
    }

    public final void a() {
        AccessToken accessToken0 = this.c;
        if(accessToken0 == null) {
            return;
        }
        if(!this.d.compareAndSet(false, true)) {
            return;
        }
        this.e = new Date();
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        AtomicBoolean atomicBoolean0 = new AtomicBoolean(false);
        f0 f00 = new f0(2);
        a a0 = new a(atomicBoolean0, hashSet0, hashSet1, hashSet2, 0);
        x x0 = x.X;
        Bundle bundle0 = new Bundle();
        bundle0.putString("fields", "permission,status");
        t t0 = i.F(accessToken0, "me/permissions", a0);
        t0.d = bundle0;
        t0.h = x0;
        M4.b b0 = new M4.b(0, f00);
        H6.e e0 = (accessToken0.i0 == null ? "facebook" : accessToken0.i0).equals("instagram") ? new H6.e(7) : new d(6);
        Bundle bundle1 = new Bundle();
        bundle1.putString("grant_type", e0.h());
        bundle1.putString("client_id", accessToken0.f0);
        bundle1.putString("fields", "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
        t t1 = i.F(accessToken0, e0.f(), b0);
        t1.d = bundle1;
        t1.h = x0;
        v v0 = new v(new t[]{t0, t1});
        M4.c c0 = new M4.c(f00, accessToken0, atomicBoolean0, hashSet0, hashSet1, hashSet2, this);
        ArrayList arrayList0 = v0.b0;
        if(!arrayList0.contains(c0)) {
            arrayList0.add(c0);
        }
        j.C(v0);
        new u(v0).executeOnExecutor(l.c(), new Void[0]);
    }

    public final void b(AccessToken accessToken0, AccessToken accessToken1) {
        Intent intent0 = new Intent(l.a(), CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent0.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent0.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken0);
        intent0.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken1);
        this.a.c(intent0);
    }

    public final void c(AccessToken accessToken0, boolean z) {
        boolean z1;
        AccessToken accessToken1 = this.c;
        this.c = accessToken0;
        this.d.set(false);
        this.e = new Date(0L);
        if(z) {
            SharedPreferences sharedPreferences0 = (SharedPreferences)this.b.Y;
            if(accessToken0 == null) {
                sharedPreferences0.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                Context context0 = l.a();
                try {
                    w.o(context0, "facebook.com");
                    w.o(context0, ".facebook.com");
                    w.o(context0, "https://facebook.com");
                    w.o(context0, "https://.facebook.com");
                }
                catch(Exception unused_ex) {
                }
            }
            else {
                try {
                    JSONObject jSONObject0 = accessToken0.b();
                    sharedPreferences0.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", jSONObject0.toString()).apply();
                }
                catch(JSONException unused_ex) {
                }
            }
        }
        if(accessToken1 != null) {
            z1 = accessToken1.equals(accessToken0);
        }
        else if(accessToken0 == null) {
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(!z1) {
            this.b(accessToken1, accessToken0);
            Context context1 = l.a();
            AccessToken accessToken2 = M6.b.A();
            AlarmManager alarmManager0 = (AlarmManager)context1.getSystemService("alarm");
            if(M6.b.L() && ((accessToken2 == null ? null : accessToken2.X) != null && alarmManager0 != null)) {
                Intent intent0 = new Intent(context1, CurrentAccessTokenExpirationBroadcastReceiver.class);
                intent0.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
                PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context1, 0, intent0, 0x4000000);
                try {
                    alarmManager0.set(1, accessToken2.X.getTime(), pendingIntent0);
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }
}

