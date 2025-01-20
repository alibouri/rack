package w;

import B.q0;
import B.r0;
import Nb.j;
import n0.v;
import v1.r;

public final class n0 {
    public final long a;
    public final q0 b;

    public n0() {
        r0 r00 = new r0(0.0f, 0.0f, 0.0f, 0.0f);
        super();
        this.a = 0xFF66666600000000L;
        this.b = r00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        Class class0 = object0 == null ? null : object0.getClass();
        if(!n0.class.equals(class0)) {
            return false;
        }
        j.d(object0, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        return v.c(this.a, ((n0)object0).a) ? j.a(this.b, ((n0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + v.i(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OverscrollConfiguration(glowColor=");
        r.h(this.a, ", drawPadding=", stringBuilder0);
        stringBuilder0.append(this.b);
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

