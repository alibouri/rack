package S9;

import Ab.t;
import B.e;
import U.p;
import androidx.compose.foundation.layout.c;
import g0.l;
import kotlin.jvm.functions.Function2;

public final class j implements Function2 {
    public static final j X;

    static {
        j.X = new j();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((p)object0).x()) {
            ((p)object0).K();
            return t.a;
        }
        e.b(((p)object0), c.n(l.X, 1.0f));
        return t.a;
    }
}

