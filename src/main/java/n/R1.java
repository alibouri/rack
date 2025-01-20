package N;

import H.e;
import H.f;
import Nb.j;

public final class r1 {
    public final e a;
    public final e b;
    public final e c;

    public r1() {
        e e0 = f.b(4.0f);
        e e1 = f.b(4.0f);
        e e2 = f.b(0.0f);
        super();
        this.a = e0;
        this.b = e1;
        this.c = e2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r1)) {
            return false;
        }
        if(!j.a(this.a, ((r1)object0).a)) {
            return false;
        }
        return j.a(this.b, ((r1)object0).b) ? j.a(this.c, ((r1)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Shapes(small=" + this.a + ", medium=" + this.b + ", large=" + this.c + ')';
    }
}

