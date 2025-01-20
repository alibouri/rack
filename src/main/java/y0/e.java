package y0;

import Fb.c;

public final class e extends c {
    public f b0;
    public long c0;
    public Object d0;
    public final f e0;
    public int f0;

    public e(f f0, c c0) {
        this.e0 = f0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.B(0L, this);
    }
}

