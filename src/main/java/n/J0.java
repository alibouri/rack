package N;

import n0.v;
import v1.r;

public final class j0 {
    public final long a;
    public final long b;
    public final long c;

    public j0(long v, long v1, long v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(j0.class != class0 || !v.c(this.a, ((j0)object0).a)) {
                return false;
            }
            return v.c(this.b, ((j0)object0).b) ? v.c(this.c, ((j0)object0).c) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.c) + r.c(v.i(this.a) * 0x1F, this.b, 0x1F);
    }
}

