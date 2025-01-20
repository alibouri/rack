package N9;

import Ab.t;
import Nb.j;
import U.H;
import U.l;
import U.p;
import c0.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import v9.i;

public final class k implements Function3 {
    public final b X;
    public final String Y;
    public final e Z;
    public final int b0;
    public final Function0 c0;

    public k(b b0, String s, e e0, int v, Function0 function00) {
        this.X = b0;
        this.Y = s;
        this.Z = e0;
        this.b0 = v;
        this.c0 = function00;
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        j.f(((i)object0), "balloonWindow");
        if((v & 6) == 0) {
            v |= (((p)object1).f(((i)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((p)object1).x()) {
            ((p)object1).K();
            return t.a;
        }
        this.X.j(((p)object1), 0);
        ((p)object1).Q(0x961CF3B1);
        e e0 = this.Z;
        boolean z = ((p)object1).f(e0);
        boolean z1 = ((p)object1).d(this.b0);
        boolean z2 = ((p)object1).f(this.c0);
        Object object3 = ((p)object1).G();
        if(((v & 14) == 4 | z | z1 | z2) != 0 || object3 == l.a) {
            object3 = new N9.j(e0, ((i)object0), this.b0, this.c0, null);
            ((p)object1).a0(object3);
        }
        ((p)object1).p(false);
        H.d(((p)object1), this.Y, ((Function2)object3));
        return t.a;
    }
}

