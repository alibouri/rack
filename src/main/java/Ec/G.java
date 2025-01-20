package Ec;

public final class g implements J {
    @Override  // Ec.J
    public final void close() {
    }

    @Override  // Ec.J
    public final void flush() {
    }

    @Override  // Ec.J
    public final N timeout() {
        return N.d;
    }

    @Override  // Ec.J
    public final void write(j j0, long v) {
        Nb.j.f(j0, "source");
        j0.skip(v);
    }
}

