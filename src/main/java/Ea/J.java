package ea;

import Ab.t;
import Eb.a;
import W5.f;
import Xb.G;
import Y8.R1;
import Y8.R6;
import Y8.x6;
import Y8.z6;
import ac.B0;
import hd.c;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class j extends Fb.j implements Function2 {
    public int c0;
    public final k d0;

    public j(k k0, g g0) {
        this.d0 = k0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new j(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        k k0 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                R1 r10 = new R1();  // initializer: Ljava/lang/Object;-><init>()V
                this.c0 = 1;
                object0 = R6.i(k0.Y, r10, null, this, 6);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        B0 b00 = k0.d0;
        do {
            Object object2 = b00.getValue();
            ea.f f0 = ea.f.a(((ea.f)object2), null, false, ((z6)object0) instanceof x6, false, false, null, 51);
            c.a.n("DeviceManagementViewModel");
            c.a.a("update() called with: newState = " + f0, new Object[0]);
        }
        while(!b00.j(object2, f0));
        return t.a;
    }
}

