package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class g8 implements Data {
    public final h8 a;

    public g8(h8 h80) {
        this.a = h80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g8 ? j.a(this.a, ((g8)object0).a) : false;
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

