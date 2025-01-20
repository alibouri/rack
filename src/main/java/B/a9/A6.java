package a9;

import Nb.j;
import m5.b;

public final class a6 {
    public final String a;

    public a6(String s) {
        this.a = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof a6 ? j.a(this.a, ((a6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("CategoryStartHeader(displayName="), this.a, ")");
    }
}

