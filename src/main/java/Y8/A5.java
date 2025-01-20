package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class a5 implements Data {
    public final Z4 a;

    public a5(Z4 z40) {
        this.a = z40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a5 ? j.a(this.a, ((a5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(createPaymentCard=" + this.a + ")";
    }
}

