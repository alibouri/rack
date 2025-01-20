package Y8;

import Nb.j;

public final class q4 {
    public final t4 a;
    public final A4 b;
    public final x4 c;
    public final String d;

    public q4(t4 t40, A4 a40, x4 x40, String s) {
        this.a = t40;
        this.b = a40;
        this.c = x40;
        this.d = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q4)) {
            return false;
        }
        if(!j.a(this.a, ((q4)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((q4)object0).b)) {
            return false;
        }
        return j.a(this.c, ((q4)object0).c) ? j.a(this.d, ((q4)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v = s.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    @Override
    public final String toString() {
        return "OnPayBill(payment=" + this.a + ", userFacingError=" + this.b + ", sourceWallet=" + this.c + ", historyEntryIdToDisplayNow=" + this.d + ")";
    }
}

