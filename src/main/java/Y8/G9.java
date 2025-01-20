package Y8;

import Nb.j;

public final class g9 {
    public final String a;
    public final f9 b;

    public g9(String s, f9 f90) {
        this.a = s;
        this.b = f90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g9)) {
            return false;
        }
        return j.a(this.a, ((g9)object0).a) ? j.a(this.b, ((g9)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Transfer(id=" + this.a + ", sourceWallet=" + this.b + ")";
    }
}

