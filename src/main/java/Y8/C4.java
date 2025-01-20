package Y8;

import Nb.j;

public final class c4 {
    public final e4 a;

    public c4(e4 e40) {
        this.a = e40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c4 ? j.a(this.a, ((c4)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AcceptUserOverdraftTerms(termsAndConditions=" + this.a + ")";
    }
}

