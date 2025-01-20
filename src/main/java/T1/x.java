package T1;

import Fb.c;
import Nb.j;
import Nb.s;
import Nb.w;
import W5.f;
import hc.a;
import hc.d;
import kotlin.jvm.functions.Function2;

public final class x {
    public final a a;
    public final s b;
    public final w c;
    public final F d;

    public x(a a0, s s0, w w0, F f0) {
        this.a = a0;
        this.b = s0;
        this.c = w0;
        this.d = f0;
    }

    public final Object a(g g0, c c0) {
        Object object4;
        F f2;
        a a3;
        a a2;
        Object object2;
        w w2;
        s s1;
        a a0;
        F f0;
        T1.w w0;
        if(c0 instanceof T1.w) {
            w0 = (T1.w)c0;
            int v = w0.i0;
            if((v & 0x80000000) == 0) {
                w0 = new T1.w(this, c0);
            }
            else {
                w0.i0 = v ^ 0x80000000;
            }
        }
        else {
            w0 = new T1.w(this, c0);
        }
        Object object0 = w0.g0;
        Object object1 = Eb.a.X;
        switch(w0.i0) {
            case 0: {
                f.b0(object0);
                w0.b0 = g0;
                w0.c0 = this.a;
                s s0 = this.b;
                w0.d0 = s0;
                w w1 = this.c;
                w0.e0 = w1;
                f0 = this.d;
                w0.f0 = f0;
                w0.i0 = 1;
                a0 = (d)this.a;
                if(((d)a0).d(null, w0) == object1) {
                    return object1;
                }
                s1 = s0;
                w2 = w1;
                goto label_38;
            }
            case 1: {
                F f1 = w0.f0;
                w2 = w0.e0;
                s1 = (s)w0.d0;
                a a1 = (a)w0.c0;
                Function2 function20 = (Function2)w0.b0;
                f.b0(object0);
                a0 = a1;
                f0 = f1;
                g0 = function20;
                try {
                label_38:
                    if(s1.X) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    w0.b0 = a0;
                    w0.c0 = w2;
                    w0.d0 = f0;
                    w0.e0 = null;
                    w0.f0 = null;
                    w0.i0 = 2;
                    object2 = g0.j(w2.X, w0);
                }
                catch(Throwable throwable0) {
                    a2 = a0;
                    break;
                }
                if(object2 == object1) {
                    return object1;
                }
                a3 = a0;
                object0 = object2;
                f2 = f0;
                goto label_61;
            }
            case 2: {
                f2 = (F)w0.d0;
                w2 = (w)w0.c0;
                a3 = (a)w0.b0;
                try {
                    f.b0(object0);
                label_61:
                    if(j.a(object0, w2.X)) {
                        a2 = a3;
                        object4 = w2.X;
                        goto label_89;
                    }
                    else {
                        w0.b0 = a3;
                        w0.c0 = w2;
                        w0.d0 = object0;
                        w0.i0 = 3;
                        if(f2.k(object0, w0) == object1) {
                            return object1;
                        }
                        goto label_72;
                    }
                    object4 = w2.X;
                    goto label_89;
                }
                catch(Throwable throwable0) {
                    a2 = a3;
                    break;
                }
                return object1;
                try {
                label_72:
                    a2 = a3;
                    w2.X = object0;
                    w2 = w2;
                    object4 = w2.X;
                    goto label_89;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 3: {
                Object object3 = w0.d0;
                w w3 = (w)w0.c0;
                a2 = (a)w0.b0;
                try {
                    f.b0(object0);
                    w3.X = object3;
                    w2 = w3;
                    object4 = w2.X;
                    goto label_89;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((d)a2).f(null);
        throw throwable0;
    label_89:
        ((d)a2).f(null);
        return object4;
    }
}

