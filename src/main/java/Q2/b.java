package q2;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.G;
import Zb.i;
import java.util.concurrent.Callable;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class b extends j implements Function2 {
    public Zb.b c0;
    public int d0;
    public final v e0;
    public final c f0;
    public final i g0;
    public final Callable h0;
    public final i i0;

    public b(v v0, c c0, i i0, Callable callable0, i i1, g g0) {
        this.e0 = v0;
        this.f0 = c0;
        this.g0 = i0;
        this.h0 = callable0;
        this.i0 = i1;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((b)this.t(((G)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new b(this.e0, this.f0, this.g0, this.h0, this.i0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        v v0;
        c c0;
        Object object1;
        try {
            object1 = a.X;
            c0 = this.f0;
            v0 = this.e0;
            switch(this.d0) {
                case 0: {
                    goto label_5;
                }
                case 1: {
                    goto label_9;
                }
                case 2: {
                    goto label_12;
                }
            }
        }
        catch(Throwable throwable0) {
            v0.e.c(c0);
            throw throwable0;
        }
        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
    label_5:
        f.b0(object0);
        v0.e.a(c0);
        try {
            Zb.b b0 = new Zb.b(this.g0);
            goto label_14;
        label_9:
            b0 = this.c0;
            f.b0(object0);
            goto label_19;
        label_12:
            b0 = this.c0;
            f.b0(object0);
            while(true) {
            label_14:
                this.c0 = b0;
                this.d0 = 1;
                object0 = b0.a(this);
                if(object0 == object1) {
                    return object1;
                }
            label_19:
                if(!((Boolean)object0).booleanValue()) {
                    goto label_30;
                }
                b0.b();
                Object object2 = this.h0.call();
                this.c0 = b0;
                this.d0 = 2;
                if(this.i0.u(object2, this) == object1) {
                    break;
                }
            }
            return object1;
        }
        catch(Throwable throwable0) {
            v0.e.c(c0);
            throw throwable0;
        }
    label_30:
        v0.e.c(c0);
        return t.a;
    }
}

