package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class m4 implements Data {
    public final r4 a;

    public m4(r4 r40) {
        this.a = r40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof m4 ? j.a(this.a, ((m4)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(payBill2=" + this.a + ")";
    }
}

