package E;

import F0.n0;
import M0.a;
import M0.b;
import M0.h;
import M0.i;
import M0.j;
import M0.q;
import M0.s;
import Tb.c;
import Tb.e;
import g0.n;
import y.q0;

public final class a0 extends n implements n0 {
    public c l0;
    public W m0;
    public q0 n0;
    public boolean o0;
    public boolean p0;
    public h q0;
    public final Y r0;
    public Y s0;

    public a0(c c0, W w0, q0 q00, boolean z, boolean z1) {
        this.l0 = c0;
        this.m0 = w0;
        this.n0 = q00;
        this.o0 = z;
        this.p0 = z1;
        this.r0 = new Y(this, 0);
        this.x0();
    }

    @Override  // F0.n0
    public final boolean Z() {
        return false;
    }

    @Override  // F0.n0
    public final boolean c0() {
        return false;
    }

    @Override  // g0.n
    public final boolean m0() {
        return false;
    }

    @Override  // F0.n0
    public final void o(j j0) {
        s.g(j0);
        j0.c(q.E, this.r0);
        if(this.n0 == q0.X) {
            h h0 = this.q0;
            if(h0 != null) {
                e e0 = s.a[11];
                q.p.a(j0, h0);
                goto label_14;
            }
            Nb.j.p("scrollAxisRange");
            throw null;
        }
        h h1 = this.q0;
        if(h1 != null) {
            e e1 = s.a[10];
            q.o.a(j0, h1);
        label_14:
            Y y0 = this.s0;
            if(y0 != null) {
                a a0 = new a(null, y0);
                j0.c(i.f, a0);
            }
            a a1 = new a(null, new Bb.a(21, new X(this, 0)));
            j0.c(i.A, a1);
            b b0 = this.m0.c();
            e e2 = s.a[20];
            q.f.a(j0, b0);
            return;
        }
        Nb.j.p("scrollAxisRange");
        throw null;
    }

    public final void x0() {
        this.q0 = new h(new X(this, 1), new X(this, 2), this.p0);
        this.s0 = this.o0 ? new Y(this, 1) : null;
    }
}

