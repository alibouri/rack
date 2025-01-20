package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class j6 implements Data {
    public final k6 a;

    public j6(k6 k60) {
        this.a = k60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j6 ? j.a(this.a, ((j6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(recordAnnouncementEvents=" + this.a + ")";
    }
}

