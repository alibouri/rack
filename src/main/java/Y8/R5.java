package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class r5 implements Data {
    public final t5 a;

    public r5(t5 t50) {
        this.a = t50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof r5 ? j.a(this.a, ((r5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(pausePaymentCard=" + this.a + ")";
    }
}

