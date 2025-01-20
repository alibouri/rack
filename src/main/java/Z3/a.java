package z3;

import r3.j;
import t3.c;
import t3.f;
import y3.e;

public final class a implements b {
    public final e a;
    public final y3.a b;
    public final boolean c;
    public final boolean d;

    public a(String s, e e0, y3.a a0, boolean z, boolean z1) {
        this.a = e0;
        this.b = a0;
        this.c = z;
        this.d = z1;
    }

    @Override  // z3.b
    public final c a(j j0, r3.a a0, A3.b b0) {
        return new f(j0, b0, this);
    }
}

