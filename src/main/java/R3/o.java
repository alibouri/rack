package r3;

import E3.d;
import E3.e;
import E5.g;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class o {
    public final LinkedHashSet a;
    public final LinkedHashSet b;
    public final Handler c;
    public volatile n d;
    public static final ExecutorService e;

    static {
        o.e = Executors.newCachedThreadPool(new e());
    }

    public o(Callable callable0) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        g g0 = new g(callable0);
        g0.Y = this;
        o.e.execute(g0);
    }

    public o(a a0) {
        this.a = new LinkedHashSet(1);
        this.b = new LinkedHashSet(1);
        this.c = new Handler(Looper.getMainLooper());
        this.d = null;
        this.e(new n(a0));
    }

    public final void a(m m0) {
        synchronized(this) {
            n n0 = this.d;
            if(n0 != null) {
                Throwable throwable0 = n0.b;
                if(throwable0 != null) {
                    m0.a(throwable0);
                }
            }
            this.b.add(m0);
        }
    }

    public final void b(m m0) {
        synchronized(this) {
            n n0 = this.d;
            if(n0 != null) {
                a a0 = n0.a;
                if(a0 != null) {
                    m0.a(a0);
                }
            }
            this.a.add(m0);
        }
    }

    public final void c(Throwable throwable0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList(this.b);
            if(arrayList0.isEmpty()) {
                d.c("Lottie encountered an error but no failure listener was added:", throwable0);
                return;
            }
            for(Object object0: arrayList0) {
                ((m)object0).a(throwable0);
            }
        }
    }

    public final void d() {
        n n0 = this.d;
        if(n0 == null) {
            return;
        }
        a a0 = n0.a;
        if(a0 != null) {
            synchronized(this) {
                for(Object object0: new ArrayList(this.a)) {
                    ((m)object0).a(a0);
                }
            }
            return;
        }
        this.c(n0.b);
    }

    public final void e(n n0) {
        if(this.d != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.d = n0;
        if(Looper.myLooper() == Looper.getMainLooper()) {
            this.d();
            return;
        }
        io.sentry.android.core.m m0 = new io.sentry.android.core.m(6, this);
        this.c.post(m0);
    }
}

