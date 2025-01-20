package R2;

import Nb.j;
import Y8.o;

public final class g {
    public final String a;
    public final int b;
    public final int c;

    public g(String s, int v, int v1) {
        j.f(s, "workSpecId");
        super();
        this.a = s;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        if(!j.a(this.a, ((g)object0).a)) {
            return false;
        }
        return this.b == ((g)object0).b ? this.c == ((g)object0).c : false;
    }

    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 0x1F + this.b) * 0x1F + this.c;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("SystemIdInfo(workSpecId=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", generation=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", systemId=");
        return o.z(stringBuilder0, this.c, ')');
    }
}

