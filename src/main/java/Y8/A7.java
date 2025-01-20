package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class a7 implements Data {
    public final b7 a;

    public a7(b7 b70) {
        this.a = b70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a7 ? j.a(this.a, ((a7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(resendMagicLinkSecurityChallengeSMS=" + this.a + ")";
    }
}

