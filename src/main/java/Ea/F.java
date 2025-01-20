package ea;

import Nb.j;
import java.util.List;

public final class f {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final l f;

    public f(List list0, boolean z, boolean z1, boolean z2, boolean z3, l l0) {
        j.f(list0, "devices");
        super();
        this.a = list0;
        this.b = z;
        this.c = z1;
        this.d = z2;
        this.e = z3;
        this.f = l0;
    }

    public static f a(f f0, List list0, boolean z, boolean z1, boolean z2, boolean z3, l l0, int v) {
        if((v & 1) != 0) {
            list0 = f0.a;
        }
        if((v & 2) != 0) {
            z = f0.b;
        }
        if((v & 4) != 0) {
            z1 = f0.c;
        }
        if((v & 8) != 0) {
            z2 = f0.d;
        }
        if((v & 16) != 0) {
            z3 = f0.e;
        }
        if((v & 0x20) != 0) {
            l0 = f0.f;
        }
        f0.getClass();
        j.f(list0, "devices");
        return new f(list0, z, z1, z2, z3, l0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f)) {
            return false;
        }
        if(!j.a(this.a, ((f)object0).a)) {
            return false;
        }
        if(this.b != ((f)object0).b) {
            return false;
        }
        if(this.c != ((f)object0).c) {
            return false;
        }
        if(this.d != ((f)object0).d) {
            return false;
        }
        return this.e == ((f)object0).e ? this.f == ((f)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0x4D5;
        int v2 = this.b ? 0x4CF : 0x4D5;
        int v3 = this.c ? 0x4CF : 0x4D5;
        int v4 = this.d ? 0x4CF : 0x4D5;
        if(this.e) {
            v1 = 0x4CF;
        }
        return this.f == null ? ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1) * 0x1F : ((((v * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v1) * 0x1F + this.f.hashCode();
    }

    @Override
    public final String toString() {
        return "DeviceManagementUIState(devices=" + this.a + ", deviceManagementRestrictionEnabled=" + this.b + ", isOffline=" + this.c + ", isRefreshing=" + this.d + ", isLoading=" + this.e + ", snackMessage=" + this.f + ")";
    }
}

