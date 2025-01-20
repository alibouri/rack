package z3;

import java.util.Arrays;
import java.util.List;
import r3.a;
import r3.j;
import t3.c;
import t3.d;

public final class m implements b {
    public final String a;
    public final List b;
    public final boolean c;

    public m(String s, List list0, boolean z) {
        this.a = s;
        this.b = list0;
        this.c = z;
    }

    @Override  // z3.b
    public final c a(j j0, a a0, A3.b b0) {
        return new d(j0, b0, this, a0);
    }

    @Override
    public final String toString() {
        return "ShapeGroup{name=\'" + this.a + "\' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}

