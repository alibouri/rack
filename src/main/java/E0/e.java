package e0;

import kotlin.jvm.functions.Function1;

public final class e extends g {
    public final Function1 e;
    public final g f;

    public e(int v, k k0, Function1 function10, g g0) {
        super(v, k0);
        this.e = function10;
        this.f = g0;
        g0.k();
    }

    @Override  // e0.g
    public final void c() {
        if(!this.c) {
            g g0 = this.f;
            if(this.b != g0.d()) {
                this.a();
            }
            g0.l();
            this.c = true;
            Object object0 = m.b;
            synchronized(object0) {
                int v1 = this.d;
                if(v1 >= 0) {
                    m.v(v1);
                    this.d = -1;
                }
            }
        }
    }

    @Override  // e0.g
    public final Function1 f() {
        return this.e;
    }

    @Override  // e0.g
    public final boolean g() {
        return true;
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
    }

    @Override  // e0.g
    public final void n(t t0) {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override  // e0.g
    public final g t(Function1 function10) {
        return new e(this.b, this.a, m.l(function10, this.e, true), this.f);
    }
}

