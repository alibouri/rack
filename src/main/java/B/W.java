package B;

import Ab.t;
import D.a;
import D0.K;
import D0.L;
import D0.f0;
import E.A;
import E.C;
import E.D;
import E.G;
import E.d0;
import G0.i1;
import I.v0;
import M.B;
import M.Y;
import M.a0;
import M.c0;
import M.q;
import M.x;
import N.m2;
import N.n2;
import N.o1;
import N.q1;
import N.z1;
import Nb.k;
import R.G0;
import R.a1;
import R.f1;
import R.j0;
import U.H;
import U.Z;
import U.d;
import U.g0;
import U.l;
import U.p;
import V.f;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c0.b;
import c0.c;
import d0.h;
import d0.i;
import d0.j;
import e1.e;
import e1.u;
import java.util.ArrayList;
import java.util.List;
import k2.J;
import k2.X1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import y.s;
import y.w0;
import z0.n;

public final class w extends k implements Function2 {
    public final int X;
    public final Object Y;
    public final Object Z;

    public w(q0 q00, a a0, g g0) {
        this.X = 2;
        this.Y = q00;
        this.Z = g0;
        super(2);
    }

    public w(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super(2);
    }

    public w(Object object0, b b0, int v) {
        this.X = v;
        this.Z = object0;
        this.Y = b0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Z z0 = l.a;
        Object object2 = t.a;
        Object object3 = this.Z;
        Object object4 = this.Y;
        switch(this.X) {
            case 0: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                ((b)object4).h(((y)object3), ((p)object0), 0);
                return object2;
            }
            case 1: {
                return ((K)object3).b(((f0)object0), ((f0)object0).q(object2, new b(-1945019079, new w(((b)object4), 0, new y(((f0)object0), ((a1.a)object1).a)), true)), ((a1.a)object1).a);
            }
            case 2: {
                long v = ((a1.a)object1).a;
                if(a1.a.h(v) == 0x7FFFFFFF) {
                    throw new IllegalArgumentException("LazyVerticalGrid\'s width should be bound by parent.");
                }
                LayoutDirection layoutDirection0 = LayoutDirection.X;
                float f2 = androidx.compose.foundation.layout.a.e(((q0)object4), layoutDirection0);
                int v1 = a1.a.h(v) - ((Density)object0).I(androidx.compose.foundation.layout.a.d(((q0)object4), layoutDirection0) + f2);
                int v2 = v1 - ((Density)object0).I(((g)object3).a());
                ArrayList arrayList0 = new ArrayList(2);
                for(int v3 = 0; v3 < 2; ++v3) {
                    arrayList0.add(((int)((v3 >= v2 % 2 ? 0 : 1) + v2 / 2)));
                }
                int[] arr_v = Bb.p.P0(arrayList0);
                int[] arr_v1 = new int[arr_v.length];
                ((g)object3).c(((Density)object0), v1, arr_v, layoutDirection0, arr_v1);
                return new D.t(arr_v, arr_v1);
            }
            case 3: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Boolean boolean0 = (Boolean)((D0.y)object4).f.getValue();
                boolean z1 = boolean0.booleanValue();
                ((p)object0).T(boolean0);
                boolean z2 = ((p)object0).g(z1);
                ((p)object0).Q(0xCC294FAD);
                boolean z9 = false;
                if(z1) {
                    z9 = true;
                    ((Function2)object3).j(((p)object0), 0);
                }
                else if(((p)object0).k == 0) {
                    z9 = true;
                    if(!((p)object0).O) {
                        if(z2) {
                            int v4 = ((p)object0).F.g;
                            int v5 = ((p)object0).F.h;
                            ((p)object0).L.getClass();
                            ((p)object0).L.d(false);
                            V.a a0 = ((p)object0).L.b;
                            a0.getClass();
                            a0.b.V(f.c);
                            d.l(((p)object0).r, v4, v5);
                            ((p)object0).F.m();
                        }
                        else {
                            ((p)object0).J();
                        }
                    }
                }
                if(z9) {
                    ((p)object0).p(false);
                    if(((p)object0).x && ((p)object0).F.i == ((p)object0).y) {
                        ((p)object0).y = -1;
                        ((p)object0).x = false;
                    }
                    ((p)object0).p(false);
                    return object2;
                }
                d.p("No nodes can be emitted before calling dactivateToEndGroup");
                throw null;
            }
            case 4: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                G g0 = (G)((D)object4).b.invoke();
                int v6 = ((C)object3).c;
                int v7 = g0.b();
                Object object5 = ((C)object3).a;
                if(v6 >= v7 || !g0.c(v6).equals(object5)) {
                    v6 = g0.a(object5);
                    if(v6 != -1) {
                        ((C)object3).c = v6;
                    }
                }
                if(v6 == -1) {
                    ((p)object0).Q(0xD8A50C51);
                }
                else {
                    ((p)object0).Q(-660479623);
                    A.d(g0, ((D)object4).a, v6, ((C)object3).a, ((p)object0), 0);
                }
                ((p)object0).p(false);
                boolean z3 = ((p)object0).h(((C)object3));
                Object object6 = ((p)object0).G();
                if(z3 || object6 == z0) {
                    object6 = new Bb.a(5, ((C)object3));
                    ((p)object0).a0(object6);
                }
                H.b(object5, ((Function1)object6), ((p)object0));
                return object2;
            }
            case 5: {
                return (L)((Function2)object3).j(new E.L(((D)object4), ((f0)object0)), new a1.a(((a1.a)object1).a));
            }
            case 6: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                ((p)object0).Q(-796080049);
                h h0 = (h)R2.f.y(new Object[0], h.d, i.Y, ((p)object0), 0xC00, 4);
                h0.c = (j)((p)object0).k(d0.l.a);
                ((p)object0).p(false);
                ((d0)object3).b.setValue(h0);
                ((b)object4).h(((d0)object3), ((p)object0), 0);
                return object2;
            }
            case 7: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                AndroidCompositionLocals_androidKt.a(((i1)object3).X, ((b)object4), ((p)object0), 0);
                return object2;
            }
            case 8: {
                if((3 & ((Number)object1).intValue()) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                ((b)object4).j(((p)object0), 0);
                if(((a0)object3).g() && ((a0)object3).d()) {
                    q q0 = ((a0)object3).e();
                    if(!(q0 == null ? true : Nb.j.a(q0.a, q0.b))) {
                        ((p)object0).Q(0xCB6A46BD);
                        q q1 = ((a0)object3).e();
                        if(q1 == null) {
                            ((p)object0).Q(0xCB6ADE77);
                        }
                        else {
                            ((p)object0).Q(-882188680);
                            ((p)object0).Q(0x592480C2);
                            List list0 = Bb.q.L(new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                            int v8 = list0.size();
                            int v9 = 0;
                            while(v9 < v8) {
                                boolean z4 = ((Boolean)list0.get(v9)).booleanValue();
                                boolean z5 = ((p)object0).g(z4);
                                Object object7 = ((p)object0).G();
                                if(z5 || object7 == z0) {
                                    object7 = new Y(z4, ((a0)object3));
                                    ((p)object0).a0(object7);
                                }
                                boolean z6 = ((p)object0).g(z4);
                                Object object8 = ((p)object0).G();
                                if(z6 || object8 == z0) {
                                    object8 = z4 ? new x(((a0)object3), 0) : new x(((a0)object3), 1);
                                    ((p)object0).a0(object8);
                                }
                                Z0.h h1 = z4 ? q1.a.a : q1.b.a;
                                B b0 = new B(((Function0)object8));
                                boolean z7 = ((p)object0).h(((v0)object7));
                                Object object9 = ((p)object0).G();
                                if(z7 || object9 == z0) {
                                    object9 = new M.w(((v0)object7), null);
                                    ((p)object0).a0(object9);
                                }
                                SuspendPointerInputElement suspendPointerInputElement0 = new SuspendPointerInputElement(((v0)object7), null, ((Function2)object9), 6);
                                c0.d(b0, z4, h1, q1.c, 0L, suspendPointerInputElement0, ((p)object0), 0);
                                ++v9;
                                v8 = v8;
                            }
                            ((p)object0).p(false);
                        }
                        ((p)object0).p(false);
                        ((p)object0).p(false);
                        return object2;
                    }
                }
                ((p)object0).Q(0xCB80F247);
                ((p)object0).p(false);
                return object2;
            }
            case 9: {
                float f3 = ((Number)object0).floatValue();
                float f4 = ((Number)object1).floatValue();
                ((N.t)object4).a.g.m(f3);
                ((N.t)object4).a.h.m(f4);
                ((Nb.t)object3).X = f3;
                return object2;
            }
            case 10: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                b b1 = c.c(0xAD0597A, new O(((b)object4), 2), ((p)object0));
                m2.a(((n2)object3).i, b1, ((p)object0), 0x30);
                return object2;
            }
            case 11: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                ((Function3)object4).h(((q1)object3).b, ((p)object0), 0);
                return object2;
            }
            case 12: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                d.a(o1.a.a(((B8.c)object4)), ((Function2)object3), ((p)object0), 8);
                return object2;
            }
            case 13: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Nb.j.c(((z1)object3));
                ((Function3)object4).h(((z1)object3), ((p)object0), 0);
                return object2;
            }
            case 14: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                a1.a(((f1)object3).j, ((b)object4), ((p)object0), 0);
                return object2;
            }
            case 15: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Nb.j.c(((G0)object3));
                ((Function3)object4).h(((G0)object3), ((p)object0), 0);
                return object2;
            }
            case 16: {
                float f5 = ((Number)object0).floatValue();
                float f6 = ((Number)object1).floatValue();
                ((S.k)object4).a.g.m(f5);
                ((S.k)object4).a.h.m(f6);
                ((Nb.t)object3).X = f5;
                return object2;
            }
            case 17: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return object2;
                }
                Modifier modifier0 = M0.k.a(g0.l.X, false, e1.c.c0);
                boolean z8 = ((p)object0).h(((u)object4));
                Object object10 = ((p)object0).G();
                if(z8 || object10 == z0) {
                    object10 = new e1.j(((u)object4), 1);
                    ((p)object0).a0(object10);
                }
                Modifier modifier1 = N4.j.g(androidx.compose.ui.layout.a.e(modifier0, ((Function1)object10)), (((u)object4).getCanCalculatePosition() ? 1.0f : 0.0f));
                b b2 = c.c(606497925, new j0(((MutableState)object3), 3), ((p)object0));
                e e0 = e.c;
                int v10 = ((p)object0).P;
                g0 g00 = ((p)object0).m();
                Modifier modifier2 = g0.a.d(((p)object0), modifier1);
                F0.k.a.getClass();
                F0.i i0 = F0.j.b;
                ((p)object0).U();
                if(((p)object0).O) {
                    ((p)object0).l(i0);
                }
                else {
                    ((p)object0).d0();
                }
                d.K(((p)object0), e0, F0.j.f);
                d.K(((p)object0), g00, F0.j.e);
                F0.h h2 = F0.j.g;
                if(((p)object0).O || !Nb.j.a(((p)object0).G(), v10)) {
                    m5.b.F(v10, ((p)object0), v10, h2);
                }
                d.K(((p)object0), modifier2, F0.j.d);
                b2.j(((p)object0), 6);
                ((p)object0).p(true);
                return object2;
            }
            case 18: {
                Nb.j.f(((J)object0), "prependHint");
                Nb.j.f(((J)object1), "appendHint");
                if(((k2.g0)object4) == k2.g0.Y) {
                    ((J)object0).a = (X1)object3;
                    if(((X1)object3) != null) {
                        ((J)object0).b.q(((X1)object3));
                        return object2;
                    }
                }
                else {
                    ((J)object1).a = (X1)object3;
                    if(((X1)object3) != null) {
                        ((J)object1).b.q(((X1)object3));
                    }
                }
                return object2;
            }
            case 19: {
                float f7 = ((Number)object0).floatValue();
                ((s)object4).a(f7, ((Number)object1).floatValue());
                ((Nb.t)object3).X = f7;
                return object2;
            }
            case 20: {
                long v11 = ((m0.b)object1).a;
                M6.b.p(((A0.d)object4), ((n)object0));
                Zb.i i1 = ((y.f0)object3).r0;
                if(i1 != null) {
                    i1.s(new y.L(v11));
                }
                return object2;
            }
            default: {
                float f = ((Number)object0).floatValue();
                ((Number)object1).floatValue();
                float f1 = ((Nb.t)object4).X;
                ((Nb.t)object4).X = ((w0)object3).a(f - f1) + f1;
                return object2;
            }
        }
    }
}

