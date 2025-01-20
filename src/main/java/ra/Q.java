package ra;

import Ab.t;
import B.C;
import J2.w;
import Nb.j;
import R2.f;
import U.Z;
import U.l;
import U.p;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public final class q implements Function3 {
    public final List X;
    public final Function1 Y;
    public final boolean Z;

    public q(List list0, Function1 function10, boolean z) {
        this.X = list0;
        this.Y = function10;
        this.Z = z;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((C)object0), "$this$Menu");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        for(Object object3: this.X) {
            A a0 = (A)object3;
            Z z0 = l.a;
            Function1 function10 = this.Y;
            int v1 = a0.Y;
            if(a0.Z == null) {
                ((p)object1).Q(0x28A0F2EA);
                String s2 = w.S(v1, ((p)object1));
                ((p)object1).Q(-947838055);
                boolean z3 = ((p)object1).f(function10);
                boolean z4 = ((p)object1).f(a0);
                Object object5 = ((p)object1).G();
                if((z3 | z4) != 0 || object5 == z0) {
                    object5 = new ra.p(function10, a0, 1);
                    ((p)object1).a0(object5);
                }
                ((p)object1).p(false);
                f.i(a0.X, s2, ((Function0)object5), this.Z, ((p)object1), 0);
            }
            else {
                ((p)object1).Q(0x289B9841);
                String s = w.S(v1, ((p)object1));
                String s1 = w.S(((int)a0.Z), ((p)object1));
                ((p)object1).Q(0xC7810039);
                boolean z1 = ((p)object1).f(function10);
                boolean z2 = ((p)object1).f(a0);
                Object object4 = ((p)object1).G();
                if((z1 | z2) != 0 || object4 == z0) {
                    object4 = new ra.p(function10, a0, 0);
                    ((p)object1).a0(object4);
                }
                ((p)object1).p(false);
                f.d(a0.X, s, s1, ((Function0)object4), this.Z, ((p)object1), 0);
            }
            ((p)object1).p(false);
        }
        return t.a;
    }
}

