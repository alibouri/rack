package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;

public final class q8 implements Data {
    public final r8 a;

    public q8(r8 r80) {
        this.a = r80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q8 ? j.a(this.a, ((q8)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(securityQuestionForm=" + this.a + ")";
    }
}

