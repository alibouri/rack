package ea;

import Ab.t;
import N.M0;
import P4.c;
import U.p;
import kotlin.jvm.functions.Function2;
import n0.v;
import yc.l;

public final class a implements Function2 {
    public static final a X;

    static {
        a.X = new a();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        M0.a(l.y(0x7F08025D, ((p)object0), 0), null, c.P(androidx.compose.foundation.layout.a.n(g0.l.X, 0.0f, 0.5f, 0.0f, 0.0f, 13), 0.7f), v.d, ((p)object0), 0xDB0, 0);  // drawable:ic_mobile_portrait_24px
        return t.a;
    }
}

