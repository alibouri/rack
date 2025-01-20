package k2;

import Ab.t;
import Nb.k;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import v.a0;
import v.j;

public final class b1 extends k implements Function1 {
    public final int X;
    public final Function2 Y;

    public b1(Function2 function20, int v) {
        this.X = v;
        if(v != 1) {
            this.Y = function20;
            super(1);
            return;
        }
        this.Y = function20;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Function2 function20 = this.Y;
        if(this.X != 0) {
            function20.j(((j)object0).e.getValue(), a0.g0.n(((j)object0).f));
            return t.a;
        }
        Nb.j.f(((WeakReference)object0), "it");
        return ((WeakReference)object0).get() == null || ((WeakReference)object0).get() == function20 ? Boolean.valueOf(true) : Boolean.valueOf(false);
    }
}

