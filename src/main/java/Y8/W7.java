package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class w7 implements Data {
    public final x7 a;

    public w7(x7 x70) {
        this.a = x70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof w7 ? j.a(this.a, ((w7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(savePlayInstallReferrer=" + this.a + ")";
    }
}

