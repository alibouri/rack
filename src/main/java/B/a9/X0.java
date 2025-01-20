package a9;

import Nb.j;

public final class x0 {
    public final String a;
    public final z0 b;

    public x0(String s, z0 z00) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = z00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof x0)) {
            return false;
        }
        return j.a(this.a, ((x0)object0).a) ? j.a(this.b, ((x0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.a.hashCode();
    }

    @Override
    public final String toString() {
        return "DisableDetails(__typename=" + this.a + ", onAirtimeDisableDetails=" + this.b + ")";
    }
}

