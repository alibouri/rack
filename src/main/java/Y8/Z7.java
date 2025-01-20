package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class z7 implements Data {
    public final A7 a;

    public z7(A7 a70) {
        this.a = a70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof z7 ? j.a(this.a, ((z7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(savePushNotificationToken=" + this.a + ")";
    }
}

