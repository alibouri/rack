package a9;

import M.J;
import n0.v;

public final class g {
    public final long a;

    public g(long v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g ? v.c(this.a, ((g)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return v.i(this.a);
    }

    @Override
    public final String toString() {
        return J.e("OnAnnouncementSolidColorBackground(color=", v.j(this.a), ")");
    }
}

