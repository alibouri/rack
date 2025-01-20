package a9;

import Nb.j;
import m5.b;

public final class a0 {
    public final String a;
    public final String b;

    public a0(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a0)) {
            return false;
        }
        return j.a(this.a, ((a0)object0).a) ? j.a(this.b, ((a0)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Field(name=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", value=");
        return b.y(stringBuilder0, this.b, ")");
    }
}

