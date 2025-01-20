package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class n6 implements Data {
    public final p6 a;

    public n6(p6 p60) {
        this.a = p60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n6 ? j.a(this.a, ((n6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(redeemPromoCode2=" + this.a + ")";
    }
}

