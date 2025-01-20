package z3;

import r3.a;
import r3.j;
import t3.c;
import t3.s;

public final class p implements b {
    public final int a;
    public final y3.b b;
    public final y3.b c;
    public final y3.b d;
    public final boolean e;

    public p(String s, int v, y3.b b0, y3.b b1, y3.b b2, boolean z) {
        this.a = v;
        this.b = b0;
        this.c = b1;
        this.d = b2;
        this.e = z;
    }

    @Override  // z3.b
    public final c a(j j0, a a0, A3.b b0) {
        return new s(b0, this);
    }

    @Override
    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}

