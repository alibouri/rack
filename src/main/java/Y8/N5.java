package Y8;

import Nb.j;

public final class n5 {
    public final String a;
    public final p5 b;

    public n5(String s, p5 p50) {
        this.a = s;
        this.b = p50;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n5)) {
            return false;
        }
        return j.a(this.a, ((n5)object0).a) ? j.a(this.b, ((n5)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Me(id=" + this.a + ", paymentCardWallet=" + this.b + ")";
    }
}

