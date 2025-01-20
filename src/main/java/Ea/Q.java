package Ea;

import Ab.t;
import Ha.r;
import N4.h;
import P4.c;
import Pb.a;
import U.p;
import com.wave.customer.scratchCardRewards.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class q implements Function2 {
    public final int X;
    public final Function0 Y;
    public final int Z;

    public q(int v, int v1, Function0 function00) {
        this.X = v1;
        this.Y = function00;
        this.Z = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        switch(this.X) {
            case 0: {
                d.k(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 1: {
                J.i(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 2: {
                r.b(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 3: {
                r.c(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 4: {
                c.i(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            case 5: {
                h.b(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
            default: {
                a.n(this.Y, ((p)object0), U.d.O(this.Z | 1));
                return t.a;
            }
        }
    }
}

