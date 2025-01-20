package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.R6;
import Y8.R9;
import Y8.j8;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class t1 extends j implements Function2 {
    public int c0;
    public final S2 d0;

    public t1(S2 s20, g g0) {
        this.d0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((t1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new t1(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                j8 j80 = new j8();  // initializer: Ljava/lang/Object;-><init>()V
                this.c0 = 1;
                object0 = R6.d(this.d0.Y, j80, null, null, this, 6);
                return object0 == object1 ? object1 : object0;
            }
            case 1: {
                f.b0(object0);
                return object0;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

