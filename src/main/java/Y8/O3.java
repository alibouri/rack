package Y8;

import Nb.j;

public final class o3 {
    public final String a;
    public final m3 b;

    public o3(String s, m3 m30) {
        this.a = s;
        this.b = m30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof o3)) {
            return false;
        }
        return j.a(this.a, ((o3)object0).a) ? j.a(this.b, ((o3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Me(id=" + this.a + ", kycInfo=" + this.b + ")";
    }
}

