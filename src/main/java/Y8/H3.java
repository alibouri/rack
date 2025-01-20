package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class h3 implements Data {
    public final i3 a;

    public h3(i3 i30) {
        this.a = i30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h3 ? j.a(this.a, ((h3)object0).a) : false;
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

