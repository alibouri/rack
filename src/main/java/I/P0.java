package I;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function1;
import m0.b;
import z0.l;
import z0.n;

public final class p0 extends k implements Function1 {
    public final int X;
    public final v0 Y;

    public p0(v0 v00, int v) {
        this.X = v;
        this.Y = v00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            long v = l.i(((n)object0), false);
            this.Y.e(v);
            ((n)object0).a();
            return t.a;
        }
        this.Y.c(((b)object0).a);
        return t.a;
    }
}

