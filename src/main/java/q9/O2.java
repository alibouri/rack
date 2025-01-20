package q9;

import A3.e;
import M.J;

public final class o2 {
    public final int a;
    public final String b;
    public final int c;

    public o2(int v, int v1, String s) {
        this.a = v;
        this.b = s;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o2)) {
            return false;
        }
        if(this.a != ((o2)object0).a) {
            return false;
        }
        return this.b.equals(((o2)object0).b) ? this.c == ((o2)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return e.s(this.a * 0x1F, 0x1F, this.b) + this.c;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("PartnerOrgInfo(logo=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", displayName=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", grayLogo=");
        return J.f(stringBuilder0, this.c, ")");
    }
}

