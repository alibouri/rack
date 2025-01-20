package q9;

import Ab.t;
import Fb.j;
import Mb.g;
import W5.f;
import f9.b;

public final class p extends j implements g {
    public boolean c0;
    public boolean d0;
    public int e0;
    public int f0;
    public String g0;

    public p(kotlin.coroutines.g g0) {
        super(6, g0);
    }

    @Override  // Mb.g
    public final Object f(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5) {
        int v = ((Number)object2).intValue();
        int v1 = ((Number)object3).intValue();
        p p0 = new p(((kotlin.coroutines.g)object5));
        p0.c0 = ((Boolean)object0).booleanValue();
        p0.d0 = ((Boolean)object1).booleanValue();
        p0.e0 = v;
        p0.f0 = v1;
        p0.g0 = (String)object4;
        return p0.v(t.a);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        return new b(this.e0, this.f0, this.g0, this.c0, this.d0);
    }
}

