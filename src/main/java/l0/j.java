package l0;

import Ab.c;
import Nb.f;

public final class j implements f {
    @Override  // Nb.f
    public final c a() {
        return g.Y;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof j && object0 instanceof f) {
            c c0 = ((f)object0).a();
            return g.Y.equals(c0);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return g.Y.hashCode();
    }
}

