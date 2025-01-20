package W3;

import Ec.L;
import Ec.N;
import m5.b;

public final class i implements L {
    public final j X;

    public i(j j0) {
        this.X = j0;
    }

    @Override  // Ec.L
    public final long M(Ec.j j0, long v) {
        Nb.j.f(j0, "sink");
        if(v < 0L) {
            throw new IllegalArgumentException(b.t(v, "byteCount < 0: ").toString());
        }
        j j1 = this.X;
        if(!Nb.j.a(j1.e0, this)) {
            throw new IllegalStateException("closed");
        }
        long v1 = j1.a(v);
        return v1 == 0L ? -1L : j1.X.M(j0, v1);
    }

    @Override
    public final void close() {
        j j0 = this.X;
        if(Nb.j.a(j0.e0, this)) {
            j0.e0 = null;
        }
    }

    @Override  // Ec.L
    public final N timeout() {
        return this.X.X.timeout();
    }
}

