package Fa;

import A3.e;
import Aa.U;
import Ab.t;
import B.B;
import B.K0;
import B.T;
import B.d;
import B.k;
import B.q0;
import B.y0;
import B.z;
import C.E;
import C.H;
import D0.K;
import Ea.S;
import Ea.r0;
import Ea.r;
import F0.h;
import G0.f0;
import Ha.n;
import K9.s;
import M.J;
import Nb.j;
import R2.f;
import R9.w2;
import U.N0;
import U.Z;
import U.g0;
import U.l;
import U.p;
import androidx.compose.foundation.layout.c;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.unit.Density;
import g0.b;
import j6.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import n0.M;
import oa.i;
import ra.G;
import ra.g;

public final class y implements Function3 {
    public final int X;
    public final Function0 Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;

    public y(Object object0, Function0 function00, Object object1, Object object2, Object object3, int v) {
        this.X = v;
        this.Z = object0;
        this.Y = function00;
        this.b0 = object1;
        this.c0 = object2;
        this.d0 = object3;
        super();
    }

    public y(i i0, Function1 function10, Function1 function11, Function0 function00, Function1 function12) {
        this.X = 1;
        super();
        this.Z = i0;
        this.b0 = function10;
        this.c0 = function11;
        this.Y = function00;
        this.d0 = function12;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        Z z4;
        float f3;
        Z z0 = l.a;
        Function0 function00 = this.Y;
        g0.l l0 = g0.l.X;
        Object object3 = t.a;
        Object object4 = this.b0;
        Object object5 = this.c0;
        Object object6 = this.Z;
        Object object7 = this.d0;
        switch(this.X) {
            case 0: {
                int v1 = ((Number)object2).intValue();
                j.f(((B.y)object0), "$this$BoxWithConstraints");
                if((6 & v1) == 0) {
                    v1 |= (((p)object1).f(((B.y)object0)) ? 4 : 2);
                }
                if((v1 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                float f = ((B.y)object0).a();
                float f1 = ((B.y)object0).b();
                float f2 = Math.min(0.7f * f, f * 0.95f - f1 * 0.75f);
                ((p)object1).Q(516714009);
                boolean z1 = ((p)object1).f(((C)object6));
                Object object8 = ((p)object1).G();
                if(z1 || object8 == z0) {
                    object8 = new w(((C)object6), 0);
                    ((p)object1).a0(object8);
                }
                ((p)object1).p(false);
                T4.l.n(a.a(l0, ((Function1)object8)), function00, ((p)object1), 0);
                Modifier modifier0 = c.c(K0.a(l0, d.f(((p)object1)).e), 1.0f);
                B b0 = z.a(k.d, b.n, ((p)object1), 54);
                int v2 = ((p)object1).P;
                g0 g00 = ((p)object1).m();
                Modifier modifier1 = g0.a.d(((p)object1), modifier0);
                F0.k.a.getClass();
                F0.i i0 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i0);
                }
                else {
                    ((p)object1).d0();
                }
                h h0 = F0.j.f;
                U.d.K(((p)object1), b0, h0);
                h h1 = F0.j.e;
                U.d.K(((p)object1), g00, h1);
                h h2 = F0.j.g;
                if(((p)object1).O) {
                    f3 = f2;
                    m5.b.F(v2, ((p)object1), v2, h2);
                }
                else {
                    f3 = f2;
                    if(!j.a(((p)object1).G(), v2)) {
                        m5.b.F(v2, ((p)object1), v2, h2);
                    }
                }
                h h3 = F0.j.d;
                U.d.K(((p)object1), modifier1, h3);
                ((p)object1).Q(0x1C14DC61);
                boolean z2 = ((p)object1).f(((C)object6));
                Object object9 = ((p)object1).G();
                if(z2 || object9 == z0) {
                    object9 = new r(((C)object6), 1, ((ParcelableSnapshotMutableIntState)object5));
                    ((p)object1).a0(object9);
                }
                ((p)object1).p(false);
                Modifier modifier2 = androidx.compose.foundation.layout.a.g(l0, ((Function1)object9));
                ((p)object1).Q(0x1C14EEAA);
                Object object10 = ((p)object1).G();
                if(object10 == z0) {
                    object10 = new x(((ParcelableSnapshotMutableIntState)object5), 0);
                    ((p)object1).a0(object10);
                }
                ((p)object1).p(false);
                Modifier modifier3 = e.D(c.d(androidx.compose.ui.layout.a.e(modifier2, ((Function1)object10)), 1.0f), 1.0f);
                K k0 = B.r.e(b.e, false);
                int v3 = ((p)object1).P;
                g0 g01 = ((p)object1).m();
                Modifier modifier4 = g0.a.d(((p)object1), modifier3);
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i0);
                }
                else {
                    ((p)object1).d0();
                }
                U.d.K(((p)object1), k0, h0);
                U.d.K(((p)object1), g01, h1);
                if(((p)object1).O || !j.a(((p)object1).G(), v3)) {
                    m5.b.F(v3, ((p)object1), v3, h2);
                }
                U.d.K(((p)object1), modifier4, h3);
                T4.l.k(((S)object4), ((C3.i)object7), c.k(l0, f1 * 0.75f), ((p)object1), 0);
                ((p)object1).p(true);
                Modifier modifier5 = c.g(l0, 0.0f, f3, 1);
                ((p)object1).Q(0x1C152F3E);
                boolean z3 = ((p)object1).f(((C)object6));
                Object object11 = ((p)object1).G();
                if(z3) {
                    z4 = z0;
                    object11 = new w(((C)object6), 1);
                    ((p)object1).a0(object11);
                }
                else {
                    z4 = z0;
                    if(object11 == z4) {
                        object11 = new w(((C)object6), 1);
                        ((p)object1).a0(object11);
                    }
                }
                ((p)object1).p(false);
                Modifier modifier6 = androidx.compose.ui.layout.a.e(modifier5, ((Function1)object11));
                ((p)object1).Q(0x1C156F6F);
                boolean z5 = ((p)object1).f(((C)object6));
                Object object12 = ((p)object1).G();
                if(z5 || object12 == z4) {
                    object12 = new w(((C)object6), 2);
                    ((p)object1).a0(object12);
                }
                ((p)object1).p(false);
                T4.l.r(androidx.compose.foundation.gestures.a.d(androidx.compose.foundation.layout.a.g(modifier6, ((Function1)object12)), ((C)object6).a), ((S)object4).c(), function00, ((p)object1), 0);
                ((p)object1).p(true);
                return object3;
            }
            case 1: {
                int v4 = ((Number)object2).intValue();
                j.f(((q0)object0), "paddingValues");
                if((v4 & 6) == 0) {
                    v4 |= (((p)object1).f(((q0)object0)) ? 4 : 2);
                }
                if((v4 & 19) == 18 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                Modifier modifier7 = androidx.compose.foundation.layout.a.i(l0, ((q0)object0));
                K k1 = B.r.e(b.a, false);
                int v5 = ((p)object1).P;
                g0 g02 = ((p)object1).m();
                Modifier modifier8 = g0.a.d(((p)object1), modifier7);
                F0.k.a.getClass();
                F0.i i1 = F0.j.b;
                ((p)object1).U();
                if(((p)object1).O) {
                    ((p)object1).l(i1);
                }
                else {
                    ((p)object1).d0();
                }
                U.d.K(((p)object1), k1, F0.j.f);
                U.d.K(((p)object1), g02, F0.j.e);
                h h4 = F0.j.g;
                if(((p)object1).O || !j.a(((p)object1).G(), v5)) {
                    m5.b.F(v5, ((p)object1), v5, h4);
                }
                U.d.K(((p)object1), modifier8, F0.j.d);
                Density density0 = (Density)((p)object1).k(f0.f);
                E e0 = H.a(0, ((p)object1), 0, 3);
                ((p)object1).Q(0xC76842C4);
                Object object13 = ((p)object1).G();
                if(object13 == z0) {
                    object13 = U.d.C(0);
                    ((p)object1).a0(object13);
                }
                Object object14 = v1.r.f(0xC7684B64, ((p)object1), false);
                if(object14 == z0) {
                    object14 = U.d.C(0);
                    ((p)object1).a0(object14);
                }
                Object object15 = v1.r.f(0xC7685749, ((p)object1), false);
                if(object15 == z0) {
                    object15 = U.d.w(new r0(e0, ((i)object6), ((ParcelableSnapshotMutableIntState)object13), ((ParcelableSnapshotMutableIntState)object14), 4));
                    ((p)object1).a0(object15);
                }
                ((p)object1).p(false);
                if(!((i)object6).c.isEmpty() || ((i)object6).d) {
                    ((p)object1).Q(632730645);
                    int v7 = ((ParcelableSnapshotMutableIntState)object13).k();
                    float f4 = density0.i0(((ParcelableSnapshotMutableIntState)object14).k() + v7);
                    oa.h.c(((i)object6).c, e0, ((Function1)object4), f4, ((p)object1), 0);
                }
                else {
                    ((p)object1).Q(0x25B10BEC);
                    Modifier modifier9 = androidx.compose.foundation.layout.a.l(c.b(l0, 1.0f), 16.0f, 0.0f, 2);
                    int v6 = ((ParcelableSnapshotMutableIntState)object13).k();
                    w2.a(androidx.compose.foundation.layout.a.n(modifier9, 0.0f, density0.i0(((ParcelableSnapshotMutableIntState)object14).k() + v6), 0.0f, 0.0f, 13), ((p)object1), 0);
                }
                ((p)object1).p(false);
                ((p)object1).Q(0xC7693EC1);
                Object object16 = ((p)object1).G();
                if(object16 == z0) {
                    object16 = new x(((ParcelableSnapshotMutableIntState)object13), 1);
                    ((p)object1).a0(object16);
                }
                ((p)object1).p(false);
                Modifier modifier10 = androidx.compose.ui.layout.a.e(l0, ((Function1)object16));
                ((p)object1).Q(0xC76946FF);
                boolean z6 = ((p)object1).h(((i)object6));
                Object object17 = ((p)object1).G();
                if(z6 || object17 == z0) {
                    object17 = new r(((i)object6), 14, ((N0)object15));
                    ((p)object1).a0(object17);
                }
                ((p)object1).p(false);
                Modifier modifier11 = androidx.compose.foundation.layout.a.g(modifier10, ((Function1)object17));
                long v8 = yc.d.h(0x7F060002, ((p)object1));  // color:BgGray100
                u u0 = M.a;
                Modifier modifier12 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.b(modifier11, v8, u0), 0.0f, 12.0f, 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, 16.0f, 7), 16.0f, 0.0f, 2);
                Q4.i.i(((i)object6).a, ((Function1)object5), this.Y, modifier12, ((p)object1), 0);
                Modifier modifier13 = c.d(l0, 1.0f);
                ((p)object1).Q(-949387006);
                Object object18 = ((p)object1).G();
                if(object18 == z0) {
                    object18 = new x(((ParcelableSnapshotMutableIntState)object14), 2);
                    ((p)object1).a0(object18);
                }
                ((p)object1).p(false);
                Modifier modifier14 = androidx.compose.ui.layout.a.e(modifier13, ((Function1)object18));
                ((p)object1).Q(0xC7698A28);
                boolean z7 = ((p)object1).h(((i)object6));
                Object object19 = ((p)object1).G();
                if(z7 || object19 == z0) {
                    object19 = new n(((i)object6), ((N0)object15), ((ParcelableSnapshotMutableIntState)object13), 6);
                    ((p)object1).a0(object19);
                }
                ((p)object1).p(false);
                T.a(androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.g(modifier14, ((Function1)object19)), yc.d.h(0x7F060002, ((p)object1)), u0), 0.0f, 0.0f, 0.0f, 16.0f, 7), 16.0f, 0.0f, 2), new B.h(8.0f), null, 0, 0, null, c0.c.c(0x7F2F02C4, new U(((i)object6), 12, ((Function1)object7)), ((p)object1)), ((p)object1), 0x180030);  // color:BgGray100
                ((p)object1).p(true);
                return object3;
            }
            case 2: {
                int v9 = ((Number)object2).intValue();
                j.f(((y0)object0), "$this$WavePrimaryButton");
                if((v9 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                N9.d d0 = ((G)object6).c;
                N9.d d1 = d0 == null || d0.b != N9.c.l0 ? null : d0;
                ((p)object1).Q(1935788909);
                boolean z8 = ((p)object1).f(function00);
                boolean z9 = ((p)object1).f(((Function0)object4));
                Object object20 = ((p)object1).G();
                if((z8 | z9) != 0 || object20 == z0) {
                    object20 = new s(function00, ((Function0)object4), 2);
                    ((p)object1).a0(object20);
                }
                ((p)object1).p(false);
                yc.l.i(d1, null, 26, ((Function0)object20), ((Function0)object5), ((Function0)object7), g.b, ((p)object1), 0x180188, 2);
                return object3;
            }
            default: {
                int v = ((Number)object2).intValue();
                j.f(((q0)object0), "it");
                if((v & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return object3;
                }
                f.h(androidx.compose.foundation.layout.a.j(l0, 16.0f), c0.c.c(0x188BCA06, new U(((Function0)object7), ((ta.e)object6)), ((p)object1)), ((p)object1), 54);
                switch(((ta.e)object6).ordinal()) {
                    case 0: {
                        ((p)object1).Q(374367006);
                        ((p)object1).p(false);
                        return object3;
                    }
                    case 1: {
                        ((p)object1).Q(1120456997);
                        yc.l.b(function00, ((Function0)object4), ((p)object1), 0);
                        ((p)object1).p(false);
                        return object3;
                    }
                    case 2: {
                        ((p)object1).Q(1120463039);
                        P4.c.i(((Function0)object5), ((p)object1), 0);
                        ((p)object1).p(false);
                        return object3;
                    }
                    default: {
                        throw J.c(1120454028, ((p)object1), false);
                    }
                }
            }
        }
    }
}

