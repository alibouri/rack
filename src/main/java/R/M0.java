package R;

import A.k;
import F0.m;
import N.l0;
import N.n0;
import Nb.j;
import U.p;
import a1.d;
import m5.b;
import n0.v;
import w.Y;
import w.c0;

public final class m0 implements c0 {
    public final boolean a;
    public final float b;
    public final long c;

    public m0(boolean z, float f, long v) {
        this.a = z;
        this.b = f;
        this.c = v;
    }

    @Override  // w.X
    public final Y a(k k0, p p0) {
        p0.Q(0x4AF582F5);
        p0.p(false);
        return w.m0.Y;
    }

    @Override  // w.c0
    public final m b(k k0) {
        l0 l00 = new l0(3, this);
        return new n0(k0, this.a, this.b, l00, 1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m0)) {
            return false;
        }
        if(this.a != ((m0)object0).a) {
            return false;
        }
        if(!d.a(this.b, ((m0)object0).b)) {
            return false;
        }
        return j.a(null, null) ? v.c(this.c, ((m0)object0).c) : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? v.i(this.c) + b.p(0x9511, this.b, 961) : v.i(this.c) + b.p(0x95CB, this.b, 961);
    }
}

