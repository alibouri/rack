package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class e5 implements Data {
    public final f5 a;

    public e5(f5 f50) {
        this.a = f50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e5 ? j.a(this.a, ((e5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(getPaymentCardRestrictedData=" + this.a + ")";
    }
}

