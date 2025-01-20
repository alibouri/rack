package e0;

import Ab.t;
import Nb.k;
import kotlin.jvm.functions.Function1;

public final class a extends k implements Function1 {
    public final int X;
    public final Function1 Y;
    public final Function1 Z;

    public a(Function1 function10, Function1 function11, int v) {
        this.X = v;
        this.Y = function10;
        this.Z = function11;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        int v;
        switch(this.X) {
            case 0: {
                synchronized(m.b) {
                    v = m.d;
                    m.d = v + 1;
                }
                return new c(v, ((e0.k)object0), this.Y, this.Z);
            }
            case 1: {
                this.Y.n(object0);
                this.Z.n(object0);
                return t.a;
            }
            default: {
                this.Y.n(object0);
                this.Z.n(object0);
                return t.a;
            }
        }
    }
}

