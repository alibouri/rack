package Y8;

import Nb.j;
import java.util.List;

public final class m3 {
    public final List a;
    public final l3 b;

    public m3(List list0, l3 l30) {
        this.a = list0;
        this.b = l30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m3)) {
            return false;
        }
        return j.a(this.a, ((m3)object0).a) ? j.a(this.b, ((m3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "KycInfo(limits=" + this.a + ", idStatus=" + this.b + ")";
    }
}

