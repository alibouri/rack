package y;

import Ab.t;
import B.m0;
import C.n;
import Eb.a;
import Fb.c;
import Nb.j;
import U.V;
import W5.f;
import g0.o;
import g0.p;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import v.k;
import v.m;
import v.p0;
import v.q0;
import w.H;

public final class x1 {
    public final q0 a;
    public long b;
    public m c;
    public boolean d;
    public float e;
    public static final m f;

    static {
        x1.f = new m(0.0f);
    }

    public x1(k k0) {
        this.a = k0.a(p0.a);
        this.b = 0x8000000000000000L;
        this.c = x1.f;
    }

    public final Object a(m0 m00, n n0, c c0) {
        Function0 function02;
        x1 x12;
        Function0 function00;
        Function1 function10;
        w1 w11;
        x1 x10;
        float f1;
        w1 w10;
        if(c0 instanceof w1) {
            w10 = (w1)c0;
            int v = w10.h0;
            if((v & 0x80000000) == 0) {
                w10 = new w1(this, c0);
            }
            else {
                w10.h0 = v ^ 0x80000000;
            }
        }
        else {
            w10 = new w1(this, c0);
        }
        Object object0 = w10.f0;
        Object object1 = a.X;
        m m0 = x1.f;
        switch(w10.h0) {
            case 0: {
                f.b0(object0);
                if(this.d) {
                    throw new IllegalStateException("animateToZero called while previous animation is running");
                }
                j.c(w10.Y);
                p p0 = (p)w10.Y.l(o.X);
                float f = p0 == null ? 1.0f : p0.O();
                this.d = true;
                f1 = f;
                x10 = this;
                w11 = w10;
                function10 = m00;
                function00 = n0;
                goto label_43;
            }
            case 1: {
                float f2 = w10.e0;
                Function0 function01 = w10.d0;
                Function1 function11 = (Function1)w10.c0;
                x1 x11 = w10.b0;
                try {
                    f.b0(object0);
                    function10 = function11;
                    f1 = f2;
                    x10 = x11;
                    w11 = w10;
                    function00 = function01;
                }
                catch(Throwable throwable0) {
                    x12 = x11;
                    x12.b = 0x8000000000000000L;
                    x12.c = m0;
                    x12.d = false;
                    throw throwable0;
                }
                try {
                    while(true) {
                        function00.invoke();
                        if(f1 == 0.0f) {
                            break;
                        }
                    label_43:
                        if(Math.abs(x10.e) < 0.01f) {
                            break;
                        }
                        I.c c1 = new I.c(x10, f1, function10);
                        w11.b0 = x10;
                        w11.c0 = function10;
                        w11.d0 = function00;
                        w11.e0 = f1;
                        w11.h0 = 1;
                        j.c(w11.Y);
                        if(V.a(w11.Y).v(c1, w11) != object1) {
                            continue;
                        }
                        return object1;
                    }
                    x12 = x10;
                }
                catch(Throwable throwable0) {
                    x12 = x10;
                    x12.b = 0x8000000000000000L;
                    x12.c = m0;
                    x12.d = false;
                    throw throwable0;
                }
                try {
                    if(Math.abs(x12.e) != 0.0f) {
                        H h0 = new H(x12, 5, function10);
                        w11.b0 = x12;
                        w11.c0 = function00;
                        w11.d0 = null;
                        w11.h0 = 2;
                        j.c(w11.Y);
                        if(V.a(w11.Y).v(h0, w11) == object1) {
                            return object1;
                        }
                        function02 = function00;
                        goto label_72;
                    }
                    x12.b = 0x8000000000000000L;
                    x12.c = m0;
                    x12.d = false;
                    return t.a;
                }
                catch(Throwable throwable0) {
                    x12.b = 0x8000000000000000L;
                    x12.c = m0;
                    x12.d = false;
                    throw throwable0;
                }
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        function02 = (Function0)w10.c0;
        x12 = w10.b0;
        try {
            f.b0(object0);
        label_72:
            function02.invoke();
            x12.b = 0x8000000000000000L;
            x12.c = m0;
            x12.d = false;
            return t.a;
        }
        catch(Throwable throwable0) {
        }
        x12.b = 0x8000000000000000L;
        x12.c = m0;
        x12.d = false;
        throw throwable0;
    }
}

