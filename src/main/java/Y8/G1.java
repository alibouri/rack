package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class g1 implements Data {
    public final h1 a;

    public g1(h1 h10) {
        this.a = h10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g1 ? j.a(this.a, ((g1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(session=" + this.a + ")";
    }
}

