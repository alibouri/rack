package q2;

import Fb.c;
import N4.j;
import Xb.J;
import Xb.i0;
import Xb.k;
import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import kotlin.coroutines.i;
import yc.l;

public abstract class h {
    public static Object a(v v0, CancellationSignal cancellationSignal0, Callable callable0, c c0) {
        if(v0.m() && v0.j()) {
            return callable0.call();
        }
        G g0 = (G)c0.a().l(G.Z);
        i i0 = g0 == null ? l.v(v0) : g0.X;
        k k0 = new k(1, j.w(c0));
        k0.v();
        g g1 = new g(callable0, k0, null);
        k0.y(new T0.G(cancellationSignal0, 19, J.q(i0.X, i0, null, g1, 2)));
        return k0.u();
    }
}

