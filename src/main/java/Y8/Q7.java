package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class q7 implements Data {
    public final s7 a;

    public q7(s7 s70) {
        this.a = s70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q7 ? j.a(this.a, ((q7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(saveDocumentInfo=" + this.a + ")";
    }
}

