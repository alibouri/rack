package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class b2 implements Data {
    public final c2 a;

    public b2(c2 c20) {
        this.a = c20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b2 ? j.a(this.a, ((b2)object0).a) : false;
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

