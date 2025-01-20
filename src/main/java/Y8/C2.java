package Y8;

import Nb.j;

public final class c2 {
    public final String a;
    public final d2 b;

    public c2(String s, d2 d20) {
        this.a = s;
        this.b = d20;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof c2)) {
            return false;
        }
        return j.a(this.a, ((c2)object0).a) ? j.a(this.b, ((c2)object0).b) : false;
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

