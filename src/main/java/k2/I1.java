package k2;

import Bb.p;
import Vb.k;
import java.util.ArrayList;

public final class i1 extends H {
    public final int b;
    public final ArrayList c;
    public final int d;
    public final int e;

    public i1(int v, ArrayList arrayList0, int v1, int v2) {
        this.b = v;
        this.c = arrayList0;
        this.d = v1;
        this.e = v2;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof i1 && this.b == ((i1)object0).b && this.c.equals(((i1)object0).c) && this.d == ((i1)object0).d && this.e == ((i1)object0).e;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + this.b + this.d + this.e;
    }

    @Override
    public final String toString() {
        return k.G(("PagingDataEvent.Append loaded " + this.c.size() + " items (\n                    |   startIndex: " + this.b + "\n                    |   first item: " + p.q0(this.c) + "\n                    |   last item: " + p.x0(this.c) + "\n                    |   newPlaceholdersBefore: " + this.d + "\n                    |   oldPlaceholdersBefore: " + this.e + "\n                    |)\n                    |"));
    }
}

