package a9;

import Nb.j;

public final class q4 {
    public final String a;
    public final s4 b;

    public q4(String s, s4 s40) {
        this.a = s;
        this.b = s40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q4)) {
            return false;
        }
        return j.a(this.a, ((q4)object0).a) ? j.a(this.b, ((q4)object0).b) : false;
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

