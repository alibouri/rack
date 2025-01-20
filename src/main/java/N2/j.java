package N2;

import Nb.k;
import O2.e;
import kotlin.jvm.functions.Function1;

public final class j extends k implements Function1 {
    public static final j X;

    static {
        j.X = new j(1);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Nb.j.f(((e)object0), "it");
        return ((e)object0).getClass().getSimpleName();
    }
}

