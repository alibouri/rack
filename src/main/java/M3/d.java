package m3;

import Ab.t;
import Eb.a;
import Fb.c;
import N4.j;
import Nb.w;
import W5.f;
import Xb.k;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;

public abstract class d {
    public static final Object a(Lifecycle lifecycle0, c c0) {
        Throwable throwable1;
        w w1;
        Lifecycle lifecycle1;
        b b0;
        if(c0 instanceof b) {
            b0 = (b)c0;
            int v = b0.e0;
            if((v & 0x80000000) == 0) {
                b0 = new b(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                b0.e0 = v ^ 0x80000000;
            }
        }
        else {
            b0 = new b(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = b0.d0;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(b0.e0) {
            case 0: {
                f.b0(object0);
                if(lifecycle0.b().a(State.b0)) {
                    return object2;
                }
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                try {
                    b0.b0 = lifecycle0;
                    b0.c0 = w0;
                    b0.e0 = 1;
                    k k0 = new k(1, j.w(b0));
                    k0.v();
                    m3.c c1 = new m3.c(0, k0);
                    w0.X = c1;
                    lifecycle0.a(c1);
                    if(k0.u() == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable0) {
                    lifecycle1 = lifecycle0;
                    w1 = w0;
                    throwable1 = throwable0;
                    goto label_42;
                }
                lifecycle1 = lifecycle0;
                w1 = w0;
                break;
            }
            case 1: {
                try {
                    w1 = b0.c0;
                    lifecycle1 = b0.b0;
                    f.b0(object0);
                    break;
                }
                catch(Throwable throwable1) {
                }
            label_42:
                LifecycleObserver lifecycleObserver0 = (LifecycleObserver)w1.X;
                if(lifecycleObserver0 != null) {
                    lifecycle1.c(lifecycleObserver0);
                }
                throw throwable1;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        LifecycleObserver lifecycleObserver1 = (LifecycleObserver)w1.X;
        if(lifecycleObserver1 != null) {
            lifecycle1.c(lifecycleObserver1);
        }
        return object2;
    }
}

