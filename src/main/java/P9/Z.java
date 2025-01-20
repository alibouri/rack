package p9;

import A3.e;
import Nb.j;

public final class z {
    public final int a;
    public final String b;
    public boolean c;
    public int d;

    public z(boolean z, String s, int v, int v1) {
        j.f(s, "displayName");
        super();
        this.a = v;
        this.b = s;
        this.c = z;
        this.d = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof z)) {
            return false;
        }
        if(this.a != ((z)object0).a) {
            return false;
        }
        if(!j.a(this.b, ((z)object0).b)) {
            return false;
        }
        return this.c == ((z)object0).c ? this.d == ((z)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a * 0x1F, 0x1F, this.b);
        return this.c ? (v + 0x4CF) * 0x1F + this.d : (v + 0x4D5) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "AddOnsItemModel(id=" + this.a + ", displayName=" + this.b + ", isSelected=" + this.c + ", color=" + this.d + ")";
    }
}

