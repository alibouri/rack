package k2;

import Ab.t;
import C3.i;
import Eb.a;
import Nb.u;
import W5.f;
import ac.G0;
import ac.b0;
import ac.w;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class j extends Fb.j implements Function2 {
    public int c0;
    public Object d0;
    public final i e0;

    public j(i i0, g g0) {
        this.e0 = i0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((ac.i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                ac.i i0 = (ac.i)this.d0;
                u u0 = new u();  // initializer: Ljava/lang/Object;-><init>()V
                u0.X = 0x80000000;
                w w0 = new w(((G0)this.e0.Z), new h(2, null), 3);  // initializer: LFb/j;-><init>(ILkotlin/coroutines/g;)V
                b0 b00 = new b0(u0, i0);
                this.c0 = 1;
                return w0.d(b00, this) == object1 ? object1 : t.a;
            }
            case 1: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

