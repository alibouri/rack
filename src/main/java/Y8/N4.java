package Y8;

import Nb.j;
import m5.b;

public final class n4 {
    public final String a;

    public n4(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n4 ? j.a(this.a, ((n4)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("OnAsyncPending1(clientId="), this.a, ")");
    }
}

