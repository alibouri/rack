package Ea;

import Ab.e;
import Ab.t;
import Fb.j;
import W5.f;
import Y8.O;
import Y8.T;
import Y8.x6;
import Y8.y6;
import Y8.z6;
import ac.B0;
import hd.c;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class z0 extends j implements Function2 {
    public Object c0;
    public final O0 d0;

    public z0(O0 o00, g g0) {
        this.d0 = o00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((z0)this.t(((z6)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new z0(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        O o0;
        f.b0(object0);
        z6 z60 = (z6)this.c0;
        c.a.n("ScratchCardRewardsViewModel");
        c.a.g("Publishing query update: " + z60, new Object[0]);
        B0 b00 = this.d0.f0;
        while(true) {
            Object object1 = b00.getValue();
            z60.getClass();
            if(z60 instanceof y6) {
                o0 = null;
            }
            else {
                if(!(z60 instanceof x6)) {
                    break;
                }
                o0 = ((x6)z60).b;
            }
            if(b00.j(object1, P0.a(((P0)object1), null, null, o0 instanceof T, z60.c() && !z60.d(), null, null, null, null, null, null, 0x3F3))) {
                return t.a;
            }
        }
        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
    }
}

