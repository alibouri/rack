package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class e9 implements Data {
    public final h9 a;

    public e9(h9 h90) {
        this.a = h90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e9 ? j.a(this.a, ((e9)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(undoSentTransfer=" + this.a + ")";
    }
}

