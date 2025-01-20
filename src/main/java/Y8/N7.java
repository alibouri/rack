package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class n7 implements Data {
    public final o7 a;

    public n7(o7 o70) {
        this.a = o70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n7 ? j.a(this.a, ((n7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(respondOstrichEasterEggs=" + this.a + ")";
    }
}

