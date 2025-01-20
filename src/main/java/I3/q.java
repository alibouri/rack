package i3;

import Bb.A;
import Nb.j;
import java.util.Map;

public final class q {
    public final Map a;
    public static final q b;

    static {
        q.b = new q(A.X);
    }

    public q(Map map0) {
        this.a = map0;
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof q && j.a(this.a, ((q)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "Tags(tags=" + this.a + ')';
    }
}

