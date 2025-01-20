package E7;

import J2.w;
import J5.a;
import J5.j;
import J5.k;
import M6.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import o6.p;

public final class q implements Runnable {
    public final int X;
    public final FirebaseMessaging Y;

    public q(FirebaseMessaging firebaseMessaging0, int v) {
        this.X = v;
        this.Y = firebaseMessaging0;
        super();
    }

    private final void a() {
        FirebaseMessaging firebaseMessaging0 = this.Y;
        if(firebaseMessaging0.e.i() && firebaseMessaging0.l(firebaseMessaging0.g())) {
            synchronized(firebaseMessaging0) {
                if(!firebaseMessaging0.i) {
                    firebaseMessaging0.k(0L);
                }
            }
        }
    }

    @Override
    public final void run() {
        int v;
        p p0;
        if(this.X != 0) {
            FirebaseMessaging firebaseMessaging0 = this.Y;
            Context context0 = firebaseMessaging0.b;
            w.K(context0);
            boolean z = firebaseMessaging0.j();
            if(Build.VERSION.SDK_INT >= 29) {
                SharedPreferences sharedPreferences0 = b.F(context0);
                if(!sharedPreferences0.contains("proxy_retention") || sharedPreferences0.getBoolean("proxy_retention", false) != z) {
                    a a0 = (a)firebaseMessaging0.c.d;
                    if(a0.c.e() >= 241100000) {
                        Bundle bundle0 = new Bundle();
                        bundle0.putBoolean("proxy_retention", z);
                        k k0 = k.f(a0.b);
                        synchronized(k0) {
                            v = k0.b;
                            k0.b = v + 1;
                        }
                        p0 = k0.g(new j(v, 4, bundle0, 0));
                    }
                    else {
                        p0 = o6.k.d(new IOException("SERVICE_NOT_AVAILABLE"));
                    }
                    p0.c(new n2.b(0), new A(context0, z));
                }
            }
            if(firebaseMessaging0.j()) {
                firebaseMessaging0.h();
            }
            return;
        }
        this.a();
    }
}

