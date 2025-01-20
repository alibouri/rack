package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class w5 implements Data {
    public final y5 a;

    public w5(y5 y50) {
        this.a = y50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof w5 ? j.a(this.a, ((w5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(renewPaymentCard=" + this.a + ")";
    }
}

