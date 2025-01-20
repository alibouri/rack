package o6;

import N5.r;

public final class i {
    public final p a;

    public i() {
        this.a = new p();
    }

    public final void a(Exception exception0) {
        this.a.n(exception0);
    }

    public final void b(Object object0) {
        this.a.o(object0);
    }

    public final boolean c(Exception exception0) {
        p p0 = this.a;
        p0.getClass();
        r.k(exception0, "Exception must not be null");
        synchronized(p0.a) {
            if(p0.c) {
                return false;
            }
            p0.c = true;
            p0.f = exception0;
        }
        p0.b.n(p0);
        return true;
    }

    public final void d(Object object0) {
        p p0 = this.a;
        synchronized(p0.a) {
            if(p0.c) {
                return;
            }
            p0.c = true;
            p0.e = object0;
        }
        p0.b.n(p0);
    }
}

