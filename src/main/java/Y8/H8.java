package Y8;

import Nb.j;

public final class h8 {
    public final i8 a;

    public h8(i8 i80) {
        this.a = i80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h8 ? j.a(this.a, ((h8)object0).a) : false;
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

