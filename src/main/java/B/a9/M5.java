package a9;

import Nb.j;
import com.sendwave.backend.fragment.BillFieldsFragment;

public final class m5 {
    public final String a;
    public final BillFieldsFragment b;

    public m5(String s, BillFieldsFragment billFieldsFragment0) {
        this.a = s;
        this.b = billFieldsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof m5)) {
            return false;
        }
        return j.a(this.a, ((m5)object0).a) ? j.a(this.b, ((m5)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Field(__typename=" + this.a + ", billFieldsFragment=" + this.b + ")";
    }
}

