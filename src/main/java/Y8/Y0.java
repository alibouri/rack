package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class y0 implements Data {
    public final x0 a;

    public y0(x0 x00) {
        this.a = x00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y0 ? j.a(this.a, ((y0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(confirmMagicLinkSecurityChallenge=" + this.a + ")";
    }
}

