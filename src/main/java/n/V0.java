package N;

import Ab.t;
import B.m0;
import B.r;
import B.y;
import D0.K;
import F0.i;
import F0.j;
import G0.f0;
import G0.k0;
import Nb.k;
import U.H;
import U.O0;
import U.Z;
import U.d;
import U.l;
import U.p;
import a1.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c0.b;
import com.google.android.gms.internal.measurement.E1;
import dc.e;
import g0.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import n0.S;
import y.g0;

public final class v0 extends k implements Function3 {
    public final C0 X;
    public final boolean Y;
    public final e Z;
    public final long b0;
    public final S c0;
    public final long d0;
    public final long e0;
    public final float f0;
    public final b g0;
    public final Function3 h0;

    public v0(C0 c00, boolean z, e e0, long v, S s0, long v1, long v2, float f, b b0, Function3 function30) {
        this.X = c00;
        this.Y = z;
        this.Z = e0;
        this.b0 = v;
        this.c0 = s0;
        this.d0 = v1;
        this.e0 = v2;
        this.f0 = f;
        this.g0 = b0;
        this.h0 = function30;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((p)object1).f(((y)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        long v1 = ((y)object0).b;
        if(!a.d(v1)) {
            throw new IllegalStateException("Drawer shouldn\'t have infinite width");
        }
        float f = -((float)a.h(v1));
        O0 o00 = f0.f;
        Density density0 = (Density)((p)object1).k(o00);
        C0 c00 = this.X;
        boolean z = ((p)object1).f(c00);
        boolean z1 = ((p)object1).f(density0);
        boolean z2 = ((p)object1).c(f);
        Object object3 = ((p)object1).G();
        Z z3 = l.a;
        if((z | z1 | z2) != 0 || object3 == z3) {
            object3 = new q0(c00, density0, f);
            ((p)object1).a0(object3);
        }
        H.g(((Function0)object3), ((p)object1));
        boolean z4 = ((p)object1).k(f0.l) == LayoutDirection.Y;
        g0.l l0 = g0.l.X;
        boolean z5 = c00.a.i.getValue() != null;
        h h0 = new h(c00.a, null, 0);
        Modifier modifier0 = g0.a(l0, ((E1)c00.a.n), y.q0.Y, this.Y, null, z5, h0, z4, 0x20);
        g g0 = g0.b.a;
        K k0 = r.e(g0, false);
        int v2 = ((p)object1).P;
        U.g0 g00 = ((p)object1).m();
        Modifier modifier1 = g0.a.d(((p)object1), modifier0);
        F0.k.a.getClass();
        i i0 = j.b;
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        F0.h h1 = j.f;
        d.K(((p)object1), k0, h1);
        F0.h h2 = j.e;
        d.K(((p)object1), g00, h2);
        F0.h h3 = j.g;
        if(((p)object1).O || !Nb.j.a(((p)object1).G(), v2)) {
            m5.b.F(v2, ((p)object1), v2, h3);
        }
        F0.h h4 = j.d;
        d.K(((p)object1), modifier1, h4);
        K k1 = r.e(g0, false);
        int v3 = ((p)object1).P;
        U.g0 g01 = ((p)object1).m();
        Modifier modifier2 = g0.a.d(((p)object1), l0);
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        d.K(((p)object1), k1, h1);
        d.K(((p)object1), g01, h2);
        if(((p)object1).O || !Nb.j.a(((p)object1).G(), v3)) {
            m5.b.F(v3, ((p)object1), v3, h3);
        }
        d.K(((p)object1), modifier2, h4);
        this.g0.j(((p)object1), 0);
        ((p)object1).p(true);
        boolean z6 = ((D0)c00.a.d.getValue()) == D0.Y;
        boolean z7 = this.Y;
        boolean z8 = ((p)object1).g(z7);
        boolean z9 = ((p)object1).f(c00);
        e e0 = this.Z;
        boolean z10 = ((p)object1).h(e0);
        Object object4 = ((p)object1).G();
        if((z8 | z9 | z10) != 0 || object4 == z3) {
            object4 = new k0(2, c00, e0, z7);
            ((p)object1).a0(object4);
        }
        boolean z11 = ((p)object1).c(f);
        boolean z12 = ((p)object1).f(c00);
        Object object5 = ((p)object1).G();
        if((z11 | z12) != 0 || object5 == z3) {
            object5 = new s0(f, c00);
            ((p)object1).a0(object5);
        }
        B0.b(z6, ((Function0)object4), ((Function0)object5), this.b0, ((p)object1), 0);
        String s = hb.h.S(0, ((p)object1));
        Density density1 = (Density)((p)object1).k(o00);
        Modifier modifier3 = c.m(l0, density1.i0(a.j(v1)), density1.i0(a.i(v1)), density1.i0(a.h(v1)), density1.i0(a.g(v1)));
        boolean z13 = ((p)object1).f(c00);
        Object object6 = ((p)object1).G();
        if(z13 || object6 == z3) {
            object6 = new t0(c00, 0);
            ((p)object1).a0(object6);
        }
        Modifier modifier4 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.g(modifier3, ((Function1)object6)), 0.0f, 0.0f, B0.a, 0.0f, 11);
        boolean z14 = ((p)object1).f(s);
        boolean z15 = ((p)object1).f(c00);
        boolean z16 = ((p)object1).h(e0);
        Object object7 = ((p)object1).G();
        if((z14 | z15 | z16) != 0 || object7 == z3) {
            object7 = new m0(s, c00, e0, 9);
            ((p)object1).a0(object7);
        }
        Modifier modifier5 = M0.k.a(modifier4, false, ((Function1)object7));
        b b0 = c0.c.c(0x8C4B1CF9, new B(this.h0, 1), ((p)object1));
        io.sentry.config.a.k(modifier5, this.c0, this.d0, this.e0, null, this.f0, b0, ((p)object1), 0x180000, 16);
        ((p)object1).p(true);
        return t.a;
    }
}

