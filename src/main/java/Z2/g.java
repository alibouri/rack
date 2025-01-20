package Z2;

import Nb.j;
import s0.b;

public final class g extends i {
    public final b a;

    public g(b b0) {
        this.a = b0;
    }

    @Override  // Z2.i
    public final b a() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof g ? j.a(this.a, ((g)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Loading(painter=" + this.a + ')';
    }
}

