package Z;

public final class p extends n {
    public final h b0;

    public p(h h0) {
        this.b0 = h0;
    }

    @Override
    public final Object next() {
        int v = this.Z;
        this.Z = v + 2;
        return new b(this.b0, this.X[v], this.X[v + 1]);
    }
}

