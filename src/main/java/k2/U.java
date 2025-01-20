package k2;

import Nb.j;
import java.util.List;

public final class u {
    public final List a;
    public final Object b;
    public final Object c;
    public final int d;
    public final int e;

    public u(List list0, Object object0, Object object1, int v, int v1) {
        this.a = list0;
        this.b = object0;
        this.c = object1;
        this.d = v;
        this.e = v1;
        if(v < 0 && v != 0x80000000) {
            throw new IllegalArgumentException("Position must be non-negative");
        }
        if(list0.isEmpty() && (v > 0 || v1 > 0)) {
            throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
        }
        if(v1 < 0 && v1 != 0x80000000) {
            throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
        }
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof u && j.a(this.a, ((u)object0).a) && j.a(this.b, ((u)object0).b) && j.a(this.c, ((u)object0).c) && this.d == ((u)object0).d && this.e == ((u)object0).e;
    }
}

