package Y8;

import Nb.j;

public final class a8 {
    public final String a;
    public final Y7 b;

    public a8(String s, Y7 y70) {
        this.a = s;
        this.b = y70;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a8)) {
            return false;
        }
        return j.a(this.a, ((a8)object0).a) ? j.a(this.b, ((a8)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "ClaimedScratchCard(id=" + this.a + ", award=" + this.b + ")";
    }
}

