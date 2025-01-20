package Ea;

import Bb.A;
import D0.J;
import D0.M;
import D0.V;
import Nb.j;
import W5.f;
import a1.a;
import kotlin.jvm.functions.Function3;

public final class n0 implements Function3 {
    public final int X;
    public final float Y;

    public n0(int v, float f) {
        this.X = v;
        this.Y = f;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        if(this.X != 0) {
            j.f(((M)object0), "$this$layout");
            j.f(((J)object1), "measurable");
            V v0 = ((J)object1).a(((a)object2).a);
            int v1 = v0.X;
            int v2 = (int)(((float)v0.Y) * this.Y);
            h0 h00 = new h0(v0, 3);
            return ((M)object0).L(v1, v2, A.X, h00);
        }
        j.f(((M)object0), "$this$layout");
        j.f(((J)object1), "measurable");
        V v3 = ((J)object1).a(f.K(((M)object0).I(this.Y) * 2, ((a)object2).a, 0));
        int v4 = v3.X;
        int v5 = v3.Y;
        h0 h01 = new h0(v3, 0);
        return ((M)object0).L(v4, v5, A.X, h01);
    }
}

