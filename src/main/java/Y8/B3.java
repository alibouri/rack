package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class b3 implements Data {
    public final d3 a;

    public b3(d3 d30) {
        this.a = d30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b3 ? j.a(this.a, ((b3)object0).a) : false;
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

