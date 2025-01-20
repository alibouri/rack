package L;

import Nb.j;
import m5.b;

public final class n {
    public final String a;
    public String b;
    public boolean c;
    public e d;

    public n(String s, String s1) {
        this.a = s;
        this.b = s1;
        this.c = false;
        this.d = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(!j.a(this.a, ((n)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((n)object0).b)) {
            return false;
        }
        return this.c == ((n)object0).c ? j.a(this.d, ((n)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        int v = A3.e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        int v1 = this.c ? 0x4CF : 0x4D5;
        return this.d == null ? (v + v1) * 0x1F : (v + v1) * 0x1F + this.d.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("TextSubstitution(layoutCache=");
        stringBuilder0.append(this.d);
        stringBuilder0.append(", isShowingSubstitution=");
        return b.z(stringBuilder0, this.c, ')');
    }
}

