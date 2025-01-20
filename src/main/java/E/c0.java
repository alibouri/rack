package E;

import Nb.k;
import d0.b;
import d0.c;
import java.util.Map;
import kotlin.jvm.functions.Function2;

public final class c0 extends k implements Function2 {
    public static final c0 X;

    static {
        c0.X = new c0(2);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        b b0 = (b)object0;
        c c0 = (c)((d0)object1).b.getValue();
        if(c0 != null) {
            for(Object object2: ((d0)object1).c) {
                c0.e(object2);
            }
        }
        Object object3 = ((d0)object1).a.d();
        return ((Map)object3).isEmpty() ? null : object3;
    }
}

