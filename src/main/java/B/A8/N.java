package a8;

import M.J;
import Nb.j;

public final class n {
    public final String a;

    public n(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n ? j.a(this.a, ((n)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return J.g(new StringBuilder("FirebaseSessionsData(sessionId="), this.a, ')');
    }
}

