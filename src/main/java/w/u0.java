package w;

import m0.b;
import yc.d;

public final class u0 extends s0 {
    @Override  // w.s0
    public final void a(float f, long v, long v1) {
        if(!Float.isNaN(f)) {
            this.a.setZoom(f);
        }
        if(d.o(v1)) {
            this.a.show(b.d(v), b.e(v), b.d(v1), b.e(v1));
            return;
        }
        this.a.show(b.d(v), b.e(v));
    }
}

