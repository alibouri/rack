package a9;

import n0.v;

public final class c {
    public final long a;
    public final double b;

    public c(long v, double f) {
        this.a = v;
        this.b = f;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        return v.c(this.a, ((c)object0).a) ? Double.compare(this.b, ((c)object0).b) == 0 : false;
    }

    @Override
    public final int hashCode() {
        long v = Double.doubleToLongBits(this.b);
        return v.i(this.a) * 0x1F + ((int)(v ^ v >>> 0x20));
    }

    @Override
    public final String toString() {
        return "ColorStop(color=" + v.j(this.a) + ", stop=" + this.b + ")";
    }
}

