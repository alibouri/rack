package Ab;

import Nb.j;
import java.io.Serializable;

public final class p implements Serializable {
    public final Object X;
    public final Object Y;
    public final Object Z;

    public p(Object object0, Object object1, Object object2) {
        this.X = object0;
        this.Y = object1;
        this.Z = object2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p)) {
            return false;
        }
        if(!j.a(this.X, ((p)object0).X)) {
            return false;
        }
        return j.a(this.Y, ((p)object0).Y) ? j.a(this.Z, ((p)object0).Z) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.X == null ? 0 : this.X.hashCode();
        int v2 = this.Y == null ? 0 : this.Y.hashCode();
        Object object0 = this.Z;
        if(object0 != null) {
            v = object0.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "(" + this.X + ", " + this.Y + ", " + this.Z + ')';
    }
}

