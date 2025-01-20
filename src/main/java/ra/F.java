package ra;

import Ab.t;
import B.e;
import B.y0;
import J2.w;
import M6.b;
import N.m2;
import Nb.j;
import U.p;
import androidx.compose.foundation.layout.c;
import kotlin.jvm.functions.Function3;
import yc.d;
import yc.l;

public final class f implements Function3 {
    public final int X;
    public static final f Y;
    public static final f Z;
    public static final f b0;

    static {
        f.Y = new f(0);
        f.Z = new f(1);
        f.b0 = new f(2);
    }

    public f(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        switch(this.X) {
            case 0: {
                int v1 = ((Number)object2).intValue();
                j.f(((y0)object0), "$this$WavePrimaryButton");
                if((v1 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                b.d(l.y(0x7F08025B, ((p)object1), 0), null, null, null, null, 0.0f, null, ((p)object1), 0x30, 0x7C);  // drawable:ic_minus_round_blue_24
                e.b(((p)object1), c.n(g0.l.X, 8.0f));
                m2.b(w.S(0x7F120441, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((p)object1), 0, 0, 0x1FFFE);  // string:transfer_out "Transfer out"
                return t.a;
            }
            case 1: {
                int v2 = ((Number)object2).intValue();
                j.f(((y0)object0), "$this$SwipeToDismissBox");
                if((v2 & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                R2.f.m(c.c(g0.l.X, 1.0f), d.h(0x7F060016, ((p)object1)), d.h(0x7F06018F, ((p)object1)), ((p)object1), 6, 0);  // color:Gray400
                return t.a;
            }
            default: {
                int v = ((Number)object2).intValue();
                j.f(((y0)object0), "$this$WavePrimaryButton");
                if((v & 17) == 16 && ((p)object1).x()) {
                    ((p)object1).K();
                    return t.a;
                }
                m2.b(w.S(0x7F12002B, ((p)object1)), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, ((p)object1), 0, 0, 0x1FFFE);  // string:activate_card "Activate card"
                return t.a;
            }
        }
    }
}

