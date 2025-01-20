package x;

import n0.v;
import v1.r;

public final class c {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public c(long v, long v1, long v2, long v3, long v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null || !(object0 instanceof c) || !v.c(this.a, ((c)object0).a)) {
            return false;
        }
        if(!v.c(this.b, ((c)object0).b)) {
            return false;
        }
        if(!v.c(this.c, ((c)object0).c)) {
            return false;
        }
        return v.c(this.d, ((c)object0).d) ? v.c(this.e, ((c)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.e) + r.c(r.c(r.c(v.i(this.a) * 0x1F, this.b, 0x1F), this.c, 0x1F), this.d, 0x1F);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ContextMenuColors(backgroundColor=");
        r.h(this.a, ", textColor=", stringBuilder0);
        r.h(this.b, ", iconColor=", stringBuilder0);
        r.h(this.c, ", disabledTextColor=", stringBuilder0);
        r.h(this.d, ", disabledIconColor=", stringBuilder0);
        stringBuilder0.append(v.j(this.e));
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

