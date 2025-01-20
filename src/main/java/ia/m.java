package ia;

import Aa.U;
import Ab.t;
import C.c;
import Mb.e;
import Nb.j;
import Nb.k;
import Qa.z;
import R.W0;
import U.H;
import U.Z;
import U.l;
import U.p;
import androidx.compose.ui.Modifier;
import c0.b;
import com.wave.designsystem.extensions.swipetodismiss.a;
import ha.U2;
import ha.l0;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final class m extends k implements e {
    public final List X;
    public final Function1 Y;
    public final U2 Z;
    public final Function1 b0;

    public m(List list0, Function1 function10, U2 u20, Function1 function11) {
        this.X = list0;
        this.Y = function10;
        this.Z = u20;
        this.b0 = function11;
        super(4);
    }

    @Override  // Mb.e
    public final Object r(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 6) == 0 ? (((p)object2).f(((c)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((p)object2).d(v) ? 0x20 : 16);
        }
        Object object4 = t.a;
        if((v2 & 0x93) == 0x92 && ((p)object2).x()) {
            ((p)object2).K();
            return object4;
        }
        Qa.c c0 = (Qa.c)this.X.get(v);
        ((p)object2).Q(1569626906);
        float f = z.a;
        ((p)object2).Q(-919194082);
        Function1 function10 = this.Y;
        boolean z = ((p)object2).f(function10);
        boolean z1 = ((p)object2).f(c0);
        Object object5 = ((p)object2).G();
        Z z2 = l.a;
        if((z | z1) != 0 || object5 == z2) {
            object5 = new o(function10, 0, c0);
            ((p)object2).a0(object5);
        }
        ((p)object2).p(false);
        Ya.z z3 = a.b(f, ((Function1)object5), z.b, ((p)object2));
        Ab.k k0 = this.Z.b;
        ((p)object2).Q(0xC93668C3);
        if(j.a(c0, (k0 == null ? null : ((Qa.c)k0.X))) && z3.a() == W0.Y && k0.Y == W0.Z) {
            ((p)object2).Q(0xC9368AFE);
            boolean z4 = ((p)object2).h(z3);
            Object object6 = ((p)object2).G();
            if(z4 || object6 == z2) {
                object6 = new n(z3, null);
                ((p)object2).a0(object6);
            }
            ((p)object2).p(false);
            H.d(((p)object2), object4, ((Function2)object6));
        }
        ((p)object2).p(false);
        Modifier modifier0 = ((c)object0).a(g0.l.X, l0.a);
        b b0 = c0.c.c(-212146074, new U(c0, 8, this.b0), ((p)object2));
        a.a(z3, i.d, modifier0, false, true, false, b0, ((p)object2), 1600560, 0x20);
        ((p)object2).p(false);
        return object4;
    }
}

