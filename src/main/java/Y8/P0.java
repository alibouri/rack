package Y8;

import Nb.j;

public final class p0 {
    public final n0 a;

    public p0(n0 n00) {
        this.a = n00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof p0 ? j.a(this.a, ((p0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "ScratchCards(claimedCards=" + this.a + ")";
    }
}

