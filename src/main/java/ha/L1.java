package ha;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Y8.G6;
import Y8.O;
import Y8.X7;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class l1 extends j implements Function2 {
    public int c0;
    public final S2 d0;

    public l1(S2 s20, g g0) {
        this.d0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l1)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new l1(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                try {
                    X7 x70 = new X7();  // initializer: Ljava/lang/Object;-><init>()V
                    this.c0 = 1;
                    if(this.d0.Y.f(x70, G6.X, this) == object1) {
                        return object1;
                    }
                }
                catch(O unused_ex) {
                }
                return t.a;
            }
            case 1: {
                try {
                    f.b0(object0);
                }
                catch(O unused_ex) {
                }
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

