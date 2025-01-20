package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class k2 implements Data {
    public final j2 a;

    public k2(j2 j20) {
        this.a = j20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k2 ? j.a(this.a, ((k2)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(appProps=" + this.a + ")";
    }
}

