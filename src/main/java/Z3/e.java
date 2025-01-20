package z3;

import java.util.ArrayList;
import r3.j;
import t3.c;
import t3.i;
import y3.a;

public final class e implements b {
    public final int a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final y3.b f;
    public final int g;
    public final int h;
    public final float i;
    public final ArrayList j;
    public final y3.b k;
    public final boolean l;

    public e(String s, int v, a a0, a a1, a a2, a a3, y3.b b0, int v1, int v2, float f, ArrayList arrayList0, y3.b b1, boolean z) {
        this.a = v;
        this.b = a0;
        this.c = a1;
        this.d = a2;
        this.e = a3;
        this.f = b0;
        this.g = v1;
        this.h = v2;
        this.i = f;
        this.j = arrayList0;
        this.k = b1;
        this.l = z;
    }

    @Override  // z3.b
    public final c a(j j0, r3.a a0, A3.b b0) {
        return new i(j0, b0, this);
    }
}

