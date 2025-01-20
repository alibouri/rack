package X9;

import Bb.w;
import Kb.h;
import Ub.g;
import Ub.i;
import aa.a;
import aa.b;
import aa.c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class f implements Function0 {
    public final int X;
    public final b Y;

    public f(b b0, int v) {
        this.X = v;
        this.Y = b0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.X != 0) {
            b b0 = this.Y;
            h h0 = i.W(new w(0, ((Iterable)b0.a.g().j)), a.g0);
            Object object0 = null;
            for(Object object1: ((g)h0.b)) {
                Object object2 = ((Function1)h0.c).n(object1);
                if(((c)object2).a.p <= ((Number)b0.b.j(b0, ((c)object2))).intValue()) {
                    object0 = object2;
                }
            }
            return (c)object0;
        }
        c c0 = this.Y.e();
        return c0 != null ? c0.a() : null;
    }
}

