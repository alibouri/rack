package a3;

import Fb.c;
import hc.i;

public final class d extends c {
    public Object b0;
    public i c0;
    public Object d0;
    public final e e0;
    public int f0;

    public d(e e0, c c0) {
        this.e0 = e0;
        super(c0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        this.d0 = object0;
        this.f0 |= 0x80000000;
        return this.e0.a(this);
    }
}

