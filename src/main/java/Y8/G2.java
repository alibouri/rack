package Y8;

import Nb.j;

public final class g2 {
    public final String a;
    public final h2 b;

    public g2(String s, h2 h20) {
        this.a = s;
        this.b = h20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g2)) {
            return false;
        }
        return j.a(this.a, ((g2)object0).a) ? j.a(this.b, ((g2)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Me(id=" + this.a + ", primaryWallet=" + this.b + ")";
    }
}

