package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class k1 implements Data {
    public final l1 a;

    public k1(l1 l10) {
        this.a = l10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k1 ? j.a(this.a, ((k1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(send=" + this.a + ")";
    }
}

