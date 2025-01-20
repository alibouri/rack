package x;

import m0.b;
import yc.d;

public final class l extends m {
    public final long a;

    public l(long v) {
        this.a = v;
        if(!d.o(v)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return object0 instanceof l ? b.b(this.a, ((l)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return b.f(this.a);
    }

    @Override
    public final String toString() {
        return "Open(offset=" + b.k(this.a) + ')';
    }
}

