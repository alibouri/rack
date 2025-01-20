package k2;

import Nb.j;
import Vb.k;

public final class u1 extends x1 {
    public final Exception X;

    public u1(Exception exception0) {
        j.f(exception0, "throwable");
        super();
        this.X = exception0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof u1 ? j.a(this.X, ((u1)object0).X) : false;
    }

    @Override
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override
    public final String toString() {
        return k.G(("LoadResult.Error(\n                    |   throwable: " + this.X + "\n                    |) "));
    }
}

