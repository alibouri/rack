package Y8;

import Nb.j;

public final class p4 {
    public final s4 a;
    public final z4 b;
    public final w4 c;

    public p4(s4 s40, z4 z40, w4 w40) {
        this.a = s40;
        this.b = z40;
        this.c = w40;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof p4)) {
            return false;
        }
        if(!j.a(this.a, ((p4)object0).a)) {
            return false;
        }
        return j.a(this.b, ((p4)object0).b) ? j.a(this.c, ((p4)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        w4 w40 = this.c;
        if(w40 != null) {
            v = w40.hashCode();
        }
        return (v1 * 0x1F + v2) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "OnPayBill1(payment=" + this.a + ", userFacingError=" + this.b + ", sourceWallet=" + this.c + ")";
    }
}

