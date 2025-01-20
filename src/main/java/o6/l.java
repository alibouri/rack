package o6;

import java.util.concurrent.ExecutionException;

public final class l implements b, d, e {
    public final Object X;
    public final int Y;
    public final p Z;
    public int b0;
    public int c0;
    public int d0;
    public Exception e0;
    public boolean f0;

    public l(int v, p p0) {
        this.X = new Object();
        this.Y = v;
        this.Z = p0;
    }

    public final void a() {
        int v = this.Y;
        if(this.b0 + this.c0 + this.d0 == v) {
            p p0 = this.Z;
            if(this.e0 != null) {
                p0.n(new ExecutionException(this.c0 + " out of " + v + " underlying tasks failed", this.e0));
                return;
            }
            if(this.f0) {
                p0.p();
                return;
            }
            p0.o(null);
        }
    }

    @Override  // o6.b
    public final void h() {
        synchronized(this.X) {
            ++this.d0;
            this.f0 = true;
            this.a();
        }
    }

    @Override  // o6.e
    public final void k(Object object0) {
        synchronized(this.X) {
            ++this.b0;
            this.a();
        }
    }

    @Override  // o6.d
    public final void u(Exception exception0) {
        synchronized(this.X) {
            ++this.c0;
            this.e0 = exception0;
            this.a();
        }
    }
}

