package Y8;

import Nb.j;

public final class q0 {
    public final r0 a;

    public q0(r0 r00) {
        this.a = r00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q0 ? j.a(this.a, ((q0)object0).a) : false;
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

