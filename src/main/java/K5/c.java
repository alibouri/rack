package k5;

import N.Q;
import N.n2;
import Nb.j;

public final class c {
    public final Q a;
    public final n2 b;

    public c(Q q0, n2 n20) {
        this.a = q0;
        this.b = n20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c)) {
            return false;
        }
        return j.a(this.a, ((c)object0).a) ? j.a(this.b, ((c)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        n2 n20 = this.b;
        if(n20 != null) {
            v = n20.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "ThemeParameters(colors=" + this.a + ", typography=" + this.b + ')';
    }
}

