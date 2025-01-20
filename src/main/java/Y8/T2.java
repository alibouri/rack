package Y8;

import Nb.j;
import com.sendwave.backend.fragment.LinkedAccountsFragment;
import com.sendwave.backend.fragment.PendingDeviceApprovalFragment;

public final class t2 {
    public final String a;
    public final LinkedAccountsFragment b;
    public final PendingDeviceApprovalFragment c;

    public t2(String s, LinkedAccountsFragment linkedAccountsFragment0, PendingDeviceApprovalFragment pendingDeviceApprovalFragment0) {
        this.a = s;
        this.b = linkedAccountsFragment0;
        this.c = pendingDeviceApprovalFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof t2)) {
            return false;
        }
        if(!j.a(this.a, ((t2)object0).a)) {
            return false;
        }
        return j.a(this.b, ((t2)object0).b) ? j.a(this.c, ((t2)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Me(__typename=" + this.a + ", linkedAccountsFragment=" + this.b + ", pendingDeviceApprovalFragment=" + this.c + ")";
    }
}

