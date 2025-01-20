package K9;

import N9.d;
import U.p;
import ha.Z;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

public final class t implements Function2 {
    public final int X;
    public final Function0 Y;
    public final d Z;
    public final Function0 b0;
    public final Function0 c0;
    public final Function0 d0;
    public final int e0;

    public t(Function0 function00, d d0, Function0 function01, Function0 function02, Function0 function03, int v, int v1) {
        this.X = v1;
        this.Y = function00;
        this.Z = d0;
        this.b0 = function01;
        this.c0 = function02;
        this.d0 = function03;
        this.e0 = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                Integer integer1 = (Integer)object1;
                u.a(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
                return Ab.t.a;
            }
            case 1: {
                Integer integer2 = (Integer)object1;
                Z.j(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
                return Ab.t.a;
            }
            case 2: {
                Integer integer3 = (Integer)object1;
                Z.k(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
                return Ab.t.a;
            }
            case 3: {
                Integer integer4 = (Integer)object1;
                Z.a(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
                return Ab.t.a;
            }
            case 4: {
                Integer integer5 = (Integer)object1;
                Z.c(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
                return Ab.t.a;
            }
            case 5: {
                Integer integer6 = (Integer)object1;
                Z.b(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
                return Ab.t.a;
            }
            case 6: {
                Integer integer7 = (Integer)object1;
                Z.l(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
                return Ab.t.a;
            }
            case 7: {
                Integer integer8 = (Integer)object1;
                Z.d(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
                return Ab.t.a;
            }
            default: {
                Integer integer0 = (Integer)object1;
                Z.g(this.Y, this.Z, this.b0, this.c0, this.d0, ((p)object0), U.d.O(this.e0 | 1));
                return Ab.t.a;
            }
        }
    }
}

