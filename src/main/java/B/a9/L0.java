package a9;

import Nb.j;

public final class l0 {
    public final int a;
    public final String b;

    public l0(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l0)) {
            return false;
        }
        return this.a == ((l0)object0).a ? j.a(this.b, ((l0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a * 0x1F;
    }

    @Override
    public final String toString() {
        return "OnTextFieldGroupedFormatter(groupSize=" + this.a + ", separator=" + this.b + ")";
    }
}

