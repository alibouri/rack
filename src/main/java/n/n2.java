package N;

import A3.e;
import Bb.q;
import Nb.j;
import O0.O;
import T0.l;
import T0.w;

public final class n2 {
    public final O a;
    public final O b;
    public final O c;
    public final O d;
    public final O e;
    public final O f;
    public final O g;
    public final O h;
    public final O i;
    public final O j;
    public final O k;
    public final O l;
    public final O m;

    public n2(l l0, int v) {
        l l1 = (v & 1) == 0 ? l0 : l.X;
        super();
        this.a = o2.a(O.a(o2.a, 0L, q.C(0x60), w.j0, null, q.B(-1.5), null, q.C(0x70), null, null, 0xFDFF79), l1);
        this.b = o2.a(O.a(o2.a, 0L, q.C(60), w.j0, null, q.B(-0.5), null, q.C(72), null, null, 0xFDFF79), l1);
        this.c = o2.a(O.a(o2.a, 0L, q.C(0x30), w.k0, null, q.C(0), null, q.C(56), null, null, 0xFDFF79), l1);
        this.d = o2.a(O.a(o2.a, 0L, q.C(34), w.k0, null, q.B(0.25), null, q.C(36), null, null, 0xFDFF79), l1);
        this.e = o2.a(O.a(o2.a, 0L, q.C(24), w.k0, null, q.C(0), null, q.C(24), null, null, 0xFDFF79), l1);
        this.f = o2.a(O.a(o2.a, 0L, q.C(20), w.l0, null, q.B(0.15), null, q.C(24), null, null, 0xFDFF79), l1);
        this.g = o2.a(O.a(o2.a, 0L, q.C(16), w.k0, null, q.B(0.15), null, q.C(24), null, null, 0xFDFF79), l1);
        this.h = o2.a(O.a(o2.a, 0L, q.C(14), w.l0, null, q.B(0.1), null, q.C(24), null, null, 0xFDFF79), l1);
        this.i = o2.a(O.a(o2.a, 0L, q.C(16), w.k0, null, q.B(0.5), null, q.C(24), null, null, 0xFDFF79), l1);
        this.j = o2.a(O.a(o2.a, 0L, q.C(14), w.k0, null, q.B(0.25), null, q.C(20), null, null, 0xFDFF79), l1);
        this.k = o2.a(O.a(o2.a, 0L, q.C(14), w.l0, null, q.B(1.25), null, q.C(16), null, null, 0xFDFF79), l1);
        this.l = o2.a(O.a(o2.a, 0L, q.C(12), w.k0, null, q.B(0.4), null, q.C(16), null, null, 0xFDFF79), l1);
        this.m = o2.a(O.a(o2.a, 0L, q.C(10), w.k0, null, q.B(1.5), null, q.C(16), null, null, 0xFDFF79), l1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n2)) {
            return false;
        }
        if(!j.a(this.a, ((n2)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((n2)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((n2)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((n2)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((n2)object0).e)) {
            return false;
        }
        if(!j.a(this.f, ((n2)object0).f)) {
            return false;
        }
        if(!j.a(this.g, ((n2)object0).g)) {
            return false;
        }
        if(!j.a(this.h, ((n2)object0).h)) {
            return false;
        }
        if(!j.a(this.i, ((n2)object0).i)) {
            return false;
        }
        if(!j.a(this.j, ((n2)object0).j)) {
            return false;
        }
        if(!j.a(this.k, ((n2)object0).k)) {
            return false;
        }
        return j.a(this.l, ((n2)object0).l) ? j.a(this.m, ((n2)object0).m) : false;
    }

    @Override
    public final int hashCode() {
        return this.m.hashCode() + e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(e.r(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c), 0x1F, this.d), 0x1F, this.e), 0x1F, this.f), 0x1F, this.g), 0x1F, this.h), 0x1F, this.i), 0x1F, this.j), 0x1F, this.k), 0x1F, this.l);
    }

    @Override
    public final String toString() {
        return "Typography(h1=" + this.a + ", h2=" + this.b + ", h3=" + this.c + ", h4=" + this.d + ", h5=" + this.e + ", h6=" + this.f + ", subtitle1=" + this.g + ", subtitle2=" + this.h + ", body1=" + this.i + ", body2=" + this.j + ", button=" + this.k + ", caption=" + this.l + ", overline=" + this.m + ')';
    }
}

