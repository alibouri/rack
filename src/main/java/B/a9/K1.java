package a9;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.b;

public final class k1 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public k1(String s, String s1, String s2, boolean z, boolean z1) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = z;
        this.e = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k1)) {
            return false;
        }
        if(!j.a(this.a, ((k1)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((k1)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((k1)object0).c)) {
            return false;
        }
        return this.d == ((k1)object0).d ? this.e == ((k1)object0).e : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(e.s(this.a.hashCode() * 0x1F, 0x1F, this.b), 0x1F, this.c);
        int v1 = 0x4D5;
        int v2 = this.d ? 0x4CF : 0x4D5;
        if(this.e) {
            v1 = 0x4CF;
        }
        return (v + v2) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("OnTransferSentEntry(transferId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", recipientName=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", recipientMobile=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", isUserReversible=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", isRefunded=");
        return b.r(stringBuilder0, this.e, ")");
    }
}

