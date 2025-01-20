package u;

import a1.g;
import androidx.compose.ui.unit.IntSize;
import io.sentry.config.a;
import v.U;
import v.n0;
import v.o0;

public abstract class x {
    public static final o0 a;
    public static final U b;
    public static final U c;
    public static final U d;

    static {
        x.a = new o0(c.e0, c.f0);
        x.b = v.c.i(400.0f, 5, null);
        x.c = v.c.i(400.0f, 1, new g(0x100000001L));
        x.d = v.c.i(400.0f, 1, new IntSize(a.d(1, 1)));
    }

    public static C a(n0 n00, int v) {
        if((v & 1) != 0) {
            n00 = v.c.i(400.0f, 5, null);
        }
        return new C(new Q(new E(0.0f, n00), null, null, null, false, null, 62));
    }

    public static D b(n0 n00, int v) {
        if((v & 1) != 0) {
            n00 = v.c.i(400.0f, 5, null);
        }
        return new D(new Q(new E(0.0f, n00), null, null, null, false, null, 62));
    }
}

