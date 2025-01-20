package com.google.firebase.messaging;

import B3.c;
import E7.B;
import E7.i;
import I2.J;
import J5.a;
import J5.j;
import J5.k;
import R2.w;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jeb.synthetic.FIN;

public class FirebaseMessagingService extends i {
    public a d0;
    public static final ArrayDeque e0;

    static {
        FirebaseMessagingService.e0 = new ArrayDeque(10);
    }

    @Override  // E7.i
    public final void b(Intent intent0) {
        int v1;
        String s = intent0.getAction();
        if(!"com.google.android.c2dm.intent.RECEIVE".equals(s) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(s)) {
            if("com.google.firebase.messaging.NEW_TOKEN".equals(s)) {
                this.d(intent0.getStringExtra("token"));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent0.getAction());
            return;
        }
        String s1 = intent0.getStringExtra("google.message_id");
        if(TextUtils.isEmpty(s1)) {
        label_17:
            String s2 = intent0.getStringExtra("message_type");
            if(s2 == null) {
                s2 = "gcm";
            }
            switch(s2) {
                case "deleted_messages": {
                    break;
                }
                case "gcm": {
                    J.J(intent0);
                    Bundle bundle0 = intent0.getExtras();
                    if(bundle0 == null) {
                        bundle0 = new Bundle();
                    }
                    bundle0.remove("androidx.content.wakelockid");
                    if(c.x(bundle0)) {
                        c c0 = new c(bundle0);
                        ExecutorService executorService0 = Executors.newSingleThreadExecutor(new T5.a("Firebase-Messaging-Network-Io"));
                        w w0 = new w(this, c0, executorService0);
                        int v = FIN.finallyOpen$NT();
                        if(w0.u()) {
                            FIN.finallyCodeBegin$NT(v);
                            executorService0.shutdown();
                            FIN.finallyCodeEnd$NT(v);
                        }
                        else {
                            FIN.finallyExec$NT(v);
                            if(J.P(intent0)) {
                                J.K("_nf", intent0.getExtras());
                            }
                            this.c(new RemoteMessage(bundle0));
                        }
                    }
                    else {
                        this.c(new RemoteMessage(bundle0));
                    }
                    break;
                }
                case "send_error": {
                    if(intent0.getStringExtra("google.message_id") == null) {
                        intent0.getStringExtra("message_id");
                    }
                    String s3 = intent0.getStringExtra("error");
                    new B(s3);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                    if(s3 != null) {
                        s3.toLowerCase(Locale.US).getClass();
                    }
                    break;
                }
                case "send_event": {
                    intent0.getStringExtra("google.message_id");
                    break;
                }
                default: {
                    Log.w("FirebaseMessaging", "Received message with unknown type: " + s2);
                }
            }
        }
        else {
            ArrayDeque arrayDeque0 = FirebaseMessagingService.e0;
            if(!arrayDeque0.contains(s1)) {
                if(arrayDeque0.size() >= 10) {
                    arrayDeque0.remove();
                }
                arrayDeque0.add(s1);
                goto label_17;
            }
            else if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received duplicate message: " + s1);
            }
        }
        if(this.d0 == null) {
            this.d0 = new a(this.getApplicationContext());
        }
        a a0 = this.d0;
        CloudMessage cloudMessage0 = new CloudMessage(intent0);
        if(a0.c.e() >= 233700000) {
            Bundle bundle1 = new Bundle();
            Intent intent1 = cloudMessage0.X;
            String s4 = intent1.getStringExtra("google.message_id");
            if(s4 == null) {
                s4 = intent1.getStringExtra("message_id");
            }
            bundle1.putString("google.message_id", s4);
            Integer integer0 = cloudMessage0.X.hasExtra("google.product_id") ? cloudMessage0.X.getIntExtra("google.product_id", 0) : null;
            if(integer0 != null) {
                bundle1.putInt("google.product_id", ((int)integer0));
            }
            k k0 = k.f(a0.b);
            synchronized(k0) {
                v1 = k0.b;
                k0.b = 1 + v1;
            }
            k0.g(new j(v1, 3, bundle1, 0));
            return;
        }
        o6.k.d(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public void c(RemoteMessage remoteMessage0) {
    }

    public void d(String s) {
    }
}

