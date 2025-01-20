package Y8;

import Nb.j;

public final class r0 {
    public final String a;
    public final p0 b;

    public r0(String s, p0 p00) {
        this.a = s;
        this.b = p00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof r0)) {
            return false;
        }
        return j.a(this.a, ((r0)object0).a) ? j.a(this.b, ((r0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "User(id=" + this.a + ", scratchCards=" + this.b + ")";
    }
}

