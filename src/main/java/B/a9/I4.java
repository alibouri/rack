package a9;

import Nb.j;
import com.sendwave.backend.fragment.LinkedAccountTypeFragment;

public final class i4 {
    public final String a;
    public final LinkedAccountTypeFragment b;

    public i4(String s, LinkedAccountTypeFragment linkedAccountTypeFragment0) {
        this.a = s;
        this.b = linkedAccountTypeFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i4)) {
            return false;
        }
        return j.a(this.a, ((i4)object0).a) ? j.a(this.b, ((i4)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "LinkedAccountType(__typename=" + this.a + ", linkedAccountTypeFragment=" + this.b + ")";
    }
}

