package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class g4 implements Data {
    public final h4 a;

    public g4(h4 h40) {
        this.a = h40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g4 ? j.a(this.a, ((g4)object0).a) : false;
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

