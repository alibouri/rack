package L;

import E.h0;
import I.f0;
import M.F;
import M.g0;
import M.i0;
import M.m;
import U.t0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import m5.b;
import s.v;
import z0.l;

public final class h implements t0 {
    public final long X;
    public final g0 Y;
    public final long Z;
    public j b0;
    public m c0;
    public final Modifier d0;

    public h(long v, g0 g00, long v1) {
        this.X = v;
        this.Y = g00;
        this.Z = v1;
        this.b0 = j.c;
        g g0 = new g(this, 0);
        i i0 = new i(g0, g00, v);
        h0 h00 = new h0(g0, g00, v);
        this.d0 = l.h(new SuspendPointerInputElement(h00, i0, new F(h00, i0, null), 4), f0.b);
    }

    @Override  // U.t0
    public final void a() {
        g g0 = new g(this, 1);
        g g1 = new g(this, 2);
        long v = this.X;
        m m0 = new m(v, g0, g1);
        i0 i00 = (i0)this.Y;
        if(v == 0L) {
            throw new IllegalArgumentException(b.t(0L, "The selectable contains an invalid id: ").toString());
        }
        v v1 = i00.c;
        if(v1.b(v)) {
            throw new IllegalArgumentException(("Another selectable with the id: " + m0 + ".selectableId has already subscribed.").toString());
        }
        v1.g(v, m0);
        i00.b.add(m0);
        i00.a = false;
        this.c0 = m0;
    }

    @Override  // U.t0
    public final void c() {
        m m0 = this.c0;
        if(m0 != null) {
            ((i0)this.Y).d(m0);
            this.c0 = null;
        }
    }

    @Override  // U.t0
    public final void d() {
        m m0 = this.c0;
        if(m0 != null) {
            ((i0)this.Y).d(m0);
            this.c0 = null;
        }
    }
}

