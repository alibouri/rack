package k2;

import Bb.p;
import Vb.k;
import java.util.ArrayList;

public final class l1 extends H {
    public final ArrayList b;
    public final int c;
    public final int d;

    public l1(ArrayList arrayList0, int v, int v1) {
        this.b = arrayList0;
        this.c = v;
        this.d = v1;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof l1 && this.b.equals(((l1)object0).b) && this.c == ((l1)object0).c && this.d == ((l1)object0).d;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.c + this.d;
    }

    @Override
    public final String toString() {
        return k.G(("PagingDataEvent.Prepend loaded " + this.b.size() + " items (\n                    |   first item: " + p.q0(this.b) + "\n                    |   last item: " + p.x0(this.b) + "\n                    |   newPlaceholdersBefore: " + this.c + "\n                    |   oldPlaceholdersBefore: " + this.d + "\n                    |)\n                    |"));
    }
}

