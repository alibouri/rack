package Y8;

import Nb.j;

public final class a4 {
    public final Y3 a;

    public a4(Y3 y30) {
        this.a = y30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a4 ? j.a(this.a, ((a4)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "OtpValidateLinkedAccount(account=" + this.a + ")";
    }
}

