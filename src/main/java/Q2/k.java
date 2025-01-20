package q2;

import Nb.j;
import x2.g;

public abstract class k extends E {
    public abstract void d(g arg1, Object arg2);

    public final void e(Iterable iterable0) {
        j.f(iterable0, "entities");
        g g0 = this.a();
        try {
            for(Object object0: iterable0) {
                this.d(g0, object0);
                g0.a();
            }
        }
        finally {
            this.c(g0);
        }
    }

    public final void f(Object object0) {
        g g0 = this.a();
        try {
            this.d(g0, object0);
            g0.a();
        }
        finally {
            this.c(g0);
        }
    }
}

