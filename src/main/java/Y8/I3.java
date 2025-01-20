package Y8;

import Nb.j;

public final class i3 {
    public final String a;
    public final g3 b;

    public i3(String s, g3 g30) {
        this.a = s;
        this.b = g30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i3)) {
            return false;
        }
        return j.a(this.a, ((i3)object0).a) ? j.a(this.b, ((i3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Me(id=" + this.a + ", appProps=" + this.b + ")";
    }
}

