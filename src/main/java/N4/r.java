package N4;

import Nb.j;
import java.io.Serializable;
import java.util.HashMap;

public final class r implements Serializable {
    public final HashMap X;

    public r(HashMap hashMap0) {
        j.f(hashMap0, "proxyEvents");
        super();
        this.X = hashMap0;
    }

    private final Object readResolve() {
        return new s(this.X);
    }
}

