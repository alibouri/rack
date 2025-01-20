package Y8;

import A3.e;
import Nb.j;
import m5.b;

public final class e4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public e4(String s, String s1, String s2, String s3) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e4)) {
            return false;
        }
        if(!j.a(this.a, ((e4)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((e4)object0).b)) {
            return false;
        }
        return j.a(this.c, ((e4)object0).c) ? j.a(this.d, ((e4)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.d.hashCode() + e.s(v * 961, 0x1F, this.c) : this.d.hashCode() + e.s((v * 0x1F + this.b.hashCode()) * 0x1F, 0x1F, this.c);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TermsAndConditions(id=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", acceptedVersion=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", latestVersion=");
        stringBuilder0.append(this.c);
        stringBuilder0.append(", url=");
        return b.y(stringBuilder0, this.d, ")");
    }
}

