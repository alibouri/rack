package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class k3 implements Data {
    public final o3 a;

    public k3(o3 o30) {
        this.a = o30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k3 ? j.a(this.a, ((k3)object0).a) : false;
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

