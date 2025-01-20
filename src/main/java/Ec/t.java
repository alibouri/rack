package Ec;

import Nb.j;
import java.util.concurrent.TimeUnit;

public final class t extends N {
    public N e;

    public t(N n0) {
        j.f(n0, "delegate");
        super();
        this.e = n0;
    }

    @Override  // Ec.N
    public final N a() {
        return this.e.a();
    }

    @Override  // Ec.N
    public final N b() {
        return this.e.b();
    }

    @Override  // Ec.N
    public final long c() {
        return this.e.c();
    }

    @Override  // Ec.N
    public final N d(long v) {
        return this.e.d(v);
    }

    @Override  // Ec.N
    public final boolean e() {
        return this.e.e();
    }

    @Override  // Ec.N
    public final void f() {
        this.e.f();
    }

    @Override  // Ec.N
    public final N g(long v, TimeUnit timeUnit0) {
        j.f(timeUnit0, "unit");
        return this.e.g(v, timeUnit0);
    }

    @Override  // Ec.N
    public final long h() {
        return this.e.h();
    }
}

