package E;

import Ab.t;
import I2.J;
import Nb.k;
import U.N0;
import a1.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import p0.d;
import v.b;

public final class o extends k implements Function1 {
    public final int X;
    public final long Y;
    public final Object Z;

    public o(int v, long v1, Object object0) {
        this.X = v;
        this.Y = v1;
        this.Z = object0;
        super(1);
    }

    public o(u u0, long v) {
        this.X = 0;
        this.Z = u0;
        this.Y = v;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object1 = t.a;
        Object object2 = this.Z;
        switch(this.X) {
            case 0: {
                ((u)object2).e(g.c(((g)((b)object0).d()).a, this.Y));
                ((u)object2).c.invoke();
                return object1;
            }
            case 1: {
                float f1 = ((Number)((Function0)object2).invoke()).floatValue();
                m5.b.l(((d)object0), this.Y, 0L, 0L, f1, 0x76);
                return object1;
            }
            default: {
                float f = J.q(((Number)((N0)object2).getValue()).floatValue(), 0.0f, 1.0f);
                m5.b.l(((d)object0), this.Y, 0L, 0L, f, 0x76);
                return object1;
            }
        }
    }
}

