package Y8;

import Nb.j;

public final class l5 {
    public final String a;
    public final o5 b;

    public l5(String s, o5 o50) {
        this.a = s;
        this.b = o50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l5)) {
            return false;
        }
        return j.a(this.a, ((l5)object0).a) ? j.a(this.b, ((l5)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Edge(cursor=" + this.a + ", node=" + this.b + ")";
    }
}

