package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class b9 implements Data {
    public final c9 a;

    public b9(c9 c90) {
        this.a = c90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b9 ? j.a(this.a, ((b9)object0).a) : false;
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

