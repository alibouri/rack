package a9;

import Nb.j;

public final class y5 {
    public final A5 a;

    public y5(A5 a50) {
        this.a = a50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof y5 ? j.a(this.a, ((y5)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Edge(node=" + this.a + ")";
    }
}

