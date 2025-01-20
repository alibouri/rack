package Y8;

import Nb.j;
import m5.b;

public final class j0 {
    public final String a;

    public j0(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof j0 ? j.a(this.a, ((j0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("OnAsyncPending(clientId="), this.a, ")");
    }
}

