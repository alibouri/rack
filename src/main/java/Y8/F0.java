package Y8;

import Nb.j;
import java.util.List;

public final class f0 {
    public final List a;
    public final List b;

    public f0(List list0, List list1) {
        this.a = list0;
        this.b = list1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f0)) {
            return false;
        }
        return j.a(this.a, ((f0)object0).a) ? j.a(this.b, ((f0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "OnBillConfirmationActual(displayFields=" + this.a + ", confirmedFields=" + this.b + ")";
    }
}

