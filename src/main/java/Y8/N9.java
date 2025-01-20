package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class n9 implements Data {
    public final o9 a;

    public n9(o9 o90) {
        this.a = o90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n9 ? j.a(this.a, ((n9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(updateDeviceSessions=" + this.a + ")";
    }
}

