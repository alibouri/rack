package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class f2 implements Data {
    public final g2 a;

    public f2(g2 g20) {
        this.a = g20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f2 ? j.a(this.a, ((f2)object0).a) : false;
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

