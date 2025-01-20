package N;

import A.k;
import F0.m;
import Nb.j;
import U.p;
import a1.d;
import m5.b;
import n0.v;
import w.Y;
import w.c0;
import w.m0;

public final class f1 implements c0 {
    public final boolean a;
    public final float b;
    public final long c;

    public f1(boolean z, float f, long v) {
        this.a = z;
        this.b = f;
        this.c = v;
    }

    @Override  // w.X
    public final Y a(k k0, p p0) {
        p0.Q(0x4AF582F5);
        p0.p(false);
        return m0.Y;
    }

    @Override  // w.c0
    public final m b(k k0) {
        l0 l00 = new l0(1, this);
        return new n0(k0, this.a, this.b, l00, 0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f1)) {
            return false;
        }
        if(this.a != ((f1)object0).a) {
            return false;
        }
        if(!d.a(this.b, ((f1)object0).b)) {
            return false;
        }
        return j.a(null, null) ? v.c(this.c, ((f1)object0).c) : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? v.i(this.c) + b.p(0x9511, this.b, 961) : v.i(this.c) + b.p(0x95CB, this.b, 961);
    }
}

