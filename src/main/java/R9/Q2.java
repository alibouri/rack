package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.G6;
import Y8.N;
import Y8.R6;
import Y8.R9;
import Y8.T6;
import Y8.W6;
import Y8.y6;
import ac.B0;
import ac.h0;
import androidx.lifecycle.Lifecycle.State;
import com.sendwave.backend.FragmentHandle;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class q2 extends j implements Function2 {
    public B0 c0;
    public AtomicInteger d0;
    public int e0;
    public final Y f0;
    public final String g0;
    public final u2 h0;
    public final h0 i0;

    public q2(Y y0, String s, u2 u20, h0 h00, g g0) {
        this.f0 = y0;
        this.g0 = s;
        this.h0 = u20;
        this.i0 = h00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((q2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new q2(this.f0, this.g0, this.h0, this.i0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object3;
        B0 b01;
        B0 b00;
        AtomicInteger atomicInteger0;
        Object object4;
        Object object5;
        y6 y60;
        Object object1 = a.X;
        Object object2 = t.a;
        Y y0 = this.f0;
        String s = this.g0;
        u2 u20 = this.h0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                if(!Nb.j.a(y0.b, s)) {
                    this.e0 = 1;
                    object5 = u20.d0.e(this);
                    if(object5 == object1) {
                        return object1;
                    }
                label_29:
                    String s1 = r1.d(0x7F120157, new Object[0]);  // string:error "Error"
                    String s2 = r1.d(0x7F120346, new Object[0]);  // string:pin_wrong_confirmation "The entered secret codes do not match, please try 
                                                                  // again."
                    String s3 = r1.d(0x7F120381, new Object[0]);  // string:retry "Retry"
                    this.e0 = 2;
                    if(Pb.a.O(((d)object5), s1, s2, s3, null, false, null, null, this, 504) == object1) {
                        return object1;
                    }
                label_35:
                    this.e0 = 3;
                    object4 = u20.d0.e(this);
                    if(object4 == object1) {
                        return object1;
                    }
                    ((d)object4).g0();
                    return object2;
                }
                Map map0 = N.a;
                h0 h00 = this.i0;
                Object object6 = map0.get(h00);
                if(object6 == null) {
                    object6 = new AtomicInteger(0);
                    map0.put(h00, object6);
                }
                atomicInteger0 = (AtomicInteger)object6;
                do {
                    b01 = (B0)h00;
                    Object object7 = b01.getValue();
                    ((Boolean)object7).getClass();
                }
                while(!b01.j(object7, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                try {
                    R6 r60 = u20.Y;
                    String s4 = u20.Z.X;
                    V8.a a0 = u20.d0.Y;
                    if(a0 == null) {
                        throw new AssertionError("\'run\' called when no owner");
                    }
                    a0.a.a().b().a(State.b0);
                    W6 w60 = new W6(s4, s, a0.b.D());
                    this.c0 = b01;
                    this.d0 = atomicInteger0;
                    this.e0 = 4;
                    object3 = r60.f(w60, G6.X, this);
                    if(object3 == object1) {
                        return object1;
                    }
                    y60 = (y6)object3;
                    goto label_73;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            case 1: {
                f.b0(object0);
                object5 = object0;
                goto label_29;
            }
            case 2: {
                f.b0(object0);
                goto label_35;
            }
            case 3: {
                f.b0(object0);
                object4 = object0;
                ((d)object4).g0();
                return object2;
            }
            case 4: {
                try {
                    atomicInteger0 = this.d0;
                    b00 = this.c0;
                    f.b0(object0);
                    b01 = b00;
                    object3 = object0;
                    y60 = (y6)object3;
                    goto label_73;
                }
                catch(Throwable throwable0) {
                    goto label_69;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        b00 = b01;
        do {
        label_69:
            Object object8 = b00.getValue();
            ((Boolean)object8).getClass();
        }
        while(!b00.j(object8, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        throw throwable0;
        do {
        label_73:
            Object object9 = b01.getValue();
            ((Boolean)object9).getClass();
        }
        while(!b01.j(object9, Boolean.valueOf(atomicInteger0.decrementAndGet() > 0)));
        Nb.j.c(((T6)y60.b).a);
        FragmentHandle fragmentHandle0 = y60.a(((T6)y60.b).a.a.b);
        W9.a a1 = u20.c0;
        if(a1 != null) {
            a1.h(((u2)y0.d).Z.X, s, fragmentHandle0);
        }
        return object2;
    }
}

