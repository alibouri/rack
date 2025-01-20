package I;

import Ab.t;
import B.m0;
import D0.K;
import F0.i;
import G0.f0;
import K.o;
import N.H0;
import N.v1;
import N.x1;
import N.y1;
import N.z1;
import Nb.j;
import Nb.k;
import O0.N;
import R.C0;
import R.E0;
import R.F0;
import R.G0;
import R.w;
import U.H;
import U.Z;
import U.d;
import U.g0;
import U.l;
import U.p;
import U0.B;
import U0.v;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.platform.WindowInfo;
import hb.h;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import n0.U;
import n0.r;
import u.g;
import u.q;
import v.b;
import v.c;
import v.n0;
import v.z;

public final class y0 extends k implements Function3 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;

    public y0(Object object0, Object object1, Object object2, Object object3, int v) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        this.b0 = object2;
        this.c0 = object3;
        super(3);
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        Z z33;
        b b2;
        Boolean boolean4;
        Z z20;
        b b1;
        Boolean boolean1;
        Object object9;
        switch(this.X) {
            case 0: {
                ((Number)object2).intValue();
                ((p)object1).Q(0xFAF68513);
                Object object6 = ((p)object1).G();
                Z z4 = l.a;
                if(object6 == z4) {
                    object6 = new o();
                    ((p)object1).a0(object6);
                }
                r r0 = (r)this.Y;
                boolean z5 = !(r0 instanceof U) || ((U)r0).a != 16L;
                if(((WindowInfo)((p)object1).k(f0.r)).a()) {
                    j0 j00 = (j0)this.Z;
                    if(j00.b()) {
                        B b0 = (B)this.b0;
                        long v1 = b0.b;
                        if(N.b(v1) && z5) {
                            ((p)object1).Q(0x302DFC9D);
                            N n0 = new N(v1);
                            boolean z6 = ((p)object1).h(((o)object6));
                            Object object7 = ((p)object1).G();
                            if(z6 || object7 == z4) {
                                object7 = new w0(((o)object6), null);
                                ((p)object1).a0(object7);
                            }
                            H.e(b0.a, n0, ((Function2)object7), ((p)object1));
                            boolean z7 = ((p)object1).h(((o)object6));
                            v v2 = (v)this.c0;
                            boolean z8 = ((p)object1).h(v2);
                            boolean z9 = ((p)object1).f(b0);
                            boolean z10 = ((p)object1).h(j00);
                            boolean z11 = ((p)object1).f(r0);
                            Object object8 = ((p)object1).G();
                            if((z11 | (z7 | z8 | z9 | z10)) != 0 || object8 == z4) {
                                x0 x00 = new x0(((o)object6), v2, b0, j00, ((r)this.Y), 0);
                                ((p)object1).a0(x00);
                                object8 = x00;
                            }
                            object9 = a.c(((Modifier)object0), ((Function1)object8));
                            ((p)object1).p(false);
                            ((p)object1).p(false);
                            return object9;
                        }
                    }
                    goto label_64;
                }
                else {
                label_64:
                    ((p)object1).Q(0x3040856E);
                    ((p)object1).p(false);
                    object9 = g0.l.X;
                }
                ((p)object1).p(false);
                return object9;
            }
            case 1: {
                int v3 = ((Number)object2).intValue();
                if((v3 & 6) == 0) {
                    v3 |= (((p)object1).h(((Function2)object0)) ? 4 : 2);
                }
                if((v3 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                z1 z10_1 = (z1)this.Y;
                boolean z12 = j.a(z10_1, ((z1)this.Z));
                int v4 = !z12 || h.N(((ArrayList)this.b0)).size() == 1 ? 0 : 75;
                n0 n00 = new n0((z12 ? 150 : 75), v4, z.c);
                boolean z13 = ((p)object1).h(z10_1);
                H0 h00 = (H0)this.c0;
                boolean z14 = ((p)object1).h(h00);
                Object object10 = ((p)object1).G();
                Z z15 = l.a;
                if((z13 | z14) != 0 || object10 == z15) {
                    object10 = new D.j(z10_1, 17, h00);
                    ((p)object1).a0(object10);
                }
                Object object11 = ((p)object1).G();
                float f = 1.0f;
                if(object11 == z15) {
                    object11 = c.a((z12 ? 0.0f : 1.0f));
                    ((p)object1).a0(object11);
                }
                Boolean boolean0 = Boolean.valueOf(z12);
                boolean z16 = ((p)object1).h(((b)object11));
                boolean z17 = ((p)object1).g(z12);
                boolean z18 = ((p)object1).h(n00);
                boolean z19 = ((p)object1).f(((Function0)object10));
                Object object12 = ((p)object1).G();
                if((z16 | z17 | z18 | z19) != 0 || object12 == z15) {
                    boolean1 = boolean0;
                    b1 = (b)object11;
                    z20 = z15;
                    object12 = new x1(((b)object11), z12, n00, ((Function0)object10), null);
                    ((p)object1).a0(object12);
                }
                else {
                    boolean1 = boolean0;
                    b1 = (b)object11;
                    z20 = z15;
                }
                H.d(((p)object1), boolean1, ((Function2)object12));
                v.l l0 = b1.c;
                n0 n01 = new n0((z12 ? 150 : 75), v4, z.a);
                Object object13 = ((p)object1).G();
                if(object13 == z20) {
                    if(z12) {
                        f = 0.8f;
                    }
                    object13 = c.a(f);
                    ((p)object1).a0(object13);
                }
                Boolean boolean2 = Boolean.valueOf(z12);
                boolean z21 = ((p)object1).h(((b)object13));
                boolean z22 = ((p)object1).g(z12);
                boolean z23 = ((p)object1).h(n01);
                Object object14 = ((p)object1).G();
                if((z21 | z22 | z23) != 0 || object14 == z20) {
                    object14 = new y1(((b)object13), z12, n01, null);
                    ((p)object1).a0(object14);
                }
                H.d(((p)object1), boolean2, ((Function2)object14));
                float f1 = ((Number)((b)object13).c.Y.getValue()).floatValue();
                float f2 = ((Number)((b)object13).c.Y.getValue()).floatValue();
                float f3 = ((Number)l0.Y.getValue()).floatValue();
                Modifier modifier0 = androidx.compose.ui.graphics.a.b(g0.l.X, f1, f2, f3, 0.0f, 0.0f, null, false, 0x1FFF8);
                boolean z24 = ((p)object1).h(z10_1);
                Object object15 = ((p)object1).G();
                if(z24 || object15 == z20) {
                    object15 = new v1(z10_1, 0);
                    ((p)object1).a0(object15);
                }
                Modifier modifier1 = M0.k.a(modifier0, false, ((Function1)object15));
                K k1 = B.r.e(g0.b.a, false);
                int v5 = ((p)object1).P;
                g0 g00 = ((p)object1).m();
                Modifier modifier2 = g0.a.d(((p)object1), modifier1);
                F0.k.a.getClass();
                i i0 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i0);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), k1, F0.j.f);
                d.K(((p)object1), g00, F0.j.e);
                F0.h h0 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v5)) {
                    m5.b.F(v5, ((p)object1), v5, h0);
                }
                d.K(((p)object1), modifier2, F0.j.d);
                ((Function2)object0).j(((p)object1), ((int)(v3 & 14)));
                ((p)object1).p(true);
                return t.a;
            }
            case 2: {
                int v6 = ((Number)object2).intValue();
                if((v6 & 6) == 0) {
                    v6 |= (((p)object1).h(((Function2)object0)) ? 4 : 2);
                }
                if((v6 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                G0 g01 = (G0)this.Y;
                boolean z25 = j.a(g01, ((G0)this.Z));
                int v7 = !z25 || h.N(((ArrayList)this.b0)).size() == 1 ? 0 : 75;
                n0 n02 = new n0((z25 ? 150 : 75), v7, z.c);
                boolean z26 = ((p)object1).f(g01);
                w w0 = (w)this.c0;
                boolean z27 = ((p)object1).h(w0);
                Object object16 = ((p)object1).G();
                Z z28 = l.a;
                if((z26 | z27) != 0 || object16 == z28) {
                    object16 = new D.j(g01, 21, w0);
                    ((p)object1).a0(object16);
                }
                Object object17 = ((p)object1).G();
                float f4 = 1.0f;
                if(object17 == z28) {
                    object17 = c.a((z25 ? 0.0f : 1.0f));
                    ((p)object1).a0(object17);
                }
                Boolean boolean3 = Boolean.valueOf(z25);
                boolean z29 = ((p)object1).h(((b)object17));
                boolean z30 = ((p)object1).g(z25);
                boolean z31 = ((p)object1).h(n02);
                boolean z32 = ((p)object1).f(((Function0)object16));
                Object object18 = ((p)object1).G();
                if((z29 | z30 | z31 | z32) != 0 || object18 == z28) {
                    boolean4 = boolean3;
                    b2 = (b)object17;
                    z33 = z28;
                    object18 = new E0(((b)object17), z25, n02, ((Function0)object16), null);
                    ((p)object1).a0(object18);
                }
                else {
                    boolean4 = boolean3;
                    b2 = (b)object17;
                    z33 = z28;
                }
                H.d(((p)object1), boolean4, ((Function2)object18));
                v.l l1 = b2.c;
                n0 n03 = new n0((z25 ? 150 : 75), v7, z.a);
                Object object19 = ((p)object1).G();
                if(object19 == z33) {
                    if(z25) {
                        f4 = 0.8f;
                    }
                    object19 = c.a(f4);
                    ((p)object1).a0(object19);
                }
                Boolean boolean5 = Boolean.valueOf(z25);
                boolean z34 = ((p)object1).h(((b)object19));
                boolean z35 = ((p)object1).g(z25);
                boolean z36 = ((p)object1).h(n03);
                Object object20 = ((p)object1).G();
                if((z34 | z35 | z36) != 0 || object20 == z33) {
                    object20 = new F0(((b)object19), z25, n03, null);
                    ((p)object1).a0(object20);
                }
                H.d(((p)object1), boolean5, ((Function2)object20));
                float f5 = ((Number)((b)object19).c.Y.getValue()).floatValue();
                float f6 = ((Number)((b)object19).c.Y.getValue()).floatValue();
                float f7 = ((Number)l1.Y.getValue()).floatValue();
                Modifier modifier3 = androidx.compose.ui.graphics.a.b(g0.l.X, f5, f6, f7, 0.0f, 0.0f, null, false, 0x1FFF8);
                boolean z37 = ((p)object1).f(g01);
                Object object21 = ((p)object1).G();
                if(z37 || object21 == z33) {
                    object21 = new C0(g01, 0);
                    ((p)object1).a0(object21);
                }
                Modifier modifier4 = M0.k.a(modifier3, false, ((Function1)object21));
                K k2 = B.r.e(g0.b.a, false);
                int v8 = ((p)object1).P;
                g0 g02 = ((p)object1).m();
                Modifier modifier5 = g0.a.d(((p)object1), modifier4);
                F0.k.a.getClass();
                i i1 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i1);
                }
                else {
                    ((p)object1).d0();
                }
                d.K(((p)object1), k2, F0.j.f);
                d.K(((p)object1), g02, F0.j.e);
                F0.h h1 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v8)) {
                    m5.b.F(v8, ((p)object1), v8, h1);
                }
                d.K(((p)object1), modifier5, F0.j.d);
                ((Function2)object0).j(((p)object1), ((int)(v6 & 14)));
                ((p)object1).p(true);
                return t.a;
            }
            default: {
                int v = ((Number)object2).intValue();
                if((v & 6) == 0) {
                    v |= (((v & 8) == 0 ? ((p)object1).f(((u.p)object0)) : ((p)object1).h(((u.p)object0))) ? 4 : 2);
                }
                if((v & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                e0.p p0 = (e0.p)this.Y;
                boolean z = ((p)object1).f(p0);
                Object object3 = this.Z;
                boolean z1 = ((p)object1).h(object3);
                u.k k0 = (u.k)this.b0;
                boolean z2 = ((p)object1).h(k0);
                Object object4 = ((p)object1).G();
                Z z3 = l.a;
                if((z | z1 | z2) != 0 || object4 == z3) {
                    object4 = new m0(p0, object3, k0, 20);
                    ((p)object1).a0(object4);
                }
                H.b(((u.p)object0), ((Function1)object4), ((p)object1));
                j.d(((u.p)object0), "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                k0.d.i(object3, ((q)(((u.p)object0))).a);
                Object object5 = ((p)object1).G();
                if(object5 == z3) {
                    object5 = new g();  // initializer: Ljava/lang/Object;-><init>()V
                    ((p)object1).a0(object5);
                }
                ((c0.b)this.c0).r(((g)object5), object3, ((p)object1), 0);
                return t.a;
            }
        }
    }
}

