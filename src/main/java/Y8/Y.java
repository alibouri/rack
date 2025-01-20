package Y8;

import Nb.j;

public final class y {
    public final z a;

    public y(z z0) {
        this.a = z0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y ? j.a(this.a, ((y)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "AppProps(appUpdaterParams=" + this.a + ")";
    }
}

