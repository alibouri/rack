package E;

import Ab.t;
import N.J1;
import Nb.k;
import U.d;
import U.p;
import a.a;
import c0.b;
import kotlin.jvm.functions.Function2;

public final class e0 extends k implements Function2 {
    public final int X;
    public final b Y;
    public final int Z;

    public e0(b b0, int v, int v1) {
        this.X = v1;
        this.Y = b0;
        this.Z = v;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Number)object1).intValue();
        switch(this.X) {
            case 0: {
                A.c(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            case 1: {
                a.f(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
            default: {
                J1.e(this.Y, ((p)object0), d.O(this.Z | 1));
                return t.a;
            }
        }
    }
}

