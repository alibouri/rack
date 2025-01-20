package f5;

import I2.J;
import M4.B;
import Nb.j;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import yc.l;

public abstract class a {
    public static final Set a;
    public static boolean b;

    static {
        a.a = Collections.newSetFromMap(new WeakHashMap());
    }

    public static final void a(Throwable throwable0, Object object0) {
        j.f(object0, "o");
        if(!a.b) {
            return;
        }
        a.a.add(object0);
        if(B.c()) {
            l.r(throwable0);
            J.k(throwable0, c5.a.c0).b();
        }
    }

    public static final boolean b(Object object0) {
        j.f(object0, "o");
        return a.a.contains(object0);
    }
}

