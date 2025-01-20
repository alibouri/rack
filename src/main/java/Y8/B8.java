package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class b8 implements Data {
    public final Z7 a;

    public b8(Z7 z70) {
        this.a = z70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof b8 ? j.a(this.a, ((b8)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(claimScratchCard=" + this.a + ")";
    }
}

