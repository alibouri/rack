package T1;

import Ab.t;
import Nb.j;
import Nb.k;
import Xb.s;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

public final class p extends k implements Function2 {
    public static final p X;

    static {
        p.X = new p(2);  // initializer: LNb/k;-><init>(I)V
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Throwable throwable0 = (Throwable)object1;
        j.f(((n)object0), "msg");
        if(((n)object0) instanceof m) {
            if(throwable0 == null) {
                throwable0 = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            s s0 = new s(throwable0, false);
            ((m)(((n)object0))).b.b0(s0);
        }
        return t.a;
    }
}

