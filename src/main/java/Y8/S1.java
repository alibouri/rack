package Y8;

import Nb.j;

public final class s1 {
    public final r1 a;

    public s1(r1 r10) {
        this.a = r10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof s1 ? j.a(this.a, ((s1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "VerifyAuthCode(session=" + this.a + ")";
    }
}

