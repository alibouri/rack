package R2;

import Nb.j;
import Y8.o;

public final class i {
    public final String a;
    public final int b;

    public i(String s, int v) {
        j.f(s, "workSpecId");
        super();
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof i)) {
            return false;
        }
        return j.a(this.a, ((i)object0).a) ? this.b == ((i)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("WorkGenerationalId(workSpecId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", generation=");
        return o.z(stringBuilder0, this.b, ')');
    }
}

