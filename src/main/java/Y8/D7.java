package Y8;

import Nb.j;
import com.apollographql.apollo.api.Mutation.Data;

public final class d7 implements Data {
    public final e7 a;

    public d7(e7 e70) {
        this.a = e70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof d7 ? j.a(this.a, ((d7)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Data(resendMagicLinkSecurityChallengeSMSOnLogin=" + this.a + ")";
    }
}

