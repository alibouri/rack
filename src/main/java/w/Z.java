package w;

import Ab.t;
import M0.a;
import M0.i;
import U0.D;
import Xb.H;
import ha.O0;
import kotlin.jvm.functions.Function0;
import y.t1;

public final class z extends j {
    public String F0;
    public Function0 G0;
    public Function0 H0;

    @Override  // w.j
    public final void A0(M0.j j0) {
        if(this.G0 != null) {
            a a0 = new a(this.F0, new D(23, this));
            j0.c(i.c, a0);
        }
    }

    @Override  // w.j
    public final Object B0(z0.z z0, w.i i0) {
        boolean z1 = this.r0;
        y y0 = !z1 || this.H0 == null ? null : new y(this, 0);
        y y1 = !z1 || this.G0 == null ? null : new y(this, 1);
        Object object0 = H.c(new t1(z0, new O0(this, null, 2), y1, y0, new y(this, 2), null), i0);
        Eb.a a0 = Eb.a.X;
        Object object1 = t.a;
        if(object0 != a0) {
            object0 = object1;
        }
        return object0 == a0 ? object0 : object1;
    }
}

