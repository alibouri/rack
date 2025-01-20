package k2;

import Vb.k;

public final class j1 extends H {
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public j1(int v, int v1, int v2, int v3) {
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof j1 && this.b == ((j1)object0).b && this.c == ((j1)object0).c && this.d == ((j1)object0).d && this.e == ((j1)object0).e;
    }

    @Override
    public final int hashCode() {
        return this.b + this.c + this.d + this.e;
    }

    @Override
    public final String toString() {
        return k.G(("PagingDataEvent.DropAppend dropped " + this.c + " items (\n                    |   startIndex: " + this.b + "\n                    |   dropCount: " + this.c + "\n                    |   newPlaceholdersBefore: " + this.d + "\n                    |   oldPlaceholdersBefore: " + this.e + "\n                    |)\n                    |"));
    }
}

