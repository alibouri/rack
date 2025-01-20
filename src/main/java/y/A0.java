package y;

import Fb.c;

public final class a0 extends c {
    public f0 b0;
    public Object c0;
    public final f0 d0;
    public int e0;

    public a0(f0 f00, c c0) {
        this.d0 = f00;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.c0 = object0;
        this.e0 |= 0x80000000;
        return f0.A0(this.d0, this);
    }
}

