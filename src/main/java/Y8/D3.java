package Y8;

import Nb.j;

public final class d3 {
    public final String a;
    public final e3 b;

    public d3(String s, e3 e30) {
        this.a = s;
        this.b = e30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d3)) {
            return false;
        }
        return j.a(this.a, ((d3)object0).a) ? j.a(this.b, ((d3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Session(id=" + this.a + ", wallet=" + this.b + ")";
    }
}

