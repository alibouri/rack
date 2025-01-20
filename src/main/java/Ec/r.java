package Ec;

import Nb.j;

public abstract class r implements J {
    public final J X;

    public r(J j0) {
        j.f(j0, "delegate");
        super();
        this.X = j0;
    }

    @Override  // Ec.J
    public void close() {
        this.X.close();
    }

    @Override  // Ec.J
    public void flush() {
        this.X.flush();
    }

    @Override  // Ec.J
    public final N timeout() {
        return this.X.timeout();
    }

    @Override
    public final String toString() {
        return this.getClass().getSimpleName() + '(' + this.X + ')';
    }

    @Override  // Ec.J
    public void write(Ec.j j0, long v) {
        j.f(j0, "source");
        this.X.write(j0, v);
    }
}

