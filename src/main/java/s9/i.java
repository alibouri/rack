package S9;

import N9.d;
import Nb.j;

public final class i {
    public final String a;
    public final d b;

    public i(String s, d d0) {
        this.a = s;
        this.b = d0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        return j.a(this.a, ((i)object0).a) ? j.a(this.b, ((i)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "AccountSwitcherPillUiState(text=" + this.a + ", tooltip=" + this.b + ")";
    }
}

