package R9;

import Bb.q;
import Nb.j;
import U.p;
import java.util.List;

public final class f3 implements i3 {
    public final int a;
    public final int b;
    public final List c;

    public f3(int v) {
        this.a = 0x7F100000;  // plurals:card_expires_in_x_days
        this.b = v;
        this.c = q.K(v);
    }

    @Override  // R9.i3
    public final String a(int v, p p0) {
        return w2.b(this, p0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f3)) {
            return false;
        }
        if(this.a != ((f3)object0).a) {
            return false;
        }
        return this.b == ((f3)object0).b ? j.a(this.c, ((f3)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.a * 0x1F + this.b) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Plural(id=" + this.a + ", count=" + this.b + ", args=" + this.c + ")";
    }
}

