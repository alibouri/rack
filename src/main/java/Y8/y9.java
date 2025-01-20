package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class y9 implements Data {
    public final z9 a;

    public y9(z9 z90) {
        this.a = z90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y9 ? j.a(this.a, ((y9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(verifyDeviceApproval=" + this.a + ")";
    }
}

