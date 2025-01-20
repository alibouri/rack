package z3;

import r3.j;
import t3.c;
import t3.n;
import t3.o;
import y3.a;
import y3.d;
import y3.e;

public final class i implements b {
    public final int a;
    public final y3.b b;
    public final boolean c;
    public final e d;
    public final Object e;

    public i(String s, y3.b b0, y3.b b1, d d0, boolean z) {
        this.a = 1;
        super();
        this.b = b0;
        this.d = b1;
        this.e = d0;
        this.c = z;
    }

    public i(String s, e e0, a a0, y3.b b0, boolean z) {
        this.a = 0;
        super();
        this.d = e0;
        this.e = a0;
        this.b = b0;
        this.c = z;
    }

    @Override  // z3.b
    public final c a(j j0, r3.a a0, A3.b b0) {
        return this.a != 0 ? new o(j0, b0, this) : new n(j0, b0, this);
    }

    @Override
    public String toString() {
        return this.a == 0 ? "RectangleShape{position=" + this.d + ", size=" + ((a)this.e) + '}' : super.toString();
    }
}

