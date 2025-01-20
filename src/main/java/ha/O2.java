package ha;

import Ab.t;
import Eb.a;
import ac.h;
import ac.i0;
import ac.i;
import kotlin.coroutines.g;

public final class o2 implements h {
    public final int X;
    public final i0 Y;
    public final S2 Z;

    public o2(i0 i00, S2 s20, int v) {
        this.X = v;
        this.Y = i00;
        this.Z = s20;
        super();
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        if(this.X != 0) {
            p1 p10 = new p1(i0, this.Z, 3);
            Object object0 = this.Y.X.d(p10, g0);
            return object0 != a.X ? t.a : object0;
        }
        p1 p11 = new p1(i0, this.Z, 2);
        Object object1 = this.Y.X.d(p11, g0);
        return object1 != a.X ? t.a : object1;
    }
}

