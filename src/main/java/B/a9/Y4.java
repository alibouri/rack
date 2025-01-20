package a9;

import Nb.j;
import m5.b;

public final class y4 {
    public final String a;
    public final F4 b;
    public final String c;

    public y4(String s, F4 f40, String s1) {
        this.a = s;
        this.b = f40;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof y4)) {
            return false;
        }
        if(!j.a(this.a, ((y4)object0).a)) {
            return false;
        }
        return j.a(this.b, ((y4)object0).b) ? j.a(this.c, ((y4)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Button1(text=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", style=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", actionUri=");
        return b.y(stringBuilder0, this.c, ")");
    }
}

