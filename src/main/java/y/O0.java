package y;

import Ab.t;
import Eb.a;
import Fb.i;
import W5.f;
import Xb.J;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import z0.x;

public final class o0 extends i implements Function2 {
    public int Z;
    public Object b0;
    public final CoroutineContext c0;
    public final i d0;

    public o0(CoroutineContext coroutineContext0, Function2 function20, g g0) {
        this.c0 = coroutineContext0;
        this.d0 = (i)function20;
        super(g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((o0)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new o0(this.c0, ((Function2)this.d0), g0);
        g1.b0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        x x1;
        x x0;
        Object object1 = a.X;
        CoroutineContext coroutineContext0 = this.c0;
        switch(this.Z) {
            case 0: {
                f.b0(object0);
                x0 = (x)this.b0;
                goto label_16;
            }
            case 1: {
                x1 = (x)this.b0;
                try {
                    f.b0(object0);
                    goto label_27;
                }
                catch(CancellationException cancellationException0) {
                    goto label_32;
                }
            }
            case 2: {
                x1 = (x)this.b0;
                try {
                    f.b0(object0);
                    break;
                }
                catch(CancellationException cancellationException0) {
                    goto label_32;
                }
            }
            case 3: {
                x1 = (x)this.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            while(true) {
                x0 = x1;
            label_16:
                if(!J.o(coroutineContext0)) {
                    return t.a;
                }
                try {
                    this.b0 = x0;
                    this.Z = 1;
                    if(((Function2)this.d0).j(x0, this) == object1) {
                        return object1;
                    }
                }
                catch(CancellationException cancellationException1) {
                    x1 = x0;
                    cancellationException0 = cancellationException1;
                    break;
                }
                x1 = x0;
                try {
                label_27:
                    this.b0 = x1;
                    this.Z = 2;
                    if(io.sentry.config.a.s(x1, this) != object1) {
                        continue;
                    }
                    return object1;
                }
                catch(CancellationException cancellationException0) {
                }
                break;
            }
        label_32:
            if(!J.o(coroutineContext0)) {
                throw cancellationException0;
            }
            this.b0 = x1;
            this.Z = 3;
        }
        while(io.sentry.config.a.s(x1, this) != object1);
        return object1;
    }
}

