package k2;

import Vb.k;

public final class k1 extends H {
    public final int b;
    public final int c;
    public final int d;

    public k1(int v, int v1, int v2) {
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof k1 && this.b == ((k1)object0).b && this.c == ((k1)object0).c && this.d == ((k1)object0).d;
    }

    @Override
    public final int hashCode() {
        return this.b + this.c + this.d;
    }

    @Override
    public final String toString() {
        return k.G(("PagingDataEvent.DropPrepend dropped " + this.b + " items (\n                    |   dropCount: " + this.b + "\n                    |   newPlaceholdersBefore: " + this.c + "\n                    |   oldPlaceholdersBefore: " + this.d + "\n                    |)\n                    |"));
    }
}

