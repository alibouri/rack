package D0;

public final class e0 {
    public final h0 a;
    public G b;
    public final d0 c;
    public final d0 d;
    public final d0 e;

    public e0(h0 h00) {
        this.a = h00;
        this.c = new d0(this, 2);
        this.d = new d0(this, 0);
        this.e = new d0(this, 1);
    }

    public final G a() {
        G g0 = this.b;
        if(g0 == null) {
            throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
        }
        return g0;
    }
}

