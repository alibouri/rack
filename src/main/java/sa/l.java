package sa;

import Ab.t;
import Eb.a;
import Fb.j;
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

public final class l extends j implements Function2 {
    public int c0;
    public Object d0;
    public final m e0;

    public l(m m0, g g0) {
        this.e0 = m0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((l)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new l(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        B0 b03;
        B0 b02;
        h h0;
        B0 b01;
        Object object6;
        i i1;
        B0 b00;
        Object object1 = a.X;
        Object object2 = t.a;
        m m0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                R9 r90 = (R9)this.d0;
                i i0 = (i)m0.b0.getValue();
                try {
                    CurrencyAmount currencyAmount0 = i0.e;
                    N.l(currencyAmount0, r90.a);
                    String s = Aa.a.a(currencyAmount0);
                    b00 = m0.b0;
                    if(s == null) {
                        do {
                            Object object3 = b00.getValue();
                        }
                        while(!b00.j(object3, i.a(((i)object3), true, null, null, null, null, null, 62)));
                        this.d0 = i0;
                        this.c0 = 1;
                        if(((t0)m0.Z).g(currencyAmount0, this) == object1) {
                            return object1;
                        }
                        i1 = i0;
                        goto label_39;
                    }
                    while(true) {
                        Object object4 = b00.getValue();
                        if(b00.j(object4, i.a(((i)object4), false, null, null, null, null, s, 0x1F))) {
                            break;
                        }
                        b00 = b00;
                    }
                }
                catch(T unused_ex) {
                    i1 = i0;
                    goto label_50;
                }
                catch(O unused_ex) {
                    i1 = i0;
                    goto label_55;
                }
                catch(Throwable throwable0) {
                    i1 = i0;
                    goto label_62;
                }
                do {
                    Object object5 = b00.getValue();
                }
                while(!b00.j(object5, i.a(((i)object5), false, null, null, null, null, null, 62)));
                W4.f.B(m0.Y, i0.e, null);
                return object2;
            }
            case 1: {
                i1 = (i)this.d0;
                try {
                    f.b0(object0);
                label_39:
                    this.d0 = i1;
                    this.c0 = 2;
                    object6 = m0.d0.e(this);
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
                i1 = (i)this.d0;
                try {
                    try {
                        f.b0(object0);
                        object6 = object0;
                    label_47:
                        ((d)object6).Y(UNIT.X);
                        b01 = m0.b0;
                        goto label_67;
                    }
                    catch(T unused_ex) {
                    }
                    catch(O unused_ex) {
                        goto label_55;
                    }
                label_50:
                    h0 = h.Y;
                    b02 = m0.b0;
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
        while(!b02.j(object7, i.a(((i)object7), false, null, null, null, null, null, 62)));
        W4.f.B(m0.Y, i1.e, h0);
        return object2;
        try {
        label_55:
            h0 = h.Z;
            b03 = m0.b0;
        }
        catch(Throwable throwable0) {
            goto label_62;
        }
        do {
            Object object8 = b03.getValue();
        }
        while(!b03.j(object8, i.a(((i)object8), false, null, null, null, null, null, 62)));
        W4.f.B(m0.Y, i1.e, h0);
        return object2;
    label_62:
        B0 b04 = m0.b0;
        do {
            Object object9 = b04.getValue();
        }
        while(!b04.j(object9, i.a(((i)object9), false, null, null, null, null, null, 62)));
        W4.f.B(m0.Y, i1.e, null);
        throw throwable0;
        do {
        label_67:
            Object object10 = b01.getValue();
        }
        while(!b01.j(object10, i.a(((i)object10), false, null, null, null, null, null, 62)));
        W4.f.B(m0.Y, i1.e, null);
        return object2;
    }
}

