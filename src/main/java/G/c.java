package G;

import A.k;
import D0.a0;
import M0.g;
import M0.j;
import M0.q;
import M0.s;
import N0.a;
import Tb.e;
import kotlin.jvm.functions.Function1;
import w.c0;
import w.v;

public final class c extends v {
    public boolean F0;
    public Function1 G0;
    public final a0 H0;

    public c(boolean z, k k0, c0 c00, boolean z1, g g0, Function1 function10) {
        super(k0, c00, z1, null, g0, new b(0, function10, z));
        this.F0 = z;
        this.G0 = function10;
        this.H0 = new a0(9, this);
    }

    @Override  // w.j
    public final void A0(j j0) {
        a a0 = this.F0 ? a.X : a.Y;
        e e0 = s.a[22];
        q.B.a(j0, a0);
    }
}

