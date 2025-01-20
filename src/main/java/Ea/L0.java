package Ea;

import Bb.A;
import D0.M;
import I2.J;
import Nb.j;
import a1.a;
import aa.b;
import kotlin.jvm.functions.Function3;

public final class l0 implements Function3 {
    public final int X;

    public l0(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        if(this.X != 0) {
            int v = (int)(((Integer)object1));
            j.f(((b)object0), "<unused var>");
            return J.r(((int)(((Integer)object2))), v - 1, v + 1);
        }
        j.f(((M)object0), "$this$layout");
        j.f(((D0.J)object1), "measurable");
        int v1 = ((M)object0).I(d0.b);
        return ((M)object0).L(a.h(((a)object2).a), a.g(((a)object2).a), A.X, new o0(((D0.J)object1).a(a.a(((a)object2).a, 0, 0, 0, a.g(((a)object2).a) + v1, 7)), v1));
    }
}

