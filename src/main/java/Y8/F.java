package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class f implements Data {
    public final e a;

    public f(e e0) {
        this.a = e0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f ? j.a(this.a, ((f)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(acknowledgePricePromoBottomSheet=" + this.a + ")";
    }
}

