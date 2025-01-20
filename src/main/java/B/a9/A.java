package a9;

import A3.e;
import Nb.j;

public final class a {
    public final String a;
    public final String b;
    public final i c;

    public a(String s, String s1, i i0) {
        this.a = s;
        this.b = s1;
        this.c = i0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        if(!j.a(this.a, ((a)object0).a)) {
            return false;
        }
        return j.a(this.b, ((a)object0).b) ? j.a(this.c, ((a)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = e.s(this.a.hashCode() * 0x1F, 0x1F, this.b);
        return this.c == null ? v : v + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "Action(name=" + this.a + ", uri=" + this.b + ", shareInfo=" + this.c + ")";
    }
}

