package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class q9 implements Data {
    public final r9 a;

    public q9(r9 r90) {
        this.a = r90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q9 ? j.a(this.a, ((q9)object0).a) : false;
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

