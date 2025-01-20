package Ea;

import Ab.t;
import U.d;
import U.p;
import android.support.v4.media.session.a;
import kotlin.jvm.functions.Function2;

public final class o implements Function2 {
    public final int X;
    public final boolean Y;
    public final int Z;

    public o(int v, int v1, boolean z) {
        this.X = v1;
        this.Y = z;
        this.Z = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        if(this.X != 0) {
            a.l(d.O(this.Z | 1), ((p)object0), this.Y);
            return t.a;
        }
        com.wave.customer.scratchCardRewards.d.e(d.O(this.Z | 1), ((p)object0), this.Y);
        return t.a;
    }
}

