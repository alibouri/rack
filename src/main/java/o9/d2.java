package o9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.Q;
import Y8.G6;
import Y8.N;
import Y8.R9;
import Y8.Z6;
import ac.B0;
import ac.h0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;

public final class d2 extends j implements Function2 {
    public h0 c0;
    public s2 d0;
    public AtomicInteger e0;
    public int f0;
    public final s2 g0;
    public final Z6 h0;

    public d2(s2 s20, Z6 z60, g g0) {
        this.g0 = s20;
        this.h0 = z60;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((d2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new d2(this.g0, this.h0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        h0 h02;
        AtomicInteger atomicInteger2;
        s2 s21;
        AtomicInteger atomicInteger1;
        Throwable throwable3;
        Throwable throwable1;
        h0 h01;
        AtomicInteger atomicInteger0;
        h0 h00;
        s2 s20;
        Object object1 = a.X;
        switch(this.f0) {
            case 0: {
                f.b0(object0);
                s20 = this.g0;
                h00 = s20.m0;
                Z6 z60 = this.h0;
                Map map0 = N.a;
                Object object2 = map0.get(h00);
                if(object2 == null) {
                    object2 = b.E(0, map0, ((B0)h00));
                }
                atomicInteger0 = (AtomicInteger)object2;
                do {
                    Object object3 = ((B0)h00).getValue();
                    ((Boolean)object3).getClass();
                }
                while(!((B0)h00).j(object3, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                try {
                    s20.x0.getClass();
                    s20.x0.l(null, o9.a.b0);
                }
                catch(Throwable throwable0) {
                    h01 = h00;
                    throwable1 = throwable0;
                    goto label_79;
                }
                try {
                    this.c0 = h00;
                    this.d0 = s20;
                    this.e0 = atomicInteger0;
                    this.f0 = 1;
                    if(s20.Y.f(z60, G6.X, this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable2) {
                    h01 = h00;
                    throwable3 = throwable2;
                    atomicInteger1 = atomicInteger0;
                    goto label_71;
                }
                s21 = s20;
                atomicInteger2 = atomicInteger0;
                goto label_48;
            }
            case 1: {
                try {
                    atomicInteger2 = this.e0;
                    s21 = this.d0;
                    h02 = this.c0;
                    f.b0(object0);
                    h00 = h02;
                }
                catch(Throwable throwable3) {
                    atomicInteger1 = atomicInteger2;
                    s20 = s21;
                    h01 = h02;
                    goto label_71;
                }
                try {
                label_48:
                    this.c0 = h00;
                    this.d0 = s21;
                    this.e0 = atomicInteger2;
                    this.f0 = 2;
                    if(Q.b(s21.Z.e0, this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable4) {
                    h01 = h00;
                    throwable3 = throwable4;
                    atomicInteger1 = atomicInteger2;
                    s20 = s21;
                    goto label_71;
                }
                h01 = h00;
                atomicInteger1 = atomicInteger2;
                s20 = s21;
                goto label_74;
            }
            case 2: {
                try {
                    atomicInteger1 = this.e0;
                    s20 = this.d0;
                    h01 = this.c0;
                    f.b0(object0);
                    goto label_74;
                }
                catch(Throwable throwable3) {
                }
                try {
                label_71:
                    s20.x0.getClass();
                    s20.x0.l(null, o9.a.c0);
                    throw throwable3;
                label_74:
                    s20.x0.getClass();
                    s20.x0.l(null, o9.a.c0);
                    goto label_83;
                }
                catch(Throwable throwable1) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        atomicInteger0 = atomicInteger1;
        do {
        label_79:
            Object object4 = ((B0)h01).getValue();
            ((Boolean)object4).getClass();
        }
        while(!((B0)h01).j(object4, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        throw throwable1;
        do {
        label_83:
            Object object5 = ((B0)h01).getValue();
            ((Boolean)object5).getClass();
        }
        while(!((B0)h01).j(object5, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        return t.a;
    }
}

