package u;

import Nb.k;
import kotlin.jvm.functions.Function0;
import v.k0;

public final class n extends k implements Function0 {
    public final int X;
    public final k0 Y;

    public n(k0 k00, int v) {
        this.X = v;
        this.Y = k00;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            return this.Y.b();
        }
        return this.Y.c() != t.Z || this.Y.d.getValue() != t.Z ? Boolean.valueOf(false) : Boolean.valueOf(true);
    }
}

