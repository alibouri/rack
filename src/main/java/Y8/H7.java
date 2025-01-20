package Y8;

import Nb.j;

public final class h7 {
    public final i7 a;

    public h7(i7 i70) {
        this.a = i70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h7 ? j.a(this.a, ((h7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ResendSMS(token=" + this.a + ")";
    }
}

