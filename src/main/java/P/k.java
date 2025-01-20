package P;

import Aa.s;
import Bb.F;
import Fb.c;
import W5.f;
import a1.l;
import kotlin.coroutines.g;
import m0.b;
import y0.a;
import yc.d;

public final class k implements a {
    public final s X;
    public final i Y;
    public final boolean Z;

    public k(s s0, i i0, boolean z) {
        this.X = s0;
        this.Y = i0;
        this.Z = z;
    }

    @Override  // y0.a
    public final Object B(long v, g g0) {
        j j0;
        if(g0 instanceof j) {
            j0 = (j)g0;
            int v1 = j0.d0;
            if((v1 & 0x80000000) == 0) {
                j0 = new j(this, ((c)g0));
            }
            else {
                j0.d0 = v1 ^ 0x80000000;
            }
        }
        else {
            j0 = new j(this, ((c)g0));
        }
        Object object0 = j0.b0;
        Object object1 = Eb.a.X;
        switch(j0.d0) {
            case 0: {
                f.b0(object0);
                j0.d0 = 1;
                object0 = this.Y.j(new Float(l.c(v)), j0);
                return object0 == object1 ? object1 : new l(F.f(0.0f, ((Number)object0).floatValue()));
            }
            case 1: {
                f.b0(object0);
                return new l(F.f(0.0f, ((Number)object0).floatValue()));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // y0.a
    public final long Q(long v, long v1, int v2) {
        return !this.Z || v2 != 1 || b.e(v1) <= 0.0f ? 0L : d.d(0.0f, ((Number)this.X.n(b.e(v1))).floatValue());
    }

    @Override  // y0.a
    public final long e0(int v, long v1) {
        return !this.Z || v != 1 || b.e(v1) >= 0.0f ? 0L : d.d(0.0f, ((Number)this.X.n(b.e(v1))).floatValue());
    }

    @Override  // y0.a
    public final Object t(long v, long v1, g g0) {
        return new l(0L);
    }
}

