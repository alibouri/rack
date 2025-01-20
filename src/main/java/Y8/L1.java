package Y8;

import Nb.j;

public final class l1 {
    public final n1 a;
    public final boolean b;

    public l1(n1 n10, boolean z) {
        this.a = n10;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l1)) {
            return false;
        }
        return j.a(this.a, ((l1)object0).a) ? this.b == ((l1)object0).b : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a == null ? 0 : this.a.hashCode();
        return this.b ? v * 0x1F + 0x4CF : v * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "Send(transfer=" + this.a + ", showUserCanReverseTxAnnouncement=" + this.b + ")";
    }
}

