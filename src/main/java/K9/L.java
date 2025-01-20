package K9;

import Ab.k;
import Nb.a;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function3;

public final class l extends a implements Function3 {
    public static final l f0;

    static {
        l.f0 = new l(3, k.class, "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");  // initializer: LNb/a;-><init>(ILjava/lang/Class;Ljava/lang/String;)V
    }

    @Override  // kotlin.jvm.functions.Function3
    public final Object h(Object object0, Object object1, Object object2) {
        g g0 = (g)object2;
        return new k(((String)object0), ((Boolean)object1));
    }
}

