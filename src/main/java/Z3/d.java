package z3;

import android.graphics.Path.FillType;
import r3.j;
import t3.c;
import t3.h;
import y3.a;

public final class d implements b {
    public final int a;
    public final Path.FillType b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final boolean g;

    public d(String s, int v, Path.FillType path$FillType0, a a0, a a1, a a2, a a3, boolean z) {
        this.a = v;
        this.b = path$FillType0;
        this.c = a0;
        this.d = a1;
        this.e = a2;
        this.f = a3;
        this.g = z;
    }

    @Override  // z3.b
    public final c a(j j0, r3.a a0, A3.b b0) {
        return new h(j0, a0, b0, this);
    }
}

