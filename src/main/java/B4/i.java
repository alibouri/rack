package b4;

import Lc.c;
import java.util.List;

public final class i implements e {
    public List a;

    @Override  // b4.e
    public final boolean a(Z z0) {
        for(Object object0: this.a) {
            if(c.k(((n)object0), z0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @Override
    public final String toString() {
        return "not(" + this.a + ")";
    }
}

