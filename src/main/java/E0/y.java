package e0;

import U.d;
import kotlin.jvm.functions.Function1;

public final class y extends g {
    public final g e;
    public final boolean f;
    public Function1 g;
    public final long h;

    public y(g g0, Function1 function10, boolean z) {
        super(0, k.c0);
        Function1 function11;
        this.e = g0;
        this.f = z;
        if(g0 == null) {
            function11 = ((b)m.i.get()).e;
        }
        else {
            function11 = g0.f();
            if(function11 == null) {
                function11 = ((b)m.i.get()).e;
            }
        }
        this.g = m.l(function10, function11, false);
        this.h = d.s();
    }

    @Override  // e0.g
    public final void c() {
        this.c = true;
        if(this.f) {
            g g0 = this.e;
            if(g0 != null) {
                g0.c();
            }
        }
    }

    @Override  // e0.g
    public final int d() {
        return this.u().d();
    }

    @Override  // e0.g
    public final k e() {
        return this.u().e();
    }

    @Override  // e0.g
    public final Function1 f() {
        return this.g;
    }

    @Override  // e0.g
    public final boolean g() {
        return this.u().g();
    }

    @Override  // e0.g
    public final Function1 i() {
        return null;
    }

    @Override  // e0.g
    public final void k() {
        q.i();
        throw null;
    }

    @Override  // e0.g
    public final void l() {
        q.i();
        throw null;
    }

    @Override  // e0.g
    public final void m() {
        this.u().m();
    }

    @Override  // e0.g
    public final void n(t t0) {
        this.u().n(t0);
    }

    @Override  // e0.g
    public final g t(Function1 function10) {
        Function1 function11 = m.l(function10, this.g, true);
        return m.h(this.u().t(null), function11, true);
    }

    public final g u() {
        return this.e == null ? ((g)m.i.get()) : this.e;
    }
}

