package la;

import Nb.j;
import com.apollographql.apollo.api.b;

public final class d {
    public final k a;
    public final l b;
    public final boolean c;

    public d(k k0, l l0, boolean z) {
        j.f(k0, "kycInfo");
        j.f(l0, "loadingState");
        super();
        this.a = k0;
        this.b = l0;
        this.c = z;
    }

    public static d a(d d0, k k0, l l0, boolean z, int v) {
        if((v & 1) != 0) {
            k0 = d0.a;
        }
        if((v & 2) != 0) {
            l0 = d0.b;
        }
        if((v & 4) != 0) {
            z = d0.c;
        }
        d0.getClass();
        j.f(k0, "kycInfo");
        j.f(l0, "loadingState");
        return new d(k0, l0, z);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(!j.a(this.a, ((d)object0).a)) {
            return false;
        }
        return this.b == ((d)object0).b ? this.c == ((d)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c ? (v1 + v * 0x1F) * 0x1F + 0x4CF : (v1 + v * 0x1F) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("AccountLimitsUiState(kycInfo=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", loadingState=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", isOffline=");
        return b.r(stringBuilder0, this.c, ")");
    }
}

