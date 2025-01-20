package v9;

import Ab.t;
import U.p;
import kotlin.jvm.functions.Function3;

public final class j implements Function3 {
    public static final j X;

    static {
        j.X = new j();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        Nb.j.f(((a)object0), "it");
        if((v & 17) == 16 && ((p)object1).x()) {
            ((p)object1).K();
        }
        return t.a;
    }
}

