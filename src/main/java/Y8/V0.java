package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class v0 implements Data {
    public final u0 a;

    public v0(u0 u00) {
        this.a = u00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof v0 ? j.a(this.a, ((v0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(completeApiCheckout=" + this.a + ")";
    }
}

