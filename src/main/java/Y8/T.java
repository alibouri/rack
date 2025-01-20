package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class t implements Data {
    public final u a;

    public t(u u0) {
        this.a = u0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof t ? j.a(this.a, ((t)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(session=" + this.a + ")";
    }
}

