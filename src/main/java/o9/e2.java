package o9;

import Ab.t;
import Eb.a;
import Fb.j;
import W5.f;
import Xb.Q;
import Y8.G6;
import Y8.N;
import Y8.R9;
import Y8.j7;
import ac.B0;
import ac.h0;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import m5.b;

public final class e2 extends j implements Function2 {
    public h0 c0;
    public s2 d0;
    public AtomicInteger e0;
    public boolean f0;
    public int g0;
    public final s2 h0;
    public final j7 i0;
    public final boolean j0;

    public e2(s2 s20, j7 j70, boolean z, g g0) {
        this.h0 = s20;
        this.i0 = j70;
        this.j0 = z;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new e2(this.h0, this.i0, this.j0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        s2 s22;
        AtomicInteger atomicInteger2;
        h0 h01;
        boolean z2;
        AtomicInteger atomicInteger1;
        boolean z1;
        Throwable throwable2;
        s2 s21;
        AtomicInteger atomicInteger0;
        h0 h00;
        s2 s20;
        Object object1 = a.X;
        switch(this.g0) {
            case 0: {
                f.b0(object0);
                s20 = this.h0;
                h00 = s20.m0;
                j7 j70 = this.i0;
                boolean z = this.j0;
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
                    s20.x0.l(null, o9.a.Y);
                }
                catch(Throwable throwable0) {
                    goto label_86;
                }
                try {
                    this.c0 = h00;
                    this.d0 = s20;
                    this.e0 = atomicInteger0;
                    this.f0 = z;
                    this.g0 = 1;
                    if(s20.Y.f(j70, G6.X, this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable1) {
                    s21 = s20;
                    throwable2 = throwable1;
                    z1 = z;
                    atomicInteger1 = atomicInteger0;
                    goto label_78;
                }
                z2 = z;
                h01 = h00;
                atomicInteger2 = atomicInteger0;
                goto label_51;
            }
            case 1: {
                try {
                    z2 = this.f0;
                    atomicInteger2 = this.e0;
                    s22 = this.d0;
                    h01 = this.c0;
                    f.b0(object0);
                    s20 = s22;
                }
                catch(Throwable throwable2) {
                    z1 = z2;
                    atomicInteger1 = atomicInteger2;
                    s21 = s22;
                    h00 = h01;
                    goto label_78;
                }
                try {
                label_51:
                    this.c0 = h01;
                    this.d0 = s20;
                    this.e0 = atomicInteger2;
                    this.f0 = z2;
                    this.g0 = 2;
                    if(Q.b(s20.Z.d0, this) == object1) {
                        return object1;
                    }
                }
                catch(Throwable throwable3) {
                    s21 = s20;
                    throwable2 = throwable3;
                    z1 = z2;
                    atomicInteger1 = atomicInteger2;
                    h00 = h01;
                    goto label_78;
                }
                s21 = s20;
                z1 = z2;
                atomicInteger1 = atomicInteger2;
                h00 = h01;
                goto label_81;
            }
            case 2: {
                try {
                    z1 = this.f0;
                    atomicInteger1 = this.e0;
                    s21 = this.d0;
                    h00 = this.c0;
                    f.b0(object0);
                    goto label_81;
                }
                catch(Throwable throwable2) {
                }
                try {
                label_78:
                    s21.x0.getClass();
                    s21.x0.l(null, (z1 ? o9.a.Z : o9.a.c0));
                    throw throwable2;
                label_81:
                    s21.x0.getClass();
                    s21.x0.l(null, (z1 ? o9.a.Z : o9.a.c0));
                    goto label_90;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        atomicInteger0 = atomicInteger1;
        do {
        label_86:
            Object object4 = ((B0)h00).getValue();
            ((Boolean)object4).getClass();
        }
        while(!((B0)h00).j(object4, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_90:
            Object object5 = ((B0)h00).getValue();
            ((Boolean)object5).getClass();
        }
        while(!((B0)h00).j(object5, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
        return t.a;
    }
}

