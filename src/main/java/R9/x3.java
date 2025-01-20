package R9;

import Ab.t;
import Eb.a;
import Fb.j;
import V8.d;
import W5.f;
import Y8.E8;
import Y8.F8;
import Y8.G6;
import Y8.H8;
import Y8.N;
import Y8.R9;
import Y8.S6;
import Y8.U3;
import Y8.X;
import Y8.y6;
import ac.B0;
import ac.h0;
import androidx.lifecycle.Lifecycle.State;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.type.UserInterface.SMARTPHONE_APP;
import com.wave.customer.AskedToRecoverPin;
import com.wave.customer.VerifyPinToken;
import d9.R0;
import hd.c;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class x3 extends j implements Function2 {
    public Object c0;
    public Object d0;
    public int e0;
    public final y3 f0;
    public final String g0;
    public final h0 h0;

    public x3(y3 y30, String s, h0 h00, g g0) {
        this.f0 = y30;
        this.g0 = s;
        this.h0 = h00;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((x3)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new x3(this.f0, this.g0, this.h0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object12;
        Object object11;
        F8 f81;
        Object object10;
        FragmentHandle fragmentHandle0;
        Object object9;
        Object object8;
        y6 y60;
        h0 h01;
        AtomicInteger atomicInteger1;
        Object object5;
        B0 b00;
        AtomicInteger atomicInteger0;
        Object object1 = a.X;
        Object object2 = t.a;
        String s = this.g0;
        y3 y30 = this.f0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                c.a.n("VerifyPinViewModel");
                c.a.a("Got a PIN and we\'re about to submit it", new Object[0]);
                String s1 = y30.b0.X;
                V8.a a0 = y30.g0.Y;
                if(a0 != null) {
                    a0.a.a().b().a(State.b0);
                    R0 r00 = a0.b.D();
                    H8 h80 = new H8(s1, S6.a(s), null, r00, SMARTPHONE_APP.X, 9);
                    try {
                        h0 h00 = this.h0;
                        Map map0 = N.a;
                        Object object3 = map0.get(h00);
                        if(object3 == null) {
                            object3 = new AtomicInteger(0);
                            map0.put(h00, object3);
                        }
                        atomicInteger0 = (AtomicInteger)object3;
                        while(true) {
                            b00 = (B0)h00;
                            Object object4 = b00.getValue();
                            ((Boolean)object4).getClass();
                            if(b00.j(object4, Boolean.valueOf(atomicInteger0.incrementAndGet() > 0))) {
                                break;
                            }
                        }
                    }
                    catch(X unused_ex) {
                        goto label_58;
                    }
                    catch(U3 unused_ex) {
                        goto label_64;
                    }
                    try {
                        this.c0 = b00;
                        this.d0 = atomicInteger0;
                        this.e0 = 1;
                        object5 = y30.Y.f(h80, G6.X, this);
                    }
                    catch(Throwable throwable0) {
                        atomicInteger1 = atomicInteger0;
                        h01 = b00;
                        goto label_50;
                    }
                    if(object5 == object1) {
                        return object1;
                    }
                    try {
                        atomicInteger1 = atomicInteger0;
                        h01 = b00;
                        y60 = (y6)object5;
                        goto label_54;
                    }
                    catch(Throwable throwable0) {
                        goto label_50;
                    }
                }
                throw new AssertionError("\'run\' called when no owner");
            }
            case 1: {
                atomicInteger1 = (AtomicInteger)this.d0;
                h01 = (h0)this.c0;
                try {
                    f.b0(object0);
                    y60 = (y6)object0;
                    goto label_54;
                }
                catch(Throwable throwable0) {
                }
                try {
                    do {
                    label_50:
                        Object object6 = ((B0)h01).getValue();
                        ((Boolean)object6).getClass();
                    }
                    while(!((B0)h01).j(object6, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
                    throw throwable0;
                    do {
                    label_54:
                        Object object7 = ((B0)h01).getValue();
                        ((Boolean)object7).getClass();
                    }
                    while(!((B0)h01).j(object7, Boolean.valueOf(atomicInteger1.decrementAndGet() > 0)));
                }
                catch(X unused_ex) {
                label_58:
                    this.c0 = null;
                    this.d0 = null;
                    this.e0 = 2;
                    object8 = y30.g0.e(this);
                    if(object8 != object1) {
                        this.e0 = 3;
                        return ((d)object8).n(this) == object1 ? object1 : object2;
                    }
                    return object1;
                }
                catch(U3 unused_ex) {
                label_64:
                    this.c0 = null;
                    this.d0 = null;
                    this.e0 = 4;
                    object9 = y30.g0.e(this);
                    if(object9 == object1) {
                        return object1;
                    }
                    goto label_88;
                }
                F8 f80 = ((E8)y60.b).a;
                Nb.j.c(f80);
                fragmentHandle0 = y60.a(f80.a.b);
                y30.Z.c(s);
                this.c0 = f80;
                this.d0 = fragmentHandle0;
                this.e0 = 7;
                object10 = y30.g0.e(this);
                if(object10 == object1) {
                    return object1;
                }
                f81 = f80;
                break;
            }
            case 2: {
                f.b0(object0);
                object8 = object0;
                this.e0 = 3;
                return ((d)object8).n(this) == object1 ? object1 : object2;
            }
            case 3: {
                f.b0(object0);
                return object2;
            }
            case 4: {
                f.b0(object0);
                object9 = object0;
            label_88:
                this.e0 = 5;
                object11 = w2.f(((d)object9), s, y30.b0.X, 0x7F1201B1, this);  // string:go_back "Go back"
                if(object11 == object1) {
                    return object1;
                }
                goto label_94;
            }
            case 5: {
                f.b0(object0);
                object11 = object0;
            label_94:
                if(((Boolean)object11).booleanValue()) {
                    y30.j0.a();
                    return object2;
                }
                this.e0 = 6;
                object12 = y30.g0.e(this);
                if(object12 == object1) {
                    return object1;
                }
                ((d)object12).Y(new AskedToRecoverPin(s));
                return object2;
            }
            case 6: {
                f.b0(object0);
                object12 = object0;
                ((d)object12).Y(new AskedToRecoverPin(s));
                return object2;
            }
            case 7: {
                fragmentHandle0 = (FragmentHandle)this.d0;
                f81 = (F8)this.c0;
                f.b0(object0);
                object10 = object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((d)object10).Y(new VerifyPinToken(fragmentHandle0, f81.b));
        return object2;
    }
}

