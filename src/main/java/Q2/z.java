package q2;

import Fb.c;
import N4.j;
import S2.h;
import Xb.J;
import Xb.k;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function1;

public abstract class z {
    public static final Object a(v v0, Function1 function10, c c0) {
        y y0 = new y(v0, function10, null);
        G g0 = (G)c0.a().l(G.Z);
        i i0 = g0 == null ? null : g0.X;
        if(i0 != null) {
            return J.y(i0, y0, c0);
        }
        CoroutineContext coroutineContext0 = c0.a();
        k k0 = new k(1, j.w(c0));
        k0.v();
        try {
            h h0 = v0.c;
            if(h0 != null) {
                h0.execute(new x(coroutineContext0, k0, v0, y0));
                return k0.u();
            }
            Nb.j.p("internalTransactionExecutor");
            throw null;
        }
        catch(RejectedExecutionException rejectedExecutionException0) {
        }
        k0.o(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", rejectedExecutionException0));
        return k0.u();
    }
}

