package M;

import Ab.t;
import B.J0;
import B.r;
import D0.K;
import F0.h;
import F0.i;
import G0.J;
import Nb.j;
import Nb.k;
import U.d;
import U.g0;
import U.p;
import V2.a;
import androidx.compose.ui.Modifier;
import c0.b;
import c0.c;
import g0.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v.A;
import v.h0;
import v.k0;
import v.m0;
import v.o0;
import v.p0;

public final class y extends k implements Function2 {
    public final int X;
    public final b Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;

    public y(Object object0, Object object1, Object object2, b b0, int v) {
        this.X = v;
        this.Z = object0;
        this.b0 = object1;
        this.c0 = object2;
        this.Y = b0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                ((p)object0).K();
                return t.a;
            }
            J0 j00 = new J0(10, ((A)this.b0));
            o0 o00 = p0.a;
            k0 k00 = (k0)this.Z;
            Object object2 = k00.c();
            ((p)object0).Q(0xE5DA4D14);
            Object object3 = this.c0;
            float f = 0.0f;
            float f1 = j.a(object2, object3) ? 1.0f : 0.0f;
            ((p)object0).p(false);
            Float float0 = f1;
            Object object4 = k00.d.getValue();
            ((p)object0).Q(0xE5DA4D14);
            if(j.a(object4, object3)) {
                f = 1.0f;
            }
            ((p)object0).p(false);
            h0 h00 = m0.b(k00, float0, f, ((A)j00.h(k00.f(), ((p)object0), 0)), o00, ((p)object0), 0);
            l l0 = l.X;
            boolean z = ((p)object0).f(h00);
            Object object5 = ((p)object0).G();
            if(z || object5 == U.l.a) {
                object5 = new a(23, h00);
                ((p)object0).a0(object5);
            }
            Modifier modifier0 = androidx.compose.ui.graphics.a.a(l0, ((Function1)object5));
            K k0 = r.e(g0.b.a, false);
            int v = ((p)object0).P;
            g0 g00 = ((p)object0).m();
            Modifier modifier1 = g0.a.d(((p)object0), modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            ((p)object0).U();
            if(((p)object0).O) {
                ((p)object0).l(i0);
            }
            else {
                ((p)object0).d0();
            }
            d.K(((p)object0), k0, F0.j.f);
            d.K(((p)object0), g00, F0.j.e);
            h h0 = F0.j.g;
            if(((p)object0).O || !j.a(((p)object0).G(), v)) {
                m5.b.F(v, ((p)object0), v, h0);
            }
            d.K(((p)object0), modifier1, F0.j.d);
            this.Y.h(object3, ((p)object0), 0);
            ((p)object0).p(true);
            return t.a;
        }
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        d.a(j0.a.a(((i0)this.Z)), c.c(0x37C17254, new J(((Modifier)this.b0), ((a0)this.c0), this.Y, 1), ((p)object0)), ((p)object0), 56);
        return t.a;
    }
}

