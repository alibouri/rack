package a9;

import Nb.j;
import n0.v;

public final class b {
    public final String a;
    public final f b;
    public final g c;

    public b(String s, f f0, g g0) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = f0;
        this.c = g0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof b)) {
            return false;
        }
        if(!j.a(this.a, ((b)object0).a)) {
            return false;
        }
        return j.a(this.b, ((b)object0).b) ? j.a(this.c, ((b)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        g g0 = this.c;
        if(g0 != null) {
            v1 = v.i(g0.a);
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Background(__typename=" + this.a + ", onAnnouncementGradientBackground=" + this.b + ", onAnnouncementSolidColorBackground=" + this.c + ")";
    }
}

