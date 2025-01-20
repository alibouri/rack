package a9;

import Nb.j;
import m5.b;

public final class k5 {
    public final String a;

    public k5(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof k5 ? j.a(this.a, ((k5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("DisableInfo(message="), this.a, ")");
    }
}

