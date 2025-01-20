package Ea;

import Ab.t;
import B.B;
import B.e;
import B.z;
import D.k;
import F0.h;
import F0.i;
import Nb.j;
import U.d;
import U.g0;
import U.p;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.a;
import com.wave.customer.scratchCardRewards.components.g;
import g0.b;
import g0.l;
import kotlin.jvm.functions.Function3;
import n0.M;

public final class t0 implements Function3 {
    public final P0 X;
    public final float Y;
    public final f0 Z;

    public t0(P0 p00, float f, f0 f00) {
        this.X = p00;
        this.Y = f;
        this.Z = f00;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((k)object0), "$this$item");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        P0 p00 = this.X;
        l l0 = l.X;
        float f = this.Y;
        if(p00.f != null) {
            ((p)object1).Q(0x809B0016);
            Modifier modifier0 = a.b(l0, new n0(0, f));
            B b0 = z.a(B.k.c, b.m, ((p)object1), 0);
            int v1 = ((p)object1).P;
            g0 g00 = ((p)object1).m();
            Modifier modifier1 = g0.a.d(((p)object1), modifier0);
            F0.k.a.getClass();
            i i0 = F0.j.b;
            ((p)object1).U();
            if(((p)object1).O) {
                ((p)object1).l(i0);
            }
            else {
                ((p)object1).d0();
            }
            d.K(((p)object1), b0, F0.j.f);
            d.K(((p)object1), g00, F0.j.e);
            h h0 = F0.j.g;
            if(((p)object1).O || !j.a(((p)object1).G(), v1)) {
                m5.b.F(v1, ((p)object1), v1, h0);
            }
            d.K(((p)object1), modifier1, F0.j.d);
            e.b(((p)object1), androidx.compose.foundation.a.b(c.d(c.e(l0, 30.0f), 1.0f), yc.d.h(0x7F060047, ((p)object1)), M.a));  // color:WaveBlue50
            g.n(p00.f, this.Z.e, null, 170.0f, 0, ((p)object1), 0xC00, 20);
            ((p)object1).p(true);
            ((p)object1).p(false);
            return t.a;
        }
        ((p)object1).Q(0x80A2A743);
        com.wave.customer.scratchCardRewards.j.g(a.b(l0, new n0(0, f)), ((p)object1), 0);
        ((p)object1).p(false);
        return t.a;
    }
}

