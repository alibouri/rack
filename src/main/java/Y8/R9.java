package Y8;

import Nb.j;

public final class r9 {
    public final String a;
    public final s9 b;

    public r9(String s, s9 s90) {
        this.a = s;
        this.b = s90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r9)) {
            return false;
        }
        return j.a(this.a, ((r9)object0).a) ? j.a(this.b, ((r9)object0).b) : false;
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

