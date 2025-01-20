package d3;

import Ab.t;
import Eb.a;
import Fb.j;
import Nb.w;
import W5.f;
import Xb.G;
import Y2.b;
import Y2.c;
import c3.m;
import i3.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class d extends j implements Function2 {
    public int c0;
    public final h d0;
    public final w e0;
    public final w f0;
    public final i g0;
    public final Object h0;
    public final w i0;
    public final c j0;

    public d(h h0, w w0, w w1, i i0, Object object0, w w2, c c0, g g0) {
        this.d0 = h0;
        this.e0 = w0;
        this.f0 = w1;
        this.g0 = i0;
        this.h0 = object0;
        this.i0 = w2;
        this.j0 = c0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new d(this.d0, this.e0, this.f0, this.g0, this.h0, this.i0, this.j0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.c0 = 1;
                object0 = h.a(this.d0, ((m)this.e0.X), ((b)this.f0.X), this.g0, this.h0, ((i3.m)this.i0.X), this.j0, this);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

