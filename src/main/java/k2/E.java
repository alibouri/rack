package k2;

import Nb.j;
import kotlin.jvm.functions.Function2;

public final class e extends Z0 {
    public final g d;

    public e(g g0) {
        this.d = g0;
        super();
    }

    @Override  // k2.Z0
    public final void a(g0 g00, e0 e00) {
        j.f(g00, "type");
        j.f(e00, "state");
        for(Object object0: this.d.i) {
            ((Function2)object0).j(g00, e00);
        }
    }
}

