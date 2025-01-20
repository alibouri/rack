package a9;

import Nb.j;

public final class n5 {
    public final j5 a;

    public n5(j5 j50) {
        this.a = j50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n5 ? j.a(this.a, ((n5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "OnDealWithDetail(detail=" + this.a + ")";
    }
}

