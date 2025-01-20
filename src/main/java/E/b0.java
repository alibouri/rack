package E;

import Nb.k;
import d0.j;
import java.util.Map;
import kotlin.jvm.functions.Function1;

public final class b0 extends k implements Function1 {
    public final int X;
    public final j Y;

    public b0(j j0, int v) {
        this.X = v;
        this.Y = j0;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            return new d0(this.Y, ((Map)object0));
        }
        return this.Y == null ? Boolean.valueOf(true) : Boolean.valueOf(this.Y.a(object0));
    }
}

