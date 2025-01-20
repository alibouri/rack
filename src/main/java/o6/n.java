package o6;

import j6.z0;
import java.util.concurrent.Executor;
import o.e0;

public final class n implements b, d, e, o {
    public final int X;
    public final Executor Y;
    public final Object Z;
    public final Object b0;

    public n(Executor executor0, b b0) {
        this.X = 0;
        super();
        this.Z = new Object();
        this.Y = executor0;
        this.b0 = b0;
    }

    public n(Executor executor0, c c0) {
        this.X = 1;
        super();
        this.Z = new Object();
        this.Y = executor0;
        this.b0 = c0;
    }

    public n(Executor executor0, d d0) {
        this.X = 2;
        super();
        this.Z = new Object();
        this.Y = executor0;
        this.b0 = d0;
    }

    public n(Executor executor0, e e0) {
        this.X = 3;
        super();
        this.Z = new Object();
        this.Y = executor0;
        this.b0 = e0;
    }

    public n(Executor executor0, g g0, p p0) {
        this.X = 4;
        super();
        this.Y = executor0;
        this.Z = g0;
        this.b0 = p0;
    }

    @Override  // o6.o
    public final void a(h h0) {
        switch(this.X) {
            case 0: {
                if(((p)h0).d) {
                    Object object0 = this.Z;
                    synchronized(object0) {
                        if(((b)this.b0) == null) {
                            return;
                        }
                    }
                    e0 e00 = new e0(2, this);
                    this.Y.execute(e00);
                }
                return;
            }
            case 1: {
                this.b(h0);
                return;
            }
            case 2: {
                this.c(h0);
                return;
            }
            case 3: {
                this.d(h0);
                return;
            }
            default: {
                z0 z00 = new z0(16, this, h0, false);
                this.Y.execute(z00);
            }
        }
    }

    private final void b(h h0) {
        synchronized(this.Z) {
        }
        z0 z00 = new z0(13, this, h0, false);
        this.Y.execute(z00);
    }

    private final void c(h h0) {
        if(!h0.h() && !((p)h0).d) {
            Object object0 = this.Z;
            synchronized(object0) {
                if(((d)this.b0) == null) {
                    return;
                }
            }
            z0 z00 = new z0(14, this, h0, false);
            this.Y.execute(z00);
        }
    }

    private final void d(h h0) {
        if(h0.h()) {
            Object object0 = this.Z;
            synchronized(object0) {
                if(((e)this.b0) == null) {
                    return;
                }
            }
            z0 z00 = new z0(15, this, h0, false);
            this.Y.execute(z00);
        }
    }

    @Override  // o6.b
    public void h() {
        ((p)this.b0).p();
    }

    @Override  // o6.e
    public void k(Object object0) {
        ((p)this.b0).o(object0);
    }

    @Override  // o6.d
    public void u(Exception exception0) {
        ((p)this.b0).n(exception0);
    }
}

