package q9;

import Ab.t;
import Eb.a;
import ac.i;
import bc.n;
import kotlin.coroutines.g;

public final class h implements ac.h {
    public final int X;
    public final n Y;

    public h(n n0, int v) {
        this.X = v;
        this.Y = n0;
        super();
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        switch(this.X) {
            case 0: {
                q9.g g2 = new q9.g(i0, 0);
                Object object1 = this.Y.d(g2, g0);
                return object1 != a.X ? t.a : object1;
            }
            case 1: {
                q9.g g3 = new q9.g(i0, 2);
                Object object2 = this.Y.d(g3, g0);
                return object2 != a.X ? t.a : object2;
            }
            default: {
                q9.g g1 = new q9.g(i0, 3);
                Object object0 = this.Y.d(g1, g0);
                return object0 != a.X ? t.a : object0;
            }
        }
    }
}

