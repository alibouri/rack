package a9;

import Nb.j;

public final class f0 {
    public final String a;
    public final l0 b;

    public f0(String s, l0 l00) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = l00;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof f0)) {
            return false;
        }
        return j.a(this.a, ((f0)object0).a) ? j.a(this.b, ((f0)object0).b) : false;
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

