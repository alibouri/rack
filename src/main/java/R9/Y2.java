package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.N;
import Y8.R9;
import ac.B0;
import ac.h0;
import com.wave.customer.ResetPinResult;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class y2 extends j implements Function2 {
    public B0 c0;
    public AtomicInteger d0;
    public int e0;
    public final z2 f0;
    public final String g0;
    public final E2 h0;
    public final h0 i0;

    public y2(z2 z20, String s, E2 e20, h0 h00, g g0) {
        this.f0 = z20;
        this.g0 = s;
        this.h0 = e20;
        this.i0 = h00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((y2)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new y2(this.f0, this.g0, this.h0, this.i0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object10;
        Object object9;
        Object object6;
        B0 b02;
        B0 b01;
        AtomicInteger atomicInteger1;
        B0 b00;
        Object object3;
        Object object1 = a.X;
        Object object2 = t.a;
        E2 e20 = this.h0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                z2 z20 = this.f0;
                String s = this.g0;
                if(Nb.j.a(z20.c, s)) {
                    goto label_13;
                }
                this.e0 = 1;
                object3 = e20.c0.e(this);
                if(object3 == object1) {
                    return object1;
                label_13:
                    Map map0 = N.a;
                    h0 h00 = this.i0;
                    Object object4 = map0.get(h00);
                    if(object4 == null) {
                        object4 = new AtomicInteger(0);
                        map0.put(h00, object4);
                    }
                    AtomicInteger atomicInteger0 = (AtomicInteger)object4;
                    do {
                        b00 = (B0)h00;
                        Object object5 = b00.getValue();
                        ((Boolean)object5).getClass();
                    }
                    while(!b00.j(object5, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0)));
                    try {
                        this.c0 = b00;
                        this.d0 = atomicInteger0;
                        this.e0 = 4;
                        if(e20.o(z20.b, s, this) == object1) {
                            return object1;
                        }
                    }
                    catch(Throwable throwable0) {
                        atomicInteger1 = atomicInteger0;
                        b01 = b00;
                        goto label_60;
                    }
                    atomicInteger1 = atomicInteger0;
                    b02 = b00;
                    goto label_64;
                }
                goto label_39;
            }
            case 1: {
                f.b0(object0);
                object3 = object0;
            label_39:
                String s1 = r1.d(0x7F120157, new Object[0]);  // string:error "Error"
                String s2 = r1.d(0x7F120346, new Object[0]);  // string:pin_wrong_confirmation "The entered secret codes do not match, please try 
                                                              // again."
                String s3 = r1.d(0x7F120381, new Object[0]);  // string:retry "Retry"
                this.e0 = 2;
                if(Pb.a.O(((d)object3), s1, s2, s3, null, false, null, null, this, 504) == object1) {
                    return object1;
                }
                goto label_46;
            }
            case 2: {
                f.b0(object0);
            label_46:
                this.e0 = 3;
                object6 = e20.c0.e(this);
                if(object6 == object1) {
                    return object1;
                }
                ((d)object6).g0();
                return object2;
            }
            case 3: {
                f.b0(object0);
                object6 = object0;
                ((d)object6).g0();
                return object2;
            }
            case 4: {
                try {
                    atomicInteger1 = this.d0;
                    b01 = this.c0;
                    f.b0(object0);
                    b02 = b01;
                    goto label_64;
                }
                catch(Throwable throwable0) {
                }
                do {
                label_60:
                    Object object7 = b01.getValue();
                    ((Boolean)object7).getClass();
                }
                while(!b01.j(object7, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
                throw throwable0;
                do {
                label_64:
                    Object object8 = b02.getValue();
                    ((Boolean)object8).getClass();
                }
                while(!b02.j(object8, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
                this.c0 = null;
                this.d0 = null;
                this.e0 = 5;
                object9 = e20.c0.e(this);
                if(object9 == object1) {
                    return object1;
                }
                goto label_75;
            }
            case 5: {
                f.b0(object0);
                object9 = object0;
            label_75:
                String s4 = r1.d(0x7F120406, new Object[0]);  // string:success "Success!"
                String s5 = r1.d(0x7F120345, new Object[0]);  // string:pin_set_success "You\'ve successfully changed your secret code. It\'s confidential, 
                                                              // don\'t share it with anyone."
                String s6 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
                this.e0 = 6;
                if(Pb.a.O(((d)object9), s4, s5, s6, null, false, null, null, this, 504) == object1) {
                    return object1;
                }
                goto label_82;
            }
            case 6: {
                f.b0(object0);
            label_82:
                this.e0 = 7;
                object10 = e20.c0.e(this);
                if(object10 == object1) {
                    return object1;
                }
                ((d)object10).Y(ResetPinResult.Y);
                return object2;
            }
            case 7: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        f.b0(object0);
        object10 = object0;
        ((d)object10).Y(ResetPinResult.Y);
        return object2;
    }
}

