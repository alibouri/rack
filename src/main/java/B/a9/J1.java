package a9;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.b;

public final class j1 {
    public final String a;
    public final String b;
    public final boolean c;

    public j1(String s, String s1, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof j1)) {
            return false;
        }
        if(!j.a(this.a, ((j1)object0).a)) {
            return false;
        }
        return j.a(this.b, ((j1)object0).b) ? this.c == ((j1)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        return this.c ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OnTransferReceivedReversalEntry(senderName=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", senderMobile=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", isFreezingFunds=");
        return b.r(stringBuilder0, this.c, ")");
    }
}

