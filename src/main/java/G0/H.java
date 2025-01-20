package g0;

import Nb.k;
import kotlin.jvm.functions.Function2;

public final class h extends k implements Function2 {
    public static final h X;

    static {
        h.X = new h(2);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((String)object0).length() == 0 ? ((m)object1).toString() : ((String)object0) + ", " + ((m)object1);
    }
}

