package ha;

import Ab.e;
import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Y8.H6;
import Y8.O;
import Y8.Q5;
import Y8.R6;
import ac.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class q1 extends j implements Function2 {
    public i c0;
    public int d0;
    public Object e0;
    public final S2 f0;

    public q1(S2 s20, g g0) {
        this.f0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((q1)this.t(((i)object0), ((g)object1))).v(t.a);
        return a.X;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new q1(this.f0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        i i1;
        i i0;
        Object object1 = a.X;
        S2 s20 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                i0 = (i)this.e0;
                try {
                    Q5 q50 = new Q5();  // initializer: Ljava/lang/Object;-><init>()V
                    this.e0 = i0;
                    this.c0 = i0;
                    this.d0 = 1;
                    object0 = R6.d(s20.Y, q50, H6.Y, null, this, 4);
                    if(object0 == object1) {
                        return object1;
                    }
                }
                catch(O unused_ex) {
                    break;
                }
                i1 = i0;
                goto label_20;
            }
            case 1: {
                i0 = this.c0;
                i1 = (i)this.e0;
                try {
                    f.b0(object0);
                label_20:
                    this.e0 = i1;
                    this.c0 = null;
                    this.d0 = 2;
                    if(i0.c(object0, this) == object1) {
                        return object1;
                    }
                }
                catch(O unused_ex) {
                }
                i0 = i1;
                break;
            }
            case 2: {
                i0 = (i)this.e0;
                try {
                    f.b0(object0);
                }
                catch(O unused_ex) {
                }
                break;
            }
            case 3: {
                f.b0(object0);
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        p1 p10 = new p1(s20, i0);
        this.e0 = null;
        this.c0 = null;
        this.d0 = 3;
        s20.v0.d(p10, this);
        return object1;
    }
}

