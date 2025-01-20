package da;

import Ab.c;
import Ab.t;
import U.d;
import U.p;
import U5.a;
import W4.f;
import c0.b;
import com.wave.customer.scratchCardRewards.components.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class e implements Function2 {
    public final int X;
    public final int Y;
    public final c Z;
    public final int b0;

    public e(int v, int v1, Function0 function00) {
        this.X = 0;
        super();
        this.Z = function00;
        this.Y = v;
        this.b0 = v1;
    }

    public e(int v, c c0, int v1, int v2) {
        this.X = v2;
        this.Y = v;
        this.Z = c0;
        this.b0 = v1;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((Integer)object1).getClass();
        switch(this.X) {
            case 0: {
                f.g(d.O(this.Y | 1), this.b0, ((p)object0), ((Function0)this.Z));
                return t.a;
            }
            case 1: {
                a.r(this.Y, d.O(this.b0 | 1), ((p)object0), ((Function0)this.Z));
                return t.a;
            }
            default: {
                g.f(this.Y, ((b)this.Z), ((p)object0), d.O(this.b0 | 1));
                return t.a;
            }
        }
    }
}

