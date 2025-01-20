package ha;

import Ab.t;
import Nb.j;
import Va.d;
import kotlin.jvm.functions.Function1;

public final class e0 implements Function1 {
    public final int X;
    public final n Y;

    public e0(n n0, int v) {
        this.X = v;
        this.Y = n0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        if(this.X != 0) {
            j.f(((d)object0), "it");
            this.Y.r.invoke();
            return t.a;
        }
        j.f(((d)object0), "it");
        this.Y.r.invoke();
        return t.a;
    }
}

