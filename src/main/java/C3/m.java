package c3;

import Nb.j;
import a3.f;
import a3.p;

public final class m extends e {
    public final p a;
    public final String b;
    public final f c;

    public m(p p0, String s, f f0) {
        this.a = p0;
        this.b = s;
        this.c = f0;
    }

    // Deobfuscation rating: LOW(40)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof m && j.a(this.a, ((m)object0).a) && j.a(this.b, ((m)object0).b) && this.c == ((m)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? this.c.hashCode() + v * 961 : this.c.hashCode() + (v * 0x1F + this.b.hashCode()) * 0x1F;
    }
}

