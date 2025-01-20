package z3;

import java.util.ArrayList;
import r3.j;
import t3.c;
import t3.r;
import y3.a;

public final class o implements b {
    public final y3.b a;
    public final ArrayList b;
    public final a c;
    public final a d;
    public final y3.b e;
    public final int f;
    public final int g;
    public final float h;
    public final boolean i;

    public o(String s, y3.b b0, ArrayList arrayList0, a a0, a a1, y3.b b1, int v, int v1, float f, boolean z) {
        this.a = b0;
        this.b = arrayList0;
        this.c = a0;
        this.d = a1;
        this.e = b1;
        this.f = v;
        this.g = v1;
        this.h = f;
        this.i = z;
    }

    @Override  // z3.b
    public final c a(j j0, r3.a a0, A3.b b0) {
        return new r(j0, b0, this);
    }
}

