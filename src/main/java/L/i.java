package L;

import I.v0;
import M.V;
import M.g0;
import M.i0;
import M.j0;
import M.r;
import M.s;
import M.x;
import androidx.compose.ui.layout.LayoutCoordinates;
import m0.b;

public final class i implements v0 {
    public long a;
    public long b;
    public final g c;
    public final g0 d;
    public final long e;

    public i(g g0, g0 g00, long v) {
        this.c = g0;
        this.d = g00;
        this.e = v;
        this.a = 0L;
        this.b = 0L;
    }

    @Override  // I.v0
    public final void a() {
        g0 g00 = this.d;
        if(j0.a(g00, this.e)) {
            x x0 = ((i0)g00).h;
            if(x0 != null) {
                x0.invoke();
            }
        }
    }

    @Override  // I.v0
    public final void b() {
    }

    @Override  // I.v0
    public final void c(long v) {
        LayoutCoordinates layoutCoordinates0 = (LayoutCoordinates)this.c.invoke();
        g0 g00 = this.d;
        if(layoutCoordinates0 != null) {
            if(!layoutCoordinates0.r()) {
                return;
            }
            r r0 = s.e;
            V v1 = ((i0)g00).f;
            if(v1 != null) {
                v1.r(Boolean.TRUE, layoutCoordinates0, new b(v), r0);
            }
            this.a = v;
        }
        if(!j0.a(g00, this.e)) {
            return;
        }
        this.b = 0L;
    }

    @Override  // I.v0
    public final void d() {
    }

    @Override  // I.v0
    public final void e(long v) {
        Object object0 = this.c.invoke();
        if(((LayoutCoordinates)object0) == null || !((LayoutCoordinates)object0).r()) {
            return;
        }
        g0 g00 = this.d;
        if(!j0.a(g00, this.e)) {
            return;
        }
        long v1 = b.i(this.b, v);
        this.b = v1;
        long v2 = b.i(this.a, v1);
        if(((i0)g00).b(((LayoutCoordinates)object0), v2, this.a, s.e, true)) {
            this.a = v2;
            this.b = 0L;
        }
    }

    @Override  // I.v0
    public final void onCancel() {
        g0 g00 = this.d;
        if(j0.a(g00, this.e)) {
            x x0 = ((i0)g00).h;
            if(x0 != null) {
                x0.invoke();
            }
        }
    }
}

