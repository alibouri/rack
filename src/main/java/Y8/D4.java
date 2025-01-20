package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class d4 implements Data {
    public final c4 a;

    public d4(c4 c40) {
        this.a = c40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d4 ? j.a(this.a, ((d4)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(acceptUserOverdraftTerms=" + this.a + ")";
    }
}

