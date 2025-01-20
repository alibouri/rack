package a9;

import Nb.j;
import java.util.Date;

public final class f2 {
    public final String a;
    public final boolean b;
    public final Date c;

    public f2(String s, boolean z, Date date0) {
        this.a = s;
        this.b = z;
        this.c = date0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f2)) {
            return false;
        }
        if(!j.a(this.a, ((f2)object0).a)) {
            return false;
        }
        return this.b == ((f2)object0).b ? j.a(this.c, ((f2)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b ? 0x4CF : 0x4D5;
        return this.c == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "DeviceManagementDevice(deviceModel=" + this.a + ", isCurrentDevice=" + this.b + ", whenUsed=" + this.c + ")";
    }
}

