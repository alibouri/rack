package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class k5 implements Data {
    public final n5 a;

    public k5(n5 n50) {
        this.a = n50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k5 ? j.a(this.a, ((k5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(me=" + this.a + ")";
    }
}

