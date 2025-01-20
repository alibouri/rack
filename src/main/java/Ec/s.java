package Ec;

import Nb.j;

public abstract class s implements L {
    public final L X;

    public s(L l0) {
        j.f(l0, "delegate");
        super();
        this.X = l0;
    }

    @Override  // Ec.L
    public long M(Ec.j j0, long v) {
        j.f(j0, "sink");
        return this.X.M(j0, v);
    }

    @Override
    public void close() {
        this.X.close();
    }

    @Override  // Ec.L
    public final N timeout() {
        return this.X.timeout();
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + '(' + this.X + ')';
    }
}

