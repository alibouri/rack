package Y8;

import Nb.j;

public final class f5 {
    public final i5 a;

    public f5(i5 i50) {
        this.a = i50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f5 ? j.a(this.a, ((f5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "GetPaymentCardRestrictedData(response=" + this.a + ")";
    }
}

