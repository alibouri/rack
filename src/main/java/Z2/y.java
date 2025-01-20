package Z2;

import Ab.t;
import D0.j;
import U.p;
import a1.a;
import c0.b;
import g0.c;
import j3.i;
import kotlin.jvm.functions.Function3;

public final class y implements Function3 {
    public final i X;
    public final b Y;
    public final n Z;
    public final c b0;
    public final j c0;
    public final float d0;
    public final n0.n e0;
    public final boolean f0;

    public y(i i0, b b0, n n0, c c0, j j0, float f, n0.n n1, boolean z) {
        this.X = i0;
        this.Y = b0;
        this.Z = n0;
        this.b0 = c0;
        this.c0 = j0;
        this.d0 = f;
        this.e0 = n1;
        this.f0 = z;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 14) == 0) {
            v |= (((p)object1).f(((B.y)object0)) ? 4 : 2);
        }
        if((v & 91) == 18 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        a a0 = new a(((B.y)object0).b);
        ((q)this.X).X.getClass();
        ((q)this.X).X.l(null, a0);
        v v1 = new v(((B.y)object0), this.Z, this.b0, this.c0, this.d0, this.e0, this.f0);
        this.Y.h(v1, ((p)object1), 0);
        return t.a;
    }
}

