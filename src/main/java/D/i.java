package D;

import A7.b;
import B.o;
import C.j;
import E.G;
import U.l0;
import U.p;
import c0.c;

public final class i implements G {
    public final A a;
    public final h b;
    public final b c;

    public i(A a0, h h0, b b0) {
        this.a = a0;
        this.b = h0;
        this.c = b0;
    }

    @Override  // E.G
    public final int a(Object object0) {
        return this.c.a(object0);
    }

    @Override  // E.G
    public final int b() {
        return this.b.b().Y;
    }

    @Override  // E.G
    public final Object c(int v) {
        Object object0 = this.c.k(v);
        return object0 == null ? this.b.c(v) : object0;
    }

    @Override  // E.G
    public final Object d(int v) {
        return this.b.a(v);
    }

    @Override  // E.G
    public final void e(int v, Object object0, p p0, int v1) {
        p0.S(0x5905C824);
        int v2 = (v1 & 6) == 0 ? (p0.d(v) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (p0.h(object0) ? 0x20 : 16);
        }
        if((v1 & 0x180) == 0) {
            v2 |= (p0.f(this) ? 0x100 : 0x80);
        }
        if((v2 & 0x93) != 0x92 || !p0.x()) {
            c0.b b0 = c.c(0x2B48C518, new o(v, 2, this), p0);
            E.A.b(object0, v, this.a.o, b0, p0, v2 >> 3 & 14 | 0xC00 | v2 << 3 & 0x70);
        }
        else {
            p0.K();
        }
        l0 l00 = p0.r();
        if(l00 != null) {
            l00.d = new j(this, v, object0, v1, 1);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof i ? Nb.j.a(this.b, ((i)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}

