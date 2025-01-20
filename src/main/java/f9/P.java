package f9;

import Ab.t;
import Eb.a;
import R9.U1;
import ac.h;
import ac.i;
import kotlin.coroutines.g;

public final class p implements h {
    public final int X;
    public final U1 Y;

    public p(U1 u10, int v) {
        this.X = v;
        this.Y = u10;
        super();
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        if(this.X != 0) {
            U2.i i1 = new U2.i(i0, 5);
            Object object0 = this.Y.d(i1, g0);
            return object0 != a.X ? t.a : object0;
        }
        U2.i i2 = new U2.i(i0, 4);
        Object object1 = this.Y.d(i2, g0);
        return object1 != a.X ? t.a : object1;
    }
}

