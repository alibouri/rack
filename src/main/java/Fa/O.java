package Fa;

import Ab.t;
import U.p;
import androidx.compose.foundation.layout.a;
import com.wave.customer.scratchCardRewards.components.g;
import g0.l;
import kotlin.jvm.functions.Function2;
import yc.d;

public final class o implements Function2 {
    public final int X;
    public static final o Y;
    public static final o Z;
    public static final o b0;
    public static final o c0;

    static {
        o.Y = new o(0);
        o.Z = new o(1);
        o.b0 = new o(2);
        o.c0 = new o(3);
    }

    public o(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.X) {
            case 0: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                }
                return t.a;
            }
            case 1: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return t.a;
                }
                g.o(a.n(l.X, 0.0f, 0.0f, 0.0f, 6.0f, 7), ((p)object0), 6);
                return t.a;
            }
            case 2: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return t.a;
                }
                g.h(d.h(0x7F0600D1, ((p)object0)), 0L, ((p)object0), 0);  // color:highlight_pink
                return t.a;
            }
            default: {
                if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
                    ((p)object0).K();
                    return t.a;
                }
                g.r(0, ((p)object0));
                return t.a;
            }
        }
    }
}

