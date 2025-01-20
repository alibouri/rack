package Y8;

import A3.e;
import Nb.j;
import com.apollographql.apollo.api.b;

public final class d0 {
    public final String a;
    public final String b;
    public final boolean c;

    public d0(String s, String s1, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d0)) {
            return false;
        }
        if(!j.a(this.a, ((d0)object0).a)) {
            return false;
        }
        return j.a(this.b, ((d0)object0).b) ? this.c == ((d0)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        return this.c ? v + 0x4CF : v + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("DisplayField(label=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", value=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", isDisplayedAfterOtherFields=");
        return b.r(stringBuilder0, this.c, ")");
    }
}

