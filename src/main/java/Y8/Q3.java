package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class q3 implements Data {
    public final r3 a;

    public q3(r3 r30) {
        this.a = r30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q3 ? j.a(this.a, ((q3)object0).a) : false;
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

