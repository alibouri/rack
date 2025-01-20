package z3;

import Y8.o;
import r3.j;
import t3.c;
import t3.q;
import y3.a;

public final class n implements b {
    public final String a;
    public final int b;
    public final a c;
    public final boolean d;

    public n(String s, int v, a a0, boolean z) {
        this.a = s;
        this.b = v;
        this.c = a0;
        this.d = z;
    }

    @Override  // z3.b
    public final c a(j j0, r3.a a0, A3.b b0) {
        return new q(j0, b0, this);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ShapePath{name=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", index=");
        return o.z(stringBuilder0, this.b, '}');
    }
}

