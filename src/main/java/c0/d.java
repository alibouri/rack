package c0;

import Nb.j;
import W5.f;

public final class d {
    public int a;

    public d(int v) {
        this.a = v;
    }

    @Override
    public final String toString() {
        f.o(16);
        String s = Integer.toString(this.hashCode(), 16);
        j.e(s, "toString(this, checkRadix(radix))");
        return "IntRef(element = " + this.a + ")@" + s;
    }
}

