package ma;

import Ab.t;
import Eb.a;
import R9.Q1;
import ac.h;
import ac.i;
import kotlin.coroutines.g;

public final class l0 implements h {
    public final int X;
    public final Q1 Y;

    public l0(Q1 q10, int v) {
        this.X = v;
        this.Y = q10;
        super();
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        if(this.X != 0) {
            i0 i00 = new i0(i0, 3);
            Object object0 = this.Y.d(i00, g0);
            return object0 != a.X ? t.a : object0;
        }
        i0 i01 = new i0(i0, 2);
        Object object1 = this.Y.d(i01, g0);
        return object1 != a.X ? t.a : object1;
    }
}

