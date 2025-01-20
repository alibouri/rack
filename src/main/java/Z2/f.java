package Z2;

import Nb.j;
import i3.e;
import s0.b;

public final class f extends i {
    public final b a;
    public final e b;

    public f(b b0, e e0) {
        this.a = b0;
        this.b = e0;
    }

    @Override  // Z2.i
    public final b a() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        return j.a(this.a, ((f)object0).a) ? j.a(this.b, ((f)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? this.b.hashCode() : this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Error(painter=" + this.a + ", result=" + this.b + ')';
    }
}

