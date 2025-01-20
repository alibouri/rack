package ma;

import Ab.t;
import Eb.a;
import R9.Q1;
import ac.h;
import ac.i;
import kotlin.coroutines.g;

public final class f0 implements h {
    public final int X;
    public final Q1 Y;
    public final q0 Z;

    public f0(Q1 q10, q0 q00, int v) {
        this.X = v;
        this.Y = q10;
        this.Z = q00;
        super();
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        if(this.X != 0) {
            e0 e00 = new e0(i0, this.Z, 2);
            Object object0 = this.Y.d(e00, g0);
            return object0 != a.X ? t.a : object0;
        }
        e0 e01 = new e0(i0, this.Z, 0);
        Object object1 = this.Y.d(e01, g0);
        return object1 != a.X ? t.a : object1;
    }
}

