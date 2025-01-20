package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class s2 implements Data {
    public final t2 a;

    public s2(t2 t20) {
        this.a = t20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof s2 ? j.a(this.a, ((s2)object0).a) : false;
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

