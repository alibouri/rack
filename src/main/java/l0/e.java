package l0;

import Aa.s;
import F0.m;
import ha.a0;
import s.E;

public final class e {
    public final s a;
    public final a0 b;
    public final E c;
    public final E d;
    public final E e;
    public final E f;

    public e(s s0, a0 a00) {
        this.a = s0;
        this.b = a00;
        this.c = new E();
        this.d = new E();
        this.e = new E();
        this.f = new E();
    }

    // Deobfuscation rating: LOW(30)
    public final boolean a() {
        return this.c.h() || this.e.h() || this.d.h();
    }

    public final void b(E e0, m m0) {
        if(e0.a(m0) && this.c.d + this.d.d + this.e.d == 1) {
            a0 a00 = new a0(0, this, e.class, "invalidateNodes", "invalidateNodes()V", 0, 15);
            this.a.n(a00);
        }
    }
}

