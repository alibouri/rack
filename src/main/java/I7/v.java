package I7;

import E7.n;
import L7.a;
import Z6.g;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class v {
    public volatile SharedPreferences a;
    public final ExecutorService b;
    public static final a c;
    public static v d;

    static {
        v.c = a.d();
    }

    public v(ExecutorService executorService0) {
        this.b = executorService0;
    }

    public static Context a() {
        try {
            g.c();
        }
        catch(IllegalStateException unused_ex) {
            return null;
        }
        g g0 = g.c();
        g0.a();
        return g0.a;
    }

    public static v b() {
        synchronized(v.class) {
            if(v.d == null) {
                v.d = new v(Executors.newSingleThreadExecutor());
            }
            return v.d;
        }
    }

    public final void c(Context context0) {
        synchronized(this) {
            if(this.a == null && context0 != null) {
                n n0 = new n(this, 3, context0);
                this.b.execute(n0);
            }
        }
    }

    public final void d(long v, String s) {
        if(this.a == null) {
            this.c(v.a());
            if(this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(s, v).apply();
    }

    public final void e(String s, double f) {
        if(this.a == null) {
            this.c(v.a());
            if(this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(s, Double.doubleToRawLongBits(f)).apply();
    }

    public final void f(String s, String s1) {
        if(this.a == null) {
            this.c(v.a());
            if(this.a == null) {
                return;
            }
        }
        if(s1 == null) {
            this.a.edit().remove(s).apply();
            return;
        }
        this.a.edit().putString(s, s1).apply();
    }

    public final void g(String s, boolean z) {
        if(this.a == null) {
            this.c(v.a());
            if(this.a == null) {
                return;
            }
        }
        this.a.edit().putBoolean(s, z).apply();
    }
}

