package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class q implements Data {
    public final p a;

    public q(p p0) {
        this.a = p0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q ? j.a(this.a, ((q)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(agreeToTerms=" + this.a + ")";
    }
}

