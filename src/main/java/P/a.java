package p;

import J2.w;
import android.os.Looper;
import n2.b;

public final class a extends w {
    public final c a;
    public static volatile a b;
    public static final b c;
    public static final b d;

    static {
        a.c = new b(1);
        a.d = new b(2);
    }

    public a() {
        this.a = new c();
    }

    public static a V() {
        if(a.b != null) {
            return a.b;
        }
        synchronized(a.class) {
            if(a.b == null) {
                a.b = new a();
            }
            return a.b;
        }
    }

    public final void W(Runnable runnable0) {
        c c0 = this.a;
        if(c0.c == null) {
            synchronized(c0.a) {
                if(c0.c == null) {
                    c0.c = c.V(Looper.getMainLooper());
                }
            }
        }
        c0.c.post(runnable0);
    }
}

