package e0;

import kotlin.jvm.functions.Function1;

public final class f extends g {
    public final Function1 e;
    public int f;

    public f(int v, k k0, Function1 function10) {
        super(v, k0);
        this.e = function10;
        this.f = 1;
    }

    @Override  // e0.g
    public final void c() {
        if(!this.c) {
            this.l();
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
        ++this.f;
    }

    @Override  // e0.g
    public final void l() {
        int v = this.f - 1;
        this.f = v;
        if(v == 0) {
            this.a();
        }
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
        m.d(this);
        return new e(this.b, this.a, m.l(function10, this.e, true), this);
    }
}

