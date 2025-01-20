package L;

import Bb.z;
import C3.i;
import Nb.j;
import Nb.k;
import O0.K;
import O0.L;
import O0.O;
import O0.f;
import O0.s;
import a1.a;
import androidx.compose.ui.text.font.FontFamily.Resolver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import n0.v;
import n0.w;

public final class o extends k implements Function1 {
    public final int X;
    public final p Y;

    public o(p p0, int v) {
        this.X = v;
        this.Y = p0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object1;
        switch(this.X) {
            case 0: {
                e e0 = this.Y.x0();
                w w0 = this.Y.s0;
                O o0 = O.e(this.Y.m0, (w0 == null ? v.i : w0.a()), 0L, null, null, null, 0L, null, 0, 0L, 0xFFFFFE);
                LayoutDirection layoutDirection0 = e0.o;
                if(layoutDirection0 == null) {
                    object1 = null;
                }
                else {
                    Density density0 = e0.i;
                    if(density0 == null) {
                        object1 = null;
                    }
                    else {
                        f f0 = new f(6, e0.a, null);
                        if(e0.j == null || e0.n == null) {
                            object1 = null;
                        }
                        else {
                            long v = a.a(e0.p, 0, 0, 0, 0, 10);
                            FontFamily.Resolver fontFamily$Resolver0 = e0.c;
                            object1 = new L(new K(f0, o0, z.X, e0.f, e0.e, e0.d, density0, layoutDirection0, fontFamily$Resolver0, v), new s(new i(f0, o0, z.X, density0, fontFamily$Resolver0), v, e0.f, e0.d == 2), e0.l);
                        }
                    }
                }
                if(object1 != null) {
                    ((List)object0).add(object1);
                    return object1 == null ? Boolean.valueOf(false) : Boolean.valueOf(true);
                }
                return Boolean.valueOf(false);
            }
            case 1: {
                String s = ((f)object0).X;
                p p1 = this.Y;
                n n1 = p1.w0;
                if(n1 == null) {
                    n n2 = new n(p1.l0, s);
                    e e2 = new e(s, p1.m0, p1.n0, p1.o0, p1.p0, p1.q0, p1.r0);
                    e2.c(p1.x0().i);
                    n2.d = e2;
                    p1.w0 = n2;
                }
                else if(!j.a(s, n1.b)) {
                    n1.b = s;
                    e e1 = n1.d;
                    if(e1 != null) {
                        e1.a = s;
                        e1.b = p1.m0;
                        e1.c = p1.n0;
                        e1.d = p1.o0;
                        e1.e = p1.p0;
                        e1.f = p1.q0;
                        e1.g = p1.r0;
                        e1.j = null;
                        e1.n = null;
                        e1.o = null;
                        e1.q = -1;
                        e1.r = -1;
                        e1.p = W5.f.u(0, 0, 0, 0);
                        e1.l = io.sentry.config.a.d(0, 0);
                        e1.k = false;
                    }
                }
                F0.f.p(p1);
                F0.f.o(p1);
                F0.f.n(p1);
                return Boolean.TRUE;
            }
            default: {
                boolean z = ((Boolean)object0).booleanValue();
                p p0 = this.Y;
                n n0 = p0.w0;
                if(n0 == null) {
                    return Boolean.FALSE;
                }
                n0.c = z;
                F0.f.p(p0);
                F0.f.o(p0);
                F0.f.n(p0);
                return Boolean.TRUE;
            }
        }
    }
}

