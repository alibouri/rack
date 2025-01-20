package ra;

import A3.e;
import Ab.t;
import B.B;
import B.q0;
import B.r;
import B.z;
import C.E;
import D0.K;
import F0.h;
import F0.i;
import F0.k;
import I2.J;
import N.Q;
import N.T;
import Nb.j;
import P.g;
import P.n;
import U.O;
import U.Z;
import U.g0;
import U.p;
import W4.f;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.a;
import bb.d;
import g0.b;
import g0.l;
import io.sentry.g1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final class w implements Function3 {
    public final N X;
    public final Function0 Y;
    public final g1 Z;
    public final E b0;
    public final Function0 c0;
    public final Function0 d0;
    public final Function0 e0;
    public final Function0 f0;
    public final Function0 g0;
    public final Function0 h0;
    public final Function0 i0;
    public final Function1 j0;
    public final Function1 k0;
    public final Function1 l0;
    public final Function0 m0;
    public final Function0 n0;
    public final Function0 o0;
    public final Function0 p0;
    public final Function0 q0;

    public w(N n0, Function0 function00, g1 g10, E e0, Function0 function01, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function1 function10, Function1 function11, Function1 function12, Function0 function08, Function0 function09, Function0 function010, Function0 function011, Function0 function012) {
        this.X = n0;
        this.Y = function00;
        this.Z = g10;
        this.b0 = e0;
        this.c0 = function01;
        this.d0 = function02;
        this.e0 = function03;
        this.f0 = function04;
        this.g0 = function05;
        this.h0 = function06;
        this.i0 = function07;
        this.j0 = function10;
        this.k0 = function11;
        this.l0 = function12;
        this.m0 = function08;
        this.n0 = function09;
        this.o0 = function010;
        this.p0 = function011;
        this.q0 = function012;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((q0)object0), "it");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        L l0 = L.b0;
        n n0 = f.K(this.X.a == l0, this.Y, ((p)object1), 0);
        l l1 = l.X;
        Modifier modifier0 = a.a(U5.a.J(l1, n0, this.X.t), ((d)this.Z.Z), null);
        K k0 = r.e(b.a, false);
        int v1 = ((p)object1).P;
        g0 g00 = ((p)object1).m();
        Modifier modifier1 = g0.a.d(((p)object1), modifier0);
        k.a.getClass();
        i i0 = F0.j.b;
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        h h0 = F0.j.f;
        U.d.K(((p)object1), k0, h0);
        h h1 = F0.j.e;
        U.d.K(((p)object1), g00, h1);
        h h2 = F0.j.g;
        if(((p)object1).O || !j.a(((p)object1).G(), v1)) {
            m5.b.F(v1, ((p)object1), v1, h2);
        }
        h h3 = F0.j.d;
        U.d.K(((p)object1), modifier1, h3);
        androidx.compose.foundation.layout.b b0 = androidx.compose.foundation.layout.b.a;
        B b1 = z.a(B.k.c, b.m, ((p)object1), 0);
        int v2 = ((p)object1).P;
        g0 g01 = ((p)object1).m();
        Modifier modifier2 = g0.a.d(((p)object1), l1);
        ((p)object1).U();
        if(((p)object1).O) {
            ((p)object1).l(i0);
        }
        else {
            ((p)object1).d0();
        }
        U.d.K(((p)object1), b1, h0);
        U.d.K(((p)object1), g01, h1);
        if(((p)object1).O || !j.a(((p)object1).G(), v2)) {
            m5.b.F(v2, ((p)object1), v2, h2);
        }
        U.d.K(((p)object1), modifier2, h3);
        Modifier modifier3 = e.D(l1, 1.0f);
        ((p)object1).Q(0x52A890B6);
        N n1 = this.X;
        boolean z = ((p)object1).h(n1);
        Function0 function00 = this.c0;
        boolean z1 = ((p)object1).f(function00);
        Function0 function01 = this.d0;
        boolean z2 = ((p)object1).f(function01);
        Function0 function02 = this.e0;
        boolean z3 = ((p)object1).f(function02);
        Function0 function03 = this.f0;
        boolean z4 = ((p)object1).f(function03);
        Function0 function04 = this.g0;
        boolean z5 = ((p)object1).f(function04);
        Function0 function05 = this.h0;
        boolean z6 = ((p)object1).f(function05);
        Function0 function06 = this.i0;
        boolean z7 = ((p)object1).f(function06);
        Function1 function10 = this.j0;
        boolean z8 = ((p)object1).f(function10);
        Function1 function11 = this.k0;
        boolean z9 = ((p)object1).f(function11);
        Function1 function12 = this.l0;
        boolean z10 = ((p)object1).f(function12);
        Function0 function07 = this.m0;
        boolean z11 = ((p)object1).f(function07);
        Object object3 = ((p)object1).G();
        Z z12 = U.l.a;
        if((z | z1 | z2 | z3 | z4 | z5 | z6 | z7 | z8 | z9 | z10 | z11) != 0 || object3 == z12) {
            object3 = new s(n1, function00, function01, function02, function03, function04, function05, function06, function10, function11, function12, function07);
            ((p)object1).a0(object3);
        }
        ((p)object1).p(false);
        E e0 = this.b0;
        J.c(modifier3, this.b0, null, false, null, null, null, false, ((Function1)object3), ((p)object1), 0, 0xFC);
        ((p)object1).Q(0x52AB248B);
        Object object4 = ((p)object1).G();
        if(object4 == z12) {
            object4 = U.d.D(Bb.p.q0(n1.u), Z.e);
            ((p)object1).a0(object4);
        }
        ((p)object1).p(false);
        ra.K k1 = (ra.K)Bb.p.q0(n1.u);
        Object object5 = ((MutableState)object4).getValue();
        Boolean boolean0 = Boolean.valueOf(n1.m);
        ((p)object1).Q(0x52AB3E07);
        boolean z13 = ((p)object1).h(k1);
        boolean z14 = ((p)object1).f(e0);
        boolean z15 = ((p)object1).h(n1);
        Object object6 = ((p)object1).G();
        if((z13 | z14 | z15) != 0 || object6 == z12) {
            u u0 = new u(k1, e0, n1, ((MutableState)object4), null);
            ((p)object1).a0(u0);
            object6 = u0;
        }
        ((p)object1).p(false);
        CoroutineContext coroutineContext0 = ((p)object1).b.h();
        boolean z16 = ((p)object1).f(((ra.K)object5));
        boolean z17 = ((p)object1).f(k1);
        boolean z18 = ((p)object1).f(boolean0);
        Object object7 = ((p)object1).G();
        if((z17 | z16 | z18) != 0 || object7 == z12) {
            object7 = new O(coroutineContext0, ((Function2)object6));
            ((p)object1).a0(object7);
        }
        O o0 = (O)object7;
        T4.l.a(n1, e0.d(), this.n0, this.o0, this.p0, this.q0, null, ((p)object1), 0);
        ((p)object1).p(true);
        g.a(n1.a == l0, n0, b0.a(l1, b.b), 0L, ((Q)((p)object1).k(T.a)).e(), true, ((p)object1), 0x30040, 8);
        ((p)object1).p(true);
        return t.a;
    }
}

