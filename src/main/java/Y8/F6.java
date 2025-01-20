package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class f6 implements Data {
    public final g6 a;

    public f6(g6 g60) {
        this.a = g60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f6 ? j.a(this.a, ((f6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(recordAnnouncementEvent=" + this.a + ")";
    }
}

