package R;

import Ab.t;
import B.B;
import B.C;
import B.F0;
import B.K0;
import B.r;
import B.z;
import Bb.a;
import D0.K;
import F0.h;
import F0.i;
import F0.j;
import Nb.k;
import U.Z;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import dc.e;
import g0.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v.b;

public final class d0 extends k implements Function2 {
    public final Function2 X;
    public final b Y;
    public final Function2 Z;
    public final z0 b0;
    public final Function0 c0;
    public final e d0;
    public final c0.b e0;

    public d0(Function2 function20, b b0, Function2 function21, z0 z00, Function0 function00, e e0, c0.b b1) {
        this.X = function20;
        this.Y = b0;
        this.Z = function21;
        this.b0 = z00;
        this.c0 = function00;
        this.d0 = e0;
        this.e0 = b1;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        C c1;
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        l l0 = l.X;
        Modifier modifier0 = K0.a(c.d(l0, 1.0f), ((F0)this.X.j(((p)object0), 0)));
        b b0 = this.Y;
        boolean z = ((p)object0).h(b0);
        Object object2 = ((p)object0).G();
        Z z1 = U.l.a;
        if(z || object2 == z1) {
            object2 = new a(22, b0);
            ((p)object0).a0(object2);
        }
        Modifier modifier1 = androidx.compose.ui.graphics.a.a(modifier0, ((Function1)object2));
        B b1 = z.a(B.k.c, g0.b.m, ((p)object0), 0);
        int v = ((p)object0).P;
        g0 g00 = ((p)object0).m();
        Modifier modifier2 = g0.a.d(((p)object0), modifier1);
        F0.k.a.getClass();
        i i0 = j.b;
        ((p)object0).U();
        if(((p)object0).O) {
            ((p)object0).l(i0);
        }
        else {
            ((p)object0).d0();
        }
        h h0 = j.f;
        d.K(((p)object0), b1, h0);
        h h1 = j.e;
        d.K(((p)object0), g00, h1);
        h h2 = j.g;
        if(((p)object0).O || !Nb.j.a(((p)object0).G(), v)) {
            m5.b.F(v, ((p)object0), v, h2);
        }
        h h3 = j.d;
        d.K(((p)object0), modifier2, h3);
        C c0 = C.a;
        ((p)object0).Q(-1636564008);
        Function2 function20 = this.Z;
        if(function20 == null) {
            c1 = c0;
        }
        else {
            String s = U5.a.C(0x7F12021A, ((p)object0));  // string:m3c_bottom_sheet_collapse_description "Collapse bottom sheet"
            String s1 = U5.a.C(0x7F12021B, ((p)object0));  // string:m3c_bottom_sheet_dismiss_description "Dismiss bottom sheet"
            String s2 = U5.a.C(0x7F12021D, ((p)object0));  // string:m3c_bottom_sheet_expand_description "Expand bottom sheet"
            Modifier modifier3 = c0.a(l0, g0.b.n);
            z0 z00 = this.b0;
            boolean z2 = ((p)object0).f(z00);
            boolean z3 = ((p)object0).f(s1);
            Function0 function00 = this.c0;
            boolean z4 = ((p)object0).f(function00);
            boolean z5 = ((p)object0).f(s2);
            c1 = c0;
            e e0 = this.d0;
            boolean z6 = ((p)object0).h(e0);
            boolean z7 = ((p)object0).f(s);
            Object object3 = ((p)object0).G();
            if((z2 | z3 | z4 | z5 | z6 | z7) != 0 || object3 == z1) {
                object3 = new B.t(z00, s1, s2, s, function00, e0, 2);
                ((p)object0).a0(object3);
            }
            Modifier modifier4 = M0.k.a(modifier3, true, ((Function1)object3));
            K k0 = r.e(g0.b.a, false);
            int v1 = ((p)object0).P;
            g0 g01 = ((p)object0).m();
            Modifier modifier5 = g0.a.d(((p)object0), modifier4);
            ((p)object0).U();
            if(((p)object0).O) {
                ((p)object0).l(i0);
            }
            else {
                ((p)object0).d0();
            }
            d.K(((p)object0), k0, h0);
            d.K(((p)object0), g01, h1);
            if(((p)object0).O || !Nb.j.a(((p)object0).G(), v1)) {
                m5.b.F(v1, ((p)object0), v1, h2);
            }
            d.K(((p)object0), modifier5, h3);
            function20.j(((p)object0), 0);
            ((p)object0).p(true);
        }
        ((p)object0).p(false);
        this.e0.h(c1, ((p)object0), 6);
        ((p)object0).p(true);
        return t.a;
    }
}

