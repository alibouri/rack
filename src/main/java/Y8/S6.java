package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class s6 implements Data {
    public final r6 a;

    public s6(r6 r60) {
        this.a = r60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof s6 ? j.a(this.a, ((s6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(appProps=" + this.a + ")";
    }
}

