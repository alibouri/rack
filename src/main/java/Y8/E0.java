package Y8;

import Nb.j;
import m5.b;

public final class e0 {
    public final String a;

    public e0(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof e0 ? j.a(this.a, ((e0)object0).a) : false;
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

