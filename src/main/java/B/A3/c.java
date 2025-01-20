package a3;

import c3.m;
import hc.i;

public final class c implements h {
    public final l a;
    public final i b;

    public c(int v, l l0) {
        this.a = l0;
        this.b = new i(v, 0);
    }

    @Override  // a3.h
    public final a3.i a(m m0, i3.m m1) {
        return new e(m0.a, m1, this.b, this.a);
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof c;
    }

    @Override
    public final int hashCode() {
        return c.class.hashCode();
    }
}

