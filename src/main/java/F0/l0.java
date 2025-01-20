package F0;

import D0.L;
import Nb.j;

public final class l0 implements j0 {
    public final L X;
    public final O Y;

    public l0(L l0, O o0) {
        this.X = l0;
        this.Y = o0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l0)) {
            return false;
        }
        return j.a(this.X, ((l0)object0).X) ? j.a(this.Y, ((l0)object0).Y) : false;
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode() + this.X.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "PlaceableResult(result=" + this.X + ", placeable=" + this.Y + ')';
    }

    @Override  // F0.j0
    public final boolean y() {
        return this.Y.m0().r();
    }
}

