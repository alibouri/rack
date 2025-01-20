package Z2;

import Nb.j;
import i3.p;
import s0.b;

public final class h extends i {
    public final b a;
    public final p b;

    public h(b b0, p p0) {
        this.a = b0;
        this.b = p0;
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
        if(!(object0 instanceof h)) {
            return false;
        }
        return j.a(this.a, ((h)object0).a) ? j.a(this.b, ((h)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ')';
    }
}

