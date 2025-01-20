package j3;

import Nb.j;
import yc.l;

public final class h {
    public final l a;
    public final l b;
    public static final h c;

    static {
        h.c = new h(b.b, b.b);
    }

    public h(l l0, l l1) {
        this.a = l0;
        this.b = l1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h)) {
            return false;
        }
        return j.a(this.a, ((h)object0).a) ? j.a(this.b, ((h)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}

