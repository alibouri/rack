package a9;

import Nb.j;
import n0.v;

public final class x4 {
    public final String a;
    public final B4 b;
    public final E4 c;

    public x4(String s, B4 b40, E4 e40) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = b40;
        this.c = e40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x4)) {
            return false;
        }
        if(!j.a(this.a, ((x4)object0).a)) {
            return false;
        }
        return j.a(this.b, ((x4)object0).b) ? j.a(this.c, ((x4)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : v.i(this.b.a);
        E4 e40 = this.c;
        if(e40 != null) {
            v1 = e40.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Background(__typename=" + this.a + ", onAnnouncementSolidColorBackground=" + this.b + ", onTwoColorGradient=" + this.c + ")";
    }
}

