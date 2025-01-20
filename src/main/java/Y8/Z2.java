package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class z2 implements Data {
    public final A2 a;

    public z2(A2 a20) {
        this.a = a20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof z2 ? j.a(this.a, ((z2)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(getBillTypeBalanceInfo=" + this.a + ")";
    }
}

