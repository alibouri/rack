package Y8;

import Nb.j;

public final class z8 {
    public final String a;
    public final y8 b;

    public z8(String s, y8 y80) {
        this.a = s;
        this.b = y80;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z8)) {
            return false;
        }
        return j.a(this.a, ((z8)object0).a) ? j.a(this.b, ((z8)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Transfer(id=" + this.a + ", state=" + this.b + ")";
    }
}

