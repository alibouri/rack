package a9;

import A3.e;
import Nb.j;
import java.util.Date;

public final class k6 {
    public final String a;
    public final String b;
    public final Date c;

    public k6(String s, String s1, Date date0) {
        this.a = s;
        this.b = s1;
        this.c = date0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof k6)) {
            return false;
        }
        if(!j.a(this.a, ((k6)object0).a)) {
            return false;
        }
        return j.a(this.b, ((k6)object0).b) ? j.a(this.c, ((k6)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
    }

    @Override
    public final String toString() {
        return "PendingDeviceApproval(id=" + this.a + ", deviceModel=" + this.b + ", whenExpires=" + this.c + ")";
    }
}

