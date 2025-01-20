package a9;

import Nb.j;

public final class y3 {
    public final String a;
    public final A3 b;

    public y3(String s, A3 a30) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = a30;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y3)) {
            return false;
        }
        return j.a(this.a, ((y3)object0).a) ? j.a(this.b, ((y3)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "Formatter(__typename=" + this.a + ", onTextFieldGroupedFormatter=" + this.b + ")";
    }
}

