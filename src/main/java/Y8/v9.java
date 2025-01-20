package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class v9 implements Data {
    public final w9 a;

    public v9(w9 w90) {
        this.a = w90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof v9 ? j.a(this.a, ((v9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(verifyCorrectBackfill=" + this.a + ")";
    }
}

