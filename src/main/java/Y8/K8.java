package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class k8 implements Data {
    public final n8 a;

    public k8(n8 n80) {
        this.a = n80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k8 ? j.a(this.a, ((k8)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(securityChallenge=" + this.a + ")";
    }
}

