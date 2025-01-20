package Y8;

import Nb.j;

public final class e3 {
    public final String a;
    public final c3 b;

    public e3(String s, c3 c30) {
        this.a = s;
        this.b = c30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e3)) {
            return false;
        }
        return j.a(this.a, ((e3)object0).a) ? j.a(this.b, ((e3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Wallet(id=" + this.a + ", historyEntry=" + this.b + ")";
    }
}

