package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class d1 implements Data {
    public final e1 a;

    public d1(e1 e10) {
        this.a = e10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d1 ? j.a(this.a, ((d1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(logout=" + this.a + ")";
    }
}

