package K9;

import Ab.t;
import M6.b;
import P4.c;
import U.p;
import kotlin.jvm.functions.Function2;
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
        b.d(l.y(0x7F08031C, ((p)object0), 0), null, androidx.compose.foundation.layout.a.n(c.P(g0.l.X, 1.2f), 4.0f, 0.0f, 0.0f, 0.0f, 14), null, null, 0.0f, null, ((p)object0), 0x1B0, 120);  // drawable:scan_qr_send
        return t.a;
    }
}

