package R;

import H.e;
import Nb.j;

public final class u0 {
    public final e a;
    public final e b;
    public final e c;
    public final e d;
    public final e e;

    public u0() {
        this.a = t0.a;
        this.b = t0.b;
        this.c = t0.c;
        this.d = t0.d;
        this.e = t0.e;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u0)) {
            return false;
        }
        if(!j.a(this.a, ((u0)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((u0)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((u0)object0).c)) {
            return false;
        }
        return j.a(this.d, ((u0)object0).d) ? j.a(this.e, ((u0)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}

