package c8;

import Ab.t;
import Eb.a;
import Fb.c;
import Nb.j;
import T1.h;
import W1.b;
import W1.e;
import W1.g;
import Xb.J;
import android.util.Log;
import java.io.IOException;

public final class n {
    public final h a;
    public f b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;

    static {
        n.c = new e("firebase_sessions_enabled");
        n.d = new e("firebase_sessions_sampling_rate");
        n.e = new e("firebase_sessions_restart_timeout");
        n.f = new e("firebase_sessions_cache_duration");
        n.g = new e("firebase_sessions_cache_updated_time");
    }

    public n(h h0) {
        this.a = h0;
        J.u(new k(this, null));
    }

    public static final void a(n n0, b b0) {
        n0.getClass();
        n0.b = new f(((Boolean)b0.a(n.c)), ((Double)b0.a(n.d)), ((Integer)b0.a(n.e)), ((Integer)b0.a(n.f)), ((Long)b0.a(n.g)));
    }

    public final boolean b() {
        f f0 = this.b;
        if(f0 != null) {
            return f0.e == null || (f0.d == null || (System.currentTimeMillis() - ((long)f0.e)) / 1000L >= ((long)(((int)f0.d))));
        }
        j.p("sessionConfigs");
        throw null;
    }

    public final Object c(e e0, Object object0, c c0) {
        l l0;
        if(c0 instanceof l) {
            l0 = (l)c0;
            int v = l0.d0;
            if((v & 0x80000000) == 0) {
                l0 = new l(this, c0);
            }
            else {
                l0.d0 = v ^ 0x80000000;
            }
        }
        else {
            l0 = new l(this, c0);
        }
        Object object1 = l0.b0;
        Object object2 = a.X;
        switch(l0.d0) {
            case 0: {
                W5.f.b0(object1);
                try {
                    m m0 = new m(object0, e0, this, null);
                    l0.d0 = 1;
                    g g0 = new g(m0, null);
                    if(this.a.a(g0, l0) == object2) {
                        return object2;
                    }
                }
                catch(IOException iOException0) {
                    Log.w("SettingsCache", "Failed to update cache config value: " + iOException0);
                }
                return t.a;
            }
            case 1: {
                try {
                    W5.f.b0(object1);
                }
                catch(IOException iOException0) {
                    Log.w("SettingsCache", "Failed to update cache config value: " + iOException0);
                }
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

