package a9;

import Nb.j;

public final class g9 {
    public final String a;
    public final e9 b;

    public g9(String s, e9 e90) {
        this.a = s;
        this.b = e90;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof g9)) {
            return false;
        }
        return j.a(this.a, ((g9)object0).a) ? j.a(this.b, ((g9)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.a.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "User(id=" + this.a + ", appProps=" + this.b + ")";
    }
}

