package K9;

import Aa.s0;
import Aa.t0;
import Ab.t;
import Eb.a;
import ac.h;
import ac.i;
import kotlin.coroutines.g;

public final class e0 implements h {
    public final int X;
    public final t0 Y;

    public e0(t0 t00, int v) {
        this.X = v;
        this.Y = t00;
        super();
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        switch(this.X) {
            case 0: {
                s0 s00 = new s0(i0, 15);
                Object object1 = this.Y.d(s00, g0);
                return object1 != a.X ? t.a : object1;
            }
            case 1: {
                U2.i i2 = new U2.i(i0, 8);
                Object object2 = this.Y.d(i2, g0);
                return object2 != a.X ? t.a : object2;
            }
            default: {
                U2.i i1 = new U2.i(i0, 11);
                Object object0 = this.Y.d(i1, g0);
                return object0 != a.X ? t.a : object0;
            }
        }
    }
}

