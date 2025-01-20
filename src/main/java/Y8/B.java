package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class b implements Data {
    public final a a;

    public b(a a0) {
        this.a = a0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b ? j.a(this.a, ((b)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(acceptLinkedAccountTerms=" + this.a + ")";
    }
}

