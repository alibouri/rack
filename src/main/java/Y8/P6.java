package Y8;

import Nb.j;

public final class p6 {
    public final o6 a;

    public p6(o6 o60) {
        this.a = o60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof p6 ? j.a(this.a, ((p6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "RedeemPromoCode2(detail=" + this.a + ")";
    }
}

