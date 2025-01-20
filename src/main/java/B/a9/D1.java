package a9;

import Nb.j;
import m5.b;

public final class d1 {
    public final String a;

    public d1(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d1 ? j.a(this.a, ((d1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("OnMerchantSaleEntry(nullableMerchantName="), this.a, ")");
    }
}

