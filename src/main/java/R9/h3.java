package R9;

import Nb.j;
import U.p;
import m5.b;

public final class h3 implements i3 {
    public final String a;

    public h3(String s) {
        j.f(s, "str");
        super();
        this.a = s;
    }

    @Override  // R9.i3
    public final String a(int v, p p0) {
        return w2.b(this, p0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof h3 ? j.a(this.a, ((h3)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("Str(str="), this.a, ")");
    }
}

