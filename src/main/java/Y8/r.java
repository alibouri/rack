package Y8;

import Nb.j;
import com.sendwave.backend.type.PartnerOrg;

public final class r {
    public final String a;
    public final PartnerOrg b;
    public final PartnerOrg c;
    public final boolean d;

    public r(String s, PartnerOrg partnerOrg0, PartnerOrg partnerOrg1, boolean z) {
        this.a = s;
        this.b = partnerOrg0;
        this.c = partnerOrg1;
        this.d = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r)) {
            return false;
        }
        if(!j.a(this.a, ((r)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((r)object0).b)) {
            return false;
        }
        return j.a(this.c, ((r)object0).c) ? this.d == ((r)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b == null ? 0 : this.b.hashCode();
        int v2 = this.c.hashCode();
        return this.d ? (v2 + (v * 0x1F + v1) * 0x1F) * 0x1F + 0x4CF : (v2 + (v * 0x1F + v1) * 0x1F) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        return "Wallet(id=" + this.a + ", partnerOrg=" + this.b + ", aimedPartnerOrg=" + this.c + ", shouldBlockUntilPartnerOrgMigrated=" + this.d + ")";
    }
}

