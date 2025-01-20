package q9;

import Ab.t;
import Eb.a;
import Fb.j;
import K.v;
import W5.f;
import Xb.G;
import Y8.R6;
import Y8.U3;
import Y8.l0;
import Y8.m0;
import Y8.y6;
import com.sendwave.backend.type.PinStatus.CORRECT;
import com.sendwave.backend.type.PinStatus.INCORRECT;
import com.sendwave.backend.type.PinStatus.RECOVERABLE;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class x2 extends j implements Function2 {
    public int c0;
    public final String d0;
    public final v e0;

    public x2(String s, v v0, g g0) {
        this.d0 = s;
        this.e0 = v0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x2)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x2(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                m0 m00 = new m0(this.d0);
                try {
                    this.c0 = 1;
                    object0 = R6.d(((R6)this.e0.Y), m00, null, null, this, 6);
                    if(object0 == object1) {
                        return object1;
                    label_9:
                        f.b0(object0);
                    }
                    return ((l0)((y6)object0).b).a ? CORRECT.X : INCORRECT.X;
                }
                catch(U3 unused_ex) {
                    break;
                }
            }
            case 1: {
                goto label_9;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return RECOVERABLE.X;
    }
}

