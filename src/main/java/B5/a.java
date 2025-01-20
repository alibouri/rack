package b5;

import Nb.j;
import m5.b;

public final class a {
    public final String a;
    public final boolean b;

    public a(String s, boolean z) {
        j.f(s, "name");
        super();
        this.a = s;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return j.a(this.a, ((a)object0).a) ? this.b == ((a)object0).b : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b;
        if(v1) {
            v1 = 1;
        }
        return v * 0x1F + v1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GateKeeper(name=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", value=");
        return b.z(stringBuilder0, this.b, ')');
    }
}

