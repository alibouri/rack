package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class o0 implements Data {
    public final q0 a;

    public o0(q0 q00) {
        this.a = q00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof o0 ? j.a(this.a, ((o0)object0).a) : false;
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

