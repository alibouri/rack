package Y8;

import Nb.j;
import com.sendwave.backend.fragment.KycLimitFragment;

public final class n3 {
    public final String a;
    public final KycLimitFragment b;

    public n3(String s, KycLimitFragment kycLimitFragment0) {
        this.a = s;
        this.b = kycLimitFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n3)) {
            return false;
        }
        return j.a(this.a, ((n3)object0).a) ? j.a(this.b, ((n3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Limit(__typename=" + this.a + ", kycLimitFragment=" + this.b + ")";
    }
}

