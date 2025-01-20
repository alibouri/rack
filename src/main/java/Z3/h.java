package z3;

import r3.a;
import r3.j;
import t3.c;
import t3.m;
import y3.e;

public final class h implements b {
    public final int a;
    public final y3.b b;
    public final e c;
    public final y3.b d;
    public final y3.b e;
    public final y3.b f;
    public final y3.b g;
    public final y3.b h;
    public final boolean i;
    public final boolean j;

    public h(String s, int v, y3.b b0, e e0, y3.b b1, y3.b b2, y3.b b3, y3.b b4, y3.b b5, boolean z, boolean z1) {
        this.a = v;
        this.b = b0;
        this.c = e0;
        this.d = b1;
        this.e = b2;
        this.f = b3;
        this.g = b4;
        this.h = b5;
        this.i = z;
        this.j = z1;
    }

    @Override  // z3.b
    public final c a(j j0, a a0, A3.b b0) {
        return new m(j0, b0, this);
    }
}

