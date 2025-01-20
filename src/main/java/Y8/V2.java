package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class v2 implements Data {
    public final w2 a;

    public v2(w2 w20) {
        this.a = w20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof v2 ? j.a(this.a, ((v2)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(generateSecurityQuestionForm=" + this.a + ")";
    }
}

