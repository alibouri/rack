package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class g7 implements Data {
    public final h7 a;

    public g7(h7 h70) {
        this.a = h70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g7 ? j.a(this.a, ((g7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(resendSMS=" + this.a + ")";
    }
}

