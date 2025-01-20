package Y9;

import n0.v;

public final class c implements d {
    public final long a;
    public final long b;

    public c(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        return v.c(this.a, ((c)object0).a) ? v.c(this.b, ((c)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.b) + v.i(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        return "TallGradient(c1=" + v.j(this.a) + ", c2=" + v.j(this.b) + ")";
    }
}

