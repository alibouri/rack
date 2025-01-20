package M;

import n0.v;
import v1.r;

public final class u0 {
    public final long a;
    public final long b;

    public u0(long v, long v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u0)) {
            return false;
        }
        return v.c(this.a, ((u0)object0).a) ? v.c(this.b, ((u0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.b) + v.i(this.a) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SelectionColors(selectionHandleColor=");
        r.h(this.a, ", selectionBackgroundColor=", stringBuilder0);
        stringBuilder0.append(v.j(this.b));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

