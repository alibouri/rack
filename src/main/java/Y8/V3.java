package Y8;

import Nb.j;

public final class v3 {
    public final String a;
    public final w3 b;

    public v3(String s, w3 w30) {
        this.a = s;
        this.b = w30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof v3)) {
            return false;
        }
        return j.a(this.a, ((v3)object0).a) ? j.a(this.b, ((v3)object0).b) : false;
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

