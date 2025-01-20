package ra;

import Ab.t;
import Eb.a;
import Na.f;
import ac.h;
import ac.i;
import kotlin.coroutines.g;
import p9.h0;

public final class r0 implements h {
    public final int X;
    public final f Y;

    public r0(f f0, int v) {
        this.X = v;
        if(v != 1) {
            super();
            this.Y = f0;
            return;
        }
        super();
        this.Y = f0;
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        Object object0 = t.a;
        f f0 = this.Y;
        if(this.X != 0) {
            Object object1 = f0.d(new h0(i0, 8), g0);
            return object1 == a.X ? object1 : object0;
        }
        Object object2 = f0.d(new h0(i0), g0);
        return object2 == a.X ? object2 : object0;
    }
}

