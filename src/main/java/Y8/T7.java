package Y8;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.KycInfoFragment;

public final class t7 {
    public final String a;
    public final String b;
    public final r7 c;
    public final KycInfoFragment d;

    public t7(String s, String s1, r7 r70, KycInfoFragment kycInfoFragment0) {
        this.a = s;
        this.b = s1;
        this.c = r70;
        this.d = kycInfoFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t7)) {
            return false;
        }
        if(!j.a(this.a, ((t7)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((t7)object0).b)) {
            return false;
        }
        return j.a(this.c, ((t7)object0).c) ? j.a(this.d, ((t7)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        return this.c == null ? this.d.hashCode() + v * 0x1F : this.d.hashCode() + (v + this.c.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", id=" + this.b + ", primaryWallet=" + this.c + ", kycInfoFragment=" + this.d + ")";
    }
}

