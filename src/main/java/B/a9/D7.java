package a9;

import Nb.j;

public final class d7 {
    public final int a;
    public final X6 b;

    public d7(int v, X6 x60) {
        this.a = v;
        this.b = x60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d7)) {
            return false;
        }
        return this.a == ((d7)object0).a ? j.a(this.b, ((d7)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a * 0x1F;
    }

    @Override
    public final String toString() {
        return "UpcomingMilestone(step=" + this.a + ", reward=" + this.b + ")";
    }
}

