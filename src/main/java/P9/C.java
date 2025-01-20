package p9;

public final class c extends Fb.c {
    public Object b0;
    public final d c0;
    public int d0;

    public c(d d0, Fb.c c0) {
        this.c0 = d0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.b0 = object0;
        this.d0 |= 0x80000000;
        return this.c0.z(null, null, this);
    }
}

