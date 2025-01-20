package Y8;

import Nb.j;

public final class p {
    public final r a;

    public p(r r0) {
        this.a = r0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof p ? j.a(this.a, ((p)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AgreeToTerms(wallet=" + this.a + ")";
    }
}

