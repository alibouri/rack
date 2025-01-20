package L;

import Nb.j;
import Nb.k;
import O0.K;
import O0.L;
import O0.O;
import O0.f;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import java.util.List;
import kotlin.jvm.functions.Function1;
import n0.v;

public final class l extends k implements Function1 {
    public final int X;
    public final m Y;

    public l(m m0, int v) {
        this.X = v;
        this.Y = m0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        switch(this.X) {
            case 0: {
                m m1 = this.Y;
                L l0 = m1.y0().n;
                if(l0 != null) {
                    O o0 = m1.m0;
                    long v = m1.w0 == null ? v.i : m1.w0.a();
                    new K(l0.a.a, O.e(o0, v, 0L, null, null, null, 0L, null, 0, 0L, 0xFFFFFE), l0.a.c, l0.a.d, l0.a.e, l0.a.f, l0.a.g, l0.a.h, l0.a.i, l0.a.j);
                    L l1 = new L(null, l0.b, l0.c);
                    ((List)object0).add(l1);
                    return l1 == null ? Boolean.valueOf(false) : Boolean.valueOf(true);
                }
                return Boolean.valueOf(false);
            }
            case 1: {
                m m2 = this.Y;
                L.k k2 = m2.B0;
                if(k2 == null) {
                    L.k k3 = new L.k(m2.l0, ((f)object0));
                    d d1 = new d(((f)object0), m2.m0, m2.n0, m2.p0, m2.q0, m2.r0, m2.s0, m2.t0);
                    d1.c(m2.y0().k);
                    k3.d = d1;
                    m2.B0 = k3;
                }
                else if(!j.a(((f)object0), k2.b)) {
                    k2.b = (f)object0;
                    d d0 = k2.d;
                    if(d0 != null) {
                        O o1 = m2.m0;
                        FontFamily.Resolver fontFamily$Resolver0 = m2.n0;
                        int v1 = m2.p0;
                        boolean z1 = m2.q0;
                        int v2 = m2.r0;
                        int v3 = m2.s0;
                        List list0 = m2.t0;
                        d0.a = (f)object0;
                        d0.b = o1;
                        d0.c = fontFamily$Resolver0;
                        d0.d = v1;
                        d0.e = z1;
                        d0.f = v2;
                        d0.g = v3;
                        d0.h = list0;
                        d0.l = null;
                        d0.n = null;
                        d0.p = -1;
                        d0.o = -1;
                    }
                }
                F0.f.p(m2);
                F0.f.o(m2);
                F0.f.n(m2);
                return Boolean.TRUE;
            }
            default: {
                boolean z = ((Boolean)object0).booleanValue();
                m m0 = this.Y;
                L.k k0 = m0.B0;
                if(k0 == null) {
                    return Boolean.FALSE;
                }
                Function1 function10 = m0.x0;
                if(function10 != null) {
                    function10.n(k0);
                }
                L.k k1 = m0.B0;
                if(k1 != null) {
                    k1.c = z;
                }
                F0.f.p(m0);
                F0.f.o(m0);
                F0.f.n(m0);
                return Boolean.TRUE;
            }
        }
    }
}

