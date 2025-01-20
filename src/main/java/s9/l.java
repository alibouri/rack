package S9;

import Ab.t;
import R9.j3;
import U.d;
import U.p;
import c0.b;
import kotlin.jvm.functions.Function2;

public final class l implements Function2 {
    public final int X;
    public final boolean Y;
    public final int Z;
    public final Object b0;

    public l(j3 j30, boolean z, int v) {
        this.X = 0;
        super();
        this.b0 = j30;
        this.Y = z;
        this.Z = v;
    }

    public l(boolean z, b b0, int v) {
        this.X = 1;
        super();
        this.Y = z;
        this.b0 = b0;
        this.Z = v;
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        if(this.X != 0) {
            ((Integer)object1).getClass();
            T4.l.e(this.Y, ((b)this.b0), ((p)object0), d.O(this.Z | 1));
            return t.a;
        }
        yc.l.d(((j3)this.b0), this.Y, ((p)object0), d.O(this.Z | 1));
        return t.a;
    }
}

