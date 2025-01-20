package Y8;

import Nb.j;

public final class h4 {
    public final String a;
    public final i4 b;

    public h4(String s, i4 i40) {
        this.a = s;
        this.b = i40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof h4)) {
            return false;
        }
        return j.a(this.a, ((h4)object0).a) ? j.a(this.b, ((h4)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Session(id=" + this.a + ", user=" + this.b + ")";
    }
}

