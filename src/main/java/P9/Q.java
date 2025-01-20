package p9;

import Ab.t;
import Eb.a;
import ac.h;
import ac.i;
import kotlin.coroutines.g;
import o9.U0;
import o9.W0;

public final class q implements h {
    public final int X;
    public final U0 Y;

    public q(U0 u00, int v) {
        this.X = v;
        this.Y = u00;
        super();
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        if(this.X != 0) {
            W0 w00 = new W0(i0, 21);
            Object object0 = this.Y.d(w00, g0);
            return object0 != a.X ? t.a : object0;
        }
        W0 w01 = new W0(i0, 20);
        Object object1 = this.Y.d(w01, g0);
        return object1 != a.X ? t.a : object1;
    }
}

