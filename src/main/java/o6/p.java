package o6;

import N5.r;
import R9.V0;
import d6.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class p extends h {
    public final Object a;
    public final a b;
    public boolean c;
    public volatile boolean d;
    public Object e;
    public Exception f;

    public p() {
        this.a = new Object();
        this.b = new a(4);
    }

    @Override  // o6.h
    public final p a(Executor executor0, b b0) {
        n n0 = new n(executor0, b0);
        this.b.m(n0);
        this.r();
        return this;
    }

    @Override  // o6.h
    public final p b(Executor executor0, d d0) {
        n n0 = new n(executor0, d0);
        this.b.m(n0);
        this.r();
        return this;
    }

    @Override  // o6.h
    public final p c(Executor executor0, e e0) {
        n n0 = new n(executor0, e0);
        this.b.m(n0);
        this.r();
        return this;
    }

    @Override  // o6.h
    public final p d(Executor executor0, o6.a a0) {
        p p0 = new p();
        m m0 = new m(executor0, a0, p0, 1);
        this.b.m(m0);
        this.r();
        return p0;
    }

    @Override  // o6.h
    public final Exception e() {
        synchronized(this.a) {
        }
        return this.f;
    }

    @Override  // o6.h
    public final Object f() {
        synchronized(this.a) {
            r.l("Task is not yet complete", this.c);
            if(!this.d) {
                Exception exception0 = this.f;
                if(exception0 != null) {
                    throw new f(exception0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                }
                return this.e;
            }
        }
        throw new CancellationException("Task is already canceled.");
    }

    @Override  // o6.h
    public final boolean g() {
        synchronized(this.a) {
        }
        return this.c;
    }

    @Override  // o6.h
    public final boolean h() {
        boolean z = false;
        synchronized(this.a) {
            if(this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    public final p i(Executor executor0, c c0) {
        n n0 = new n(executor0, c0);
        this.b.m(n0);
        this.r();
        return this;
    }

    public final p j(c c0) {
        n n0 = new n(j.a, c0);
        this.b.m(n0);
        this.r();
        return this;
    }

    public final p k(d d0) {
        this.b(j.a, d0);
        return this;
    }

    public final p l(Executor executor0, o6.a a0) {
        p p0 = new p();
        m m0 = new m(executor0, a0, p0, 0);
        this.b.m(m0);
        this.r();
        return p0;
    }

    public final p m(Executor executor0, g g0) {
        p p0 = new p();
        n n0 = new n(executor0, g0, p0);
        this.b.m(n0);
        this.r();
        return p0;
    }

    public final void n(Exception exception0) {
        r.k(exception0, "Exception must not be null");
        synchronized(this.a) {
            this.q();
            this.c = true;
            this.f = exception0;
        }
        this.b.n(this);
    }

    public final void o(Object object0) {
        synchronized(this.a) {
            this.q();
            this.c = true;
            this.e = object0;
        }
        this.b.n(this);
    }

    public final void p() {
        synchronized(this.a) {
            if(this.c) {
                return;
            }
            this.c = true;
            this.d = true;
        }
        this.b.n(this);
    }

    public final void q() {
        IllegalStateException illegalStateException0;
        String s;
        if(this.c) {
            if(this.g()) {
                Exception exception0 = this.e();
                if(exception0 != null) {
                    s = "failure";
                }
                else if(this.h()) {
                    s = "result " + this.f();
                }
                else if(this.d) {
                    s = "cancellation";
                }
                else {
                    s = "unknown issue";
                }
                illegalStateException0 = new V0("Complete with: " + s, exception0);  // initializer: Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            else {
                illegalStateException0 = new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            throw illegalStateException0;
        }
    }

    public final void r() {
        synchronized(this.a) {
            if(!this.c) {
                return;
            }
        }
        this.b.n(this);
    }
}

