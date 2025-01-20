package U;

import M.J;
import Nb.j;

public final class a0 {
    public final String a;

    public a0(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a0 ? j.a(this.a, ((a0)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return J.g(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}

