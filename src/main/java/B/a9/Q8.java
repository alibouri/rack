package a9;

import A3.e;
import Nb.j;
import com.sendwave.backend.fragment.UserAppPropsFragment;

public final class q8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final UserAppPropsFragment f;

    public q8(String s, String s1, String s2, String s3, boolean z, UserAppPropsFragment userAppPropsFragment0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = z;
        this.f = userAppPropsFragment0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q8)) {
            return false;
        }
        if(!j.a(this.a, ((q8)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((q8)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((q8)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((q8)object0).d)) {
            return false;
        }
        return this.e == ((q8)object0).e ? j.a(this.f, ((q8)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        String s = this.d;
        if(s != null) {
            v1 = s.hashCode();
        }
        return this.e ? this.f.hashCode() + (((v + v2) * 0x1F + v1) * 0x1F + 0x4CF) * 0x1F : this.f.hashCode() + (((v + v2) * 0x1F + v1) * 0x1F + 0x4D5) * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(__typename=" + this.a + ", id=" + this.b + ", verifiedMobile=" + this.c + ", mobile=" + this.d + ", needsNewPin=" + this.e + ", userAppPropsFragment=" + this.f + ")";
    }
}

