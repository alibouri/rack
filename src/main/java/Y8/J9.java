package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class j9 implements Data {
    public final l9 a;

    public j9(l9 l90) {
        this.a = l90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j9 ? j.a(this.a, ((j9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(updateBillFavoriteName=" + this.a + ")";
    }
}

