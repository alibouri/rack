package b4;

import U5.a;

public final class z0 extends a {
    public float c;
    public final A0 d;

    public z0(A0 a00) {
        this.d = a00;
        this.c = 0.0f;
    }

    @Override  // U5.a
    public final void I(String s) {
        float f = this.c;
        this.c = ((y0)this.d.d).d.measureText(s) + f;
    }
}

