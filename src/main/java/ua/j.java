package ua;

import Ab.t;
import Eb.a;
import W5.f;
import Y8.N;
import Y8.O;
import Y8.R9;
import Y8.T;
import ac.B0;
import com.sendwave.models.CurrencyAmount;
import com.sendwave.util.UNIT;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import ra.h;
import ra.t0;

public final class j extends Fb.j implements Function2 {
    public int c0;
    public Object d0;
    public final k e0;

    public j(k k0, g g0) {
        this.e0 = k0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((j)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new j(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        B0 b03;
        B0 b02;
        h h2;
        B0 b01;
        Object object6;
        ua.h h1;
        B0 b00;
        Object object1 = a.X;
        Object object2 = t.a;
        k k0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                R9 r90 = (R9)this.d0;
                ua.h h0 = (ua.h)k0.b0.getValue();
                try {
                    CurrencyAmount currencyAmount0 = h0.d;
                    N.l(currencyAmount0, r90.a);
                    String s = Aa.a.a(currencyAmount0);
                    b00 = k0.b0;
                    if(s == null) {
                        do {
                            Object object3 = b00.getValue();
                        }
                        while(!b00.j(object3, ua.h.a(((ua.h)object3), true, null, null, null, 30)));
                        this.d0 = h0;
                        this.c0 = 1;
                        if(((t0)k0.Z).h(currencyAmount0, this) == object1) {
                            return object1;
                        }
                        h1 = h0;
                        goto label_39;
                    }
                    while(true) {
                        Object object4 = b00.getValue();
                        if(b00.j(object4, ua.h.a(((ua.h)object4), false, null, null, s, 15))) {
                            break;
                        }
                        b00 = b00;
                    }
                }
                catch(T unused_ex) {
                    h1 = h0;
                    goto label_50;
                }
                catch(O unused_ex) {
                    h1 = h0;
                    goto label_55;
                }
                catch(Throwable throwable0) {
                    h1 = h0;
                    goto label_62;
                }
                do {
                    Object object5 = b00.getValue();
                }
                while(!b00.j(object5, ua.h.a(((ua.h)object5), false, null, null, null, 30)));
                W4.f.C(k0.Y, h0.d, null);
                return object2;
            }
            case 1: {
                h1 = (ua.h)this.d0;
                try {
                    f.b0(object0);
                label_39:
                    this.d0 = h1;
                    this.c0 = 2;
                    object6 = k0.d0.e(this);
                    if(object6 == object1) {
                        return object1;
                    }
                    goto label_47;
                }
                catch(T unused_ex) {
                    goto label_50;
                }
                catch(O unused_ex) {
                    goto label_55;
                }
                catch(Throwable throwable0) {
                    goto label_62;
                }
            }
            case 2: {
                h1 = (ua.h)this.d0;
                try {
                    try {
                        f.b0(object0);
                        object6 = object0;
                    label_47:
                        ((d)object6).Y(UNIT.X);
                        b01 = k0.b0;
                        goto label_67;
                    }
                    catch(T unused_ex) {
                    }
                    catch(O unused_ex) {
                        goto label_55;
                    }
                label_50:
                    h2 = h.Y;
                    b02 = k0.b0;
                    break;
                }
                catch(Throwable throwable0) {
                    goto label_62;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            Object object7 = b02.getValue();
        }
        while(!b02.j(object7, ua.h.a(((ua.h)object7), false, null, null, null, 30)));
        W4.f.C(k0.Y, h1.d, h2);
        return object2;
        try {
        label_55:
            h2 = h.Z;
            b03 = k0.b0;
        }
        catch(Throwable throwable0) {
            goto label_62;
        }
        do {
            Object object8 = b03.getValue();
        }
        while(!b03.j(object8, ua.h.a(((ua.h)object8), false, null, null, null, 30)));
        W4.f.C(k0.Y, h1.d, h2);
        return object2;
    label_62:
        B0 b04 = k0.b0;
        do {
            Object object9 = b04.getValue();
        }
        while(!b04.j(object9, ua.h.a(((ua.h)object9), false, null, null, null, 30)));
        W4.f.C(k0.Y, h1.d, null);
        throw throwable0;
        do {
        label_67:
            Object object10 = b01.getValue();
        }
        while(!b01.j(object10, ua.h.a(((ua.h)object10), false, null, null, null, 30)));
        W4.f.C(k0.Y, h1.d, null);
        return object2;
    }
}

