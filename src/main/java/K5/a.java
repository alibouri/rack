package k5;

import Nb.j;
import T0.l;
import T0.w;

public final class a {
    public final l a;
    public final w b;

    public a(l l0) {
        this(l0, w.k0);
    }

    public a(l l0, w w0) {
        j.f(w0, "weight");
        super();
        this.a = l0;
        this.b = w0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof a)) {
            return false;
        }
        return j.a(this.a, ((a)object0).a) ? j.a(this.b, ((a)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.X;
    }

    @Override
    public final String toString() {
        return "FontFamilyWithWeight(fontFamily=" + this.a + ", weight=" + this.b + ')';
    }
}

