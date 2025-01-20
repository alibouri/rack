package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class u3 implements Data {
    public final v3 a;

    public u3(v3 v30) {
        this.a = v30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof u3 ? j.a(this.a, ((u3)object0).a) : false;
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

