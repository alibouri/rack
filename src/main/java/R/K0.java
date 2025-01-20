package R;

import Nb.j;
import Q.h;
import n0.v;
import v1.r;

public final class k0 {
    public final long a;
    public final h b;

    public k0() {
        this.a = v.i;
        this.b = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k0)) {
            return false;
        }
        return v.c(this.a, ((k0)object0).a) ? j.a(this.b, ((k0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = v.i(this.a);
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("RippleConfiguration(color=");
        r.h(this.a, ", rippleAlpha=", stringBuilder0);
        stringBuilder0.append(this.b);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

