package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class x1 implements Data {
    public final y1 a;

    public x1(y1 y10) {
        this.a = y10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof x1 ? j.a(this.a, ((x1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(decodeWaveQr=" + this.a + ")";
    }
}

