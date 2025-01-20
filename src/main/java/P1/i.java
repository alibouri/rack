package p1;

import o1.d;
import o1.h;

public final class i extends o {
    @Override  // p1.e
    public final void a(e e0) {
        f f0 = this.h;
        if(!f0.c) {
            return;
        }
        if(f0.j) {
            return;
        }
        f0.d(((int)(((float)((f)f0.l.get(0)).g) * ((h)this.b).r0 + 0.5f)));
    }

    @Override  // p1.o
    public final void d() {
        d d0 = this.b;
        int v = ((h)d0).s0;
        int v1 = ((h)d0).t0;
        f f0 = this.h;
        if(((h)d0).v0 == 1) {
            if(v != -1) {
                f0.l.add(d0.U.d.h);
                this.b.U.d.h.k.add(f0);
                f0.f = v;
            }
            else if(v1 == -1) {
                f0.b = true;
                f0.l.add(d0.U.d.i);
                this.b.U.d.i.k.add(f0);
            }
            else {
                f0.l.add(d0.U.d.i);
                this.b.U.d.i.k.add(f0);
                f0.f = -v1;
            }
            this.m(this.b.d.h);
            this.m(this.b.d.i);
            return;
        }
        if(v != -1) {
            f0.l.add(d0.U.e.h);
            this.b.U.e.h.k.add(f0);
            f0.f = v;
        }
        else if(v1 == -1) {
            f0.b = true;
            f0.l.add(d0.U.e.i);
            this.b.U.e.i.k.add(f0);
        }
        else {
            f0.l.add(d0.U.e.i);
            this.b.U.e.i.k.add(f0);
            f0.f = -v1;
        }
        this.m(this.b.e.h);
        this.m(this.b.e.i);
    }

    @Override  // p1.o
    public final void e() {
        d d0 = this.b;
        f f0 = this.h;
        if(((h)d0).v0 == 1) {
            d0.Z = f0.g;
            return;
        }
        d0.a0 = f0.g;
    }

    @Override  // p1.o
    public final void f() {
        this.h.c();
    }

    @Override  // p1.o
    public final boolean k() {
        return false;
    }

    public final void m(f f0) {
        this.h.k.add(f0);
        f0.l.add(this.h);
    }
}

