package I8;

import java.util.ArrayList;

public final class b {
    public final ArrayList a;
    public final int b;

    public b(int v, ArrayList arrayList0) {
        this.a = new ArrayList(arrayList0);
        this.b = v;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b ? this.a.equals(((b)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ Boolean.FALSE.hashCode();
    }

    @Override
    public final String toString() {
        return "{ " + this.a + " }";
    }
}

