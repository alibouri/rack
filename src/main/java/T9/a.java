package t9;

import Nb.j;
import m5.b;

public final class a {
    public final boolean a;
    public final String b;

    public a(boolean z, String s) {
        j.f(s, "until");
        super();
        this.a = z;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return this.a == ((a)object0).a ? j.a(this.b, ((a)object0).b) : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? this.b.hashCode() + 0x9511 : this.b.hashCode() + 0x95CB;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SupportHoursDisplayInfo(isSupportOpen=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", until=");
        return b.y(stringBuilder0, this.b, ")");
    }
}

