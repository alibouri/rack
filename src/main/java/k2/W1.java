package k2;

import Bb.p;
import Bb.z;
import Nb.j;
import Ob.a;
import Vb.k;
import java.util.Iterator;
import java.util.List;

public final class w1 extends x1 implements a, Iterable {
    public final List X;
    public final Object Y;
    public final Object Z;
    public final int b0;
    public final int c0;
    public static final w1 d0;

    static {
        w1.d0 = new w1(z.X, null, null, 0, 0);
    }

    public w1(List list0, Object object0, Object object1, int v, int v1) {
        j.f(list0, "data");
        super();
        this.X = list0;
        this.Y = object0;
        this.Z = object1;
        this.b0 = v;
        this.c0 = v1;
        if(v != 0x80000000 && v < 0) {
            throw new IllegalArgumentException("itemsBefore cannot be negative");
        }
        if(v1 != 0x80000000 && v1 < 0) {
            throw new IllegalArgumentException("itemsAfter cannot be negative");
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof w1)) {
            return false;
        }
        if(!j.a(this.X, ((w1)object0).X)) {
            return false;
        }
        if(!j.a(this.Y, ((w1)object0).Y)) {
            return false;
        }
        if(!j.a(this.Z, ((w1)object0).Z)) {
            return false;
        }
        return this.b0 == ((w1)object0).b0 ? this.c0 == ((w1)object0).c0 : false;
    }

    @Override
    public final int hashCode() {
        int v = this.X.hashCode();
        int v1 = 0;
        int v2 = this.Y == null ? 0 : this.Y.hashCode();
        Object object0 = this.Z;
        if(object0 != null) {
            v1 = object0.hashCode();
        }
        return (((v * 0x1F + v2) * 0x1F + v1) * 0x1F + this.b0) * 0x1F + this.c0;
    }

    @Override
    public final Iterator iterator() {
        return this.X.listIterator();
    }

    @Override
    public final String toString() {
        return k.G(("LoadResult.Page(\n                    |   data size: " + this.X.size() + "\n                    |   first Item: " + p.q0(this.X) + "\n                    |   last Item: " + p.x0(this.X) + "\n                    |   nextKey: " + this.Z + "\n                    |   prevKey: " + this.Y + "\n                    |   itemsBefore: " + this.b0 + "\n                    |   itemsAfter: " + this.c0 + "\n                    |) "));
    }
}

