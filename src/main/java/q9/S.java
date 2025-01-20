package q9;

import Ab.t;
import Eb.a;
import Ha.S;
import K9.e0;
import ac.h;
import ac.i;
import ac.j0;
import ac.z0;
import ha.v2;
import kotlin.coroutines.g;

public final class s implements h {
    public final int X;
    public final h Y;

    public s(int v, h h0) {
        this.X = v;
        this.Y = h0;
        super();
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        switch(this.X) {
            case 0: {
                q9.g g2 = new q9.g(i0, 1);
                ((j0)this.Y).d(g2, g0);
                return a.X;
            }
            case 1: {
                q9.g g3 = new q9.g(i0, 4);
                Object object1 = ((S)this.Y).d(g3, g0);
                return object1 != a.X ? t.a : object1;
            }
            case 2: {
                q9.g g4 = new q9.g(i0, 5);
                Object object2 = ((z0)this.Y).d(g4, g0);
                return object2 != a.X ? t.a : object2;
            }
            case 3: {
                q9.g g5 = new q9.g(i0, 6);
                Object object3 = ((s)this.Y).d(g5, g0);
                return object3 != a.X ? t.a : object3;
            }
            case 4: {
                q9.g g6 = new q9.g(i0, 7);
                Object object4 = ((v2)this.Y).d(g6, g0);
                return object4 != a.X ? t.a : object4;
            }
            default: {
                q9.g g1 = new q9.g(i0, 8);
                Object object0 = ((e0)this.Y).d(g1, g0);
                return object0 != a.X ? t.a : object0;
            }
        }
    }
}

