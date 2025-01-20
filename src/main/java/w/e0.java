package w;

import Ab.t;
import Eb.a;
import Fb.j;
import U.U;
import U.V;
import W5.f;
import Xb.G;
import Zb.i;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e0 extends j implements Function2 {
    public int c0;
    public final f0 d0;

    public e0(f0 f00, g g0) {
        this.d0 = f00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((e0)this.t(((G)object0), ((g)object1))).v(t.a);
        return a.X;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e0(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        f0 f00 = this.d0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                goto label_12;
            }
            case 1: {
                f.b0(object0);
                goto label_17;
            }
            case 2: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            q0 q00 = f00.x0;
            if(q00 != null) {
                ((s0)q00).d();
            }
            do {
            label_12:
                i i0 = f00.C0;
                if(i0 != null) {
                    this.c0 = 1;
                    if(i0.t(this) == object1) {
                        return object1;
                    }
                }
            label_17:
            }
            while(f00.x0 == null);
            this.c0 = 2;
            Nb.j.c(this.Y);
        }
        while(V.a(this.Y).v(new U(0, r.b0), this) != object1);
        return object1;
    }
}

