package v3;

import Nb.j;
import m5.b;

public final class p implements q {
    public final String a;

    public p(String s) {
        this.a = s;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof p && j.a(this.a, ((p)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return b.y(new StringBuilder("Url(url="), this.a, ")");
    }
}

