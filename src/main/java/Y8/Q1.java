package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class q1 implements Data {
    public final s1 a;

    public q1(s1 s10) {
        this.a = s10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q1 ? j.a(this.a, ((q1)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(verifyAuthCode=" + this.a + ")";
    }
}

