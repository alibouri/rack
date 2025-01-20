package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class t8 implements Data {
    public final x8 a;

    public t8(x8 x80) {
        this.a = x80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof t8 ? j.a(this.a, ((t8)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(sendLinkedAccountTransfer=" + this.a + ")";
    }
}

