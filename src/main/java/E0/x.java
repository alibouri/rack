package e0;

import U.d;
import kotlin.jvm.functions.Function1;
import s.E;

public final class x extends c {
    public final c o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    public x(c c0, Function1 function10, Function1 function11, boolean z, boolean z1) {
        Function1 function14;
        Function1 function12;
        k k0 = k.c0;
        if(c0 == null) {
            function12 = ((b)m.i.get()).e;
        }
        else {
            function12 = c0.x();
            if(function12 == null) {
                function12 = ((b)m.i.get()).e;
            }
        }
        Function1 function13 = m.l(function10, function12, z);
        if(c0 == null) {
            function14 = ((b)m.i.get()).f;
        }
        else {
            function14 = c0.i();
            if(function14 == null) {
                function14 = ((b)m.i.get()).f;
            }
        }
        super(0, k0, function13, m.b(function11, function14));
        this.o = c0;
        this.p = z;
        this.q = z1;
        this.r = this.e;
        this.s = this.f;
        this.t = d.s();
    }

    @Override  // e0.c
    public final void B(E e0) {
        q.i();
        throw null;
    }

    @Override  // e0.c
    public final c C(Function1 function10, Function1 function11) {
        Function1 function12 = m.l(function10, this.r, true);
        Function1 function13 = m.b(function11, this.s);
        return !this.p ? new x(this.D().C(null, function13), function12, function13, false, true) : this.D().C(function12, function13);
    }

    public final c D() {
        return this.o == null ? ((c)m.i.get()) : this.o;
    }

    @Override  // e0.c
    public final void c() {
        this.c = true;
        if(this.q) {
            c c0 = this.o;
            if(c0 != null) {
                c0.c();
            }
        }
    }

    @Override  // e0.g
    public final int d() {
        return this.D().d();
    }

    @Override  // e0.g
    public final k e() {
        return this.D().e();
    }

    @Override  // e0.c
    public final Function1 f() {
        return this.r;
    }

    @Override  // e0.c
    public final boolean g() {
        return this.D().g();
    }

    @Override  // e0.c
    public final int h() {
        return this.D().h();
    }

    @Override  // e0.c
    public final Function1 i() {
        return this.s;
    }

    @Override  // e0.c
    public final void k() {
        q.i();
        throw null;
    }

    @Override  // e0.c
    public final void l() {
        q.i();
        throw null;
    }

    @Override  // e0.c
    public final void m() {
        this.D().m();
    }

    @Override  // e0.c
    public final void n(t t0) {
        this.D().n(t0);
    }

    @Override  // e0.g
    public final void q(int v) {
        q.i();
        throw null;
    }

    @Override  // e0.g
    public final void r(k k0) {
        q.i();
        throw null;
    }

    @Override  // e0.c
    public final void s(int v) {
        this.D().s(v);
    }

    @Override  // e0.c
    public final g t(Function1 function10) {
        Function1 function11 = m.l(function10, this.r, true);
        return this.p ? this.D().t(function11) : m.h(this.D().t(null), function11, true);
    }

    @Override  // e0.c
    public final q v() {
        return this.D().v();
    }

    @Override  // e0.c
    public final E w() {
        return this.D().w();
    }

    @Override  // e0.c
    public final Function1 x() {
        return this.r;
    }
}

