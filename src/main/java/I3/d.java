package i3;

import Nb.j;
import j3.g;
import j3.i;

public final class d {
    public final i a;
    public final g b;
    public final j3.d c;
    public final b d;
    public final b e;

    public d(i i0, g g0, j3.d d0, b b0, b b1) {
        this.a = i0;
        this.b = g0;
        this.c = d0;
        this.d = b0;
        this.e = b1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 instanceof d) {
            ((d)object0).getClass();
            return j.a(null, null) && j.a(this.a, ((d)object0).a) && this.b == ((d)object0).b && j.a(null, null) && j.a(null, null) && j.a(null, null) && j.a(null, null) && j.a(null, null) && this.c == ((d)object0).c && j.a(null, null) && j.a(null, null) && this.d == ((d)object0).d && this.e == ((d)object0).e;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        b b0 = this.e;
        if(b0 != null) {
            v = b0.hashCode();
        }
        return ((((v1 * 0x1F + v2) * 887503681 + v3) * 0xE1781 + v4) * 0x1F + v) * 0x1F;
    }
}

