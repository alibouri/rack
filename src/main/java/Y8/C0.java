package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class c0 implements Data {
    public final a0 a;

    public c0(a0 a00) {
        this.a = a00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof c0 ? j.a(this.a, ((c0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(billConfirmationPolling=" + this.a + ")";
    }
}

