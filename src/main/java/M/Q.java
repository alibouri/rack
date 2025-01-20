package M;

import Nb.j;
import m5.b;

public final class q {
    public final p a;
    public final p b;
    public final boolean c;

    public q(p p0, p p1, boolean z) {
        this.a = p0;
        this.b = p1;
        this.c = z;
    }

    public static q a(q q0, p p0, p p1, boolean z, int v) {
        if((v & 1) != 0) {
            p0 = q0.a;
        }
        if((v & 2) != 0) {
            p1 = q0.b;
        }
        if((v & 4) != 0) {
            z = q0.c;
        }
        q0.getClass();
        return new q(p0, p1, z);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof q)) {
            return false;
        }
        if(!j.a(this.a, ((q)object0).a)) {
            return false;
        }
        return j.a(this.b, ((q)object0).b) ? this.c == ((q)object0).c : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c ? (v1 + v * 0x1F) * 0x1F + 0x4CF : (v1 + v * 0x1F) * 0x1F + 0x4D5;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Selection(start=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", end=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", handlesCrossed=");
        return b.z(stringBuilder0, this.c, ')');
    }
}

