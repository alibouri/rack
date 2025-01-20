package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class k7 implements Data {
    public final l7 a;

    public k7(l7 l70) {
        this.a = l70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k7 ? j.a(this.a, ((k7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(resetPin=" + this.a + ")";
    }
}

