package Y8;

import Nb.j;

public final class y5 {
    public final z5 a;

    public y5(z5 z50) {
        this.a = z50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y5 ? j.a(this.a, ((y5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "RenewPaymentCard(response=" + this.a + ")";
    }
}

