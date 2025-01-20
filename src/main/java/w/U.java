package w;

import a1.d;
import n0.U;
import n0.v;

public final class u {
    public final float a;
    public final U b;

    public u(float f, U u0) {
        this.a = f;
        this.b = u0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        return d.a(this.a, ((u)object0).a) ? this.b.equals(((u)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.b.a) + Float.floatToIntBits(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        return "BorderStroke(width=" + d.b(this.a) + ", brush=" + this.b + ')';
    }
}

