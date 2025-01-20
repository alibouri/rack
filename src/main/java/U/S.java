package u;

import E.B;
import Nb.j;
import Nb.k;
import U.F;
import kotlin.jvm.functions.Function1;
import v.k0;

public final class s extends k implements Function1 {
    public final int X;
    public final k0 Y;

    public s(k0 k00, int v) {
        this.X = v;
        this.Y = k00;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            F f0 = (F)object0;
            return new B(11, this.Y);
        }
        return Boolean.valueOf(!j.a(object0, this.Y.d.getValue()));
    }
}

