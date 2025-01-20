package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class v6 implements Data {
    public final u6 a;

    public v6(u6 u60) {
        this.a = u60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof v6 ? j.a(this.a, ((v6)object0).a) : false;
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

