package cb;

import Ab.t;
import J2.w;
import N.M0;
import U.p;
import androidx.compose.foundation.layout.c;
import kotlin.jvm.functions.Function2;
import n0.v;
import yc.l;

public final class i implements Function2 {
    public final float X;

    public i(float f) {
        this.X = f;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        M0.a(l.y(0x7F080204, ((p)object0), 0), w.S(0x7F1200BD, ((p)object0)), c.l(g0.l.X, this.X, this.X), v.i, ((p)object0), 0xC00, 0);  // drawable:ic_cancel_grey_20
        return t.a;
    }
}

