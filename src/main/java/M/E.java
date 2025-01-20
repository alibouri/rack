package M;

import Ab.t;
import I.X;
import M0.j;
import Nb.k;
import kotlin.jvm.functions.Function1;
import yc.d;

public final class e extends k implements Function1 {
    public final n X;
    public final boolean Y;
    public final boolean Z;

    public e(n n0, boolean z, boolean z1) {
        this.X = n0;
        this.Y = z;
        this.Z = z1;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        long v = this.X.b();
        ((j)object0).c(L.c, new K((this.Y ? X.Y : X.Z), v, (this.Z ? 1 : 3), d.o(v)));
        return t.a;
    }
}

