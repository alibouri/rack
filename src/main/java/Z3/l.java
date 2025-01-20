package z3;

import android.graphics.Path.FillType;
import r3.j;
import t3.c;
import t3.g;
import y3.a;

public final class l implements b {
    public final boolean a;
    public final Path.FillType b;
    public final a c;
    public final a d;
    public final boolean e;

    public l(String s, boolean z, Path.FillType path$FillType0, a a0, a a1, boolean z1) {
        this.a = z;
        this.b = path$FillType0;
        this.c = a0;
        this.d = a1;
        this.e = z1;
    }

    @Override  // z3.b
    public final c a(j j0, r3.a a0, A3.b b0) {
        return new g(j0, b0, this);
    }

    @Override
    public final String toString() {
        return m5.b.z(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}

