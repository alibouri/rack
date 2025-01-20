package Y8;

import Nb.j;

public final class e {
    public final g a;

    public e(g g0) {
        this.a = g0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e ? j.a(this.a, ((e)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AcknowledgePricePromoBottomSheet(user=" + this.a + ")";
    }
}

