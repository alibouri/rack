package R2;

import A3.e;
import Nb.j;
import v.h;

public final class n {
    public String a;
    public int b;

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        return j.a(this.a, ((n)object0).a) ? this.b == ((n)object0).b : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return h.d(this.b) + v * 0x1F;
    }

    @Override
    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + e.B(this.b) + ')';
    }
}

