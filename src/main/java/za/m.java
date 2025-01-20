package za;

import Nb.j;
import m5.b;

public final class m extends q {
    public final String a;

    public m(String s) {
        j.f(s, "mobile");
        super();
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof m ? j.a(this.a, ((m)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("LoadingSecurityChallenge(mobile="), this.a, ")");
    }
}

