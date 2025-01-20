package N;

import n0.v;
import v1.r;

public final class b0 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public b0(long v, long v1, long v2, long v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(b0.class != class0 || !v.c(this.a, ((b0)object0).a)) {
                return false;
            }
            if(!v.c(this.b, ((b0)object0).b)) {
                return false;
            }
            return v.c(this.c, ((b0)object0).c) ? v.c(this.d, ((b0)object0).d) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.d) + r.c(r.c(v.i(this.a) * 0x1F, this.b, 0x1F), this.c, 0x1F);
    }
}

