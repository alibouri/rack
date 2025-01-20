package ka;

public final class c extends Fb.c {
    public g b0;
    public Object c0;
    public final g d0;
    public int e0;

    public c(g g0, Fb.c c0) {
        this.d0 = g0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return this.d0.a(this);
    }
}

