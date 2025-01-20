package Y8;

import Nb.j;

public final class i5 {
    public final String a;
    public final h5 b;
    public final g5 c;

    public i5(String s, h5 h50, g5 g50) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = h50;
        this.c = g50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i5)) {
            return false;
        }
        if(!j.a(this.a, ((i5)object0).a)) {
            return false;
        }
        return j.a(this.b, ((i5)object0).b) ? j.a(this.c, ((i5)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.a.hashCode();
        g5 g50 = this.c;
        if(g50 != null) {
            v1 = g50.hashCode();
        }
        return (v * 0x1F + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "Response(__typename=" + this.a + ", onPaymentCardRestrictedDataPending=" + this.b + ", onPaymentCardRestrictedData=" + this.c + ")";
    }
}

