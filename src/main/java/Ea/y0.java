package Ea;

import Ab.t;
import Fb.j;
import W5.f;
import java.util.Date;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class y0 extends j implements Function2 {
    public Object c0;
    public final O0 d0;

    public y0(O0 o00, g g0) {
        this.d0 = o00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((y0)this.t(((Date)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new y0(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        Date date0 = (Date)this.c0;
        if(date0 != null) {
            long v = date0.getTime();
            O0 o00 = this.d0;
            o00.c0.getClass();
            if(v < System.currentTimeMillis()) {
                O0.o(o00);
            }
        }
        return t.a;
    }
}

