package Y8;

import Nb.j;

public final class u {
    public final v a;

    public u(v v0) {
        this.a = v0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof u ? j.a(this.a, ((u)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Session(user=" + this.a + ")";
    }
}

