package v;

import Ab.t;
import Eb.a;
import Fb.c;
import Fb.j;
import M.Q;
import Nb.w;
import U.U;
import U.V;
import W5.f;
import aa.e;
import g0.o;
import g0.p;
import java.util.concurrent.CancellationException;
import k2.b1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public abstract class b0 {
    public static final Object a(float f, float f1, float f2, k k0, Function2 function20, j j0) {
        o0 o00 = p0.a;
        Float float0 = new Float(f);
        Float float1 = new Float(f1);
        a0 a00 = a0.f0;
        q q0 = (q)a00.n(new Float(f2));
        if(q0 == null) {
            q0 = ((q)a00.n(float0)).c();
        }
        c0 c00 = new c0(k0, o00, float0, float1, q0);
        Object object0 = b0.b(new l(o00, float0, q0, 56), c00, 0x8000000000000000L, new b1(function20, 1), j0);
        a a0 = a.X;
        Object object1 = t.a;
        if(object0 != a0) {
            object0 = object1;
        }
        return object0 == a0 ? object0 : object1;
    }

    public static final Object b(l l0, g g0, long v, Function1 function10, c c0) {
        Object object6;
        g g2;
        Function1 function12;
        w w1;
        l l2;
        float f;
        v.j j0;
        Q q1;
        Object object4;
        o0 o00;
        Object object3;
        Function1 function11;
        X x0;
        l l1 = l0;
        g g1 = g0;
        if(c0 instanceof X) {
            x0 = (X)c0;
            int v1 = x0.g0;
            if((v1 & 0x80000000) == 0) {
                x0 = new X(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
            }
            else {
                x0.g0 = v1 ^ 0x80000000;
            }
        }
        else {
            x0 = new X(c0);  // initializer: LFb/c;-><init>(Lkotlin/coroutines/g;)V
        }
        Object object0 = x0.f0;
        Object object1 = a.X;
        switch(x0.g0) {
            case 0: {
                f.b0(object0);
                Object object2 = g1.c(0L);
                q q0 = g1.g(0L);
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                CoroutineContext coroutineContext0 = x0.Y;
                try {
                    if(Long.compare(v, 0x8000000000000000L) == 0) {
                        Nb.j.c(coroutineContext0);
                        Y y0 = new Y(w0, object2, g0, q0, l0, b0.g(coroutineContext0), function10);
                        x0.b0 = l1;
                        x0.c0 = g1;
                        function11 = function10;
                        x0.d0 = function11;
                        x0.e0 = w0;
                        x0.g0 = 1;
                        if(g0.b()) {
                            object3 = F.a(y0, x0);
                        }
                        else {
                            U u0 = new U(2, y0);
                            object3 = V.a(x0.a()).v(u0, x0);
                        }
                        if(object3 == object1) {
                            return object1;
                        }
                    }
                    else {
                        function11 = function10;
                        o00 = g0.e();
                        object4 = g0.f();
                        q1 = new Q(l1, 2);
                        goto label_40;
                    }
                    l2 = l1;
                    w1 = w0;
                    goto label_68;
                }
                catch(CancellationException cancellationException0) {
                    w1 = w0;
                    goto label_88;
                }
                try {
                label_40:
                    j0 = new v.j(object2, o00, q0, v, object4, v, q1);
                    Nb.j.c(coroutineContext0);
                    f = b0.g(coroutineContext0);
                    w0 = w0;
                }
                catch(CancellationException cancellationException0) {
                    w0 = w0;
                    w1 = w0;
                    goto label_88;
                }
                try {
                    b0.f(j0, v, f, g0, l0, function10);
                    w0.X = j0;
                    l2 = l1;
                    w1 = w0;
                    goto label_68;
                }
                catch(CancellationException cancellationException0) {
                }
                w1 = w0;
                goto label_88;
            }
            case 1: {
                w1 = x0.e0;
                function12 = x0.d0;
                g2 = x0.c0;
                l2 = x0.b0;
                goto label_65;
            }
            case 2: {
                w1 = x0.e0;
                function12 = x0.d0;
                g2 = x0.c0;
                l2 = x0.b0;
                try {
                label_65:
                    f.b0(object0);
                    function11 = function12;
                    g1 = g2;
                    do {
                    label_68:
                        Object object5 = w1.X;
                        Nb.j.c(object5);
                        if(!((Boolean)((v.j)object5).i.getValue()).booleanValue()) {
                            return t.a;
                        }
                        Nb.j.c(x0.Y);
                        Z z0 = new Z(w1, b0.g(x0.Y), g1, l2, function11);
                        x0.b0 = l2;
                        x0.c0 = g1;
                        x0.d0 = function11;
                        x0.e0 = w1;
                        x0.g0 = 2;
                        if(g1.b()) {
                            object6 = F.a(z0, x0);
                        }
                        else {
                            U u1 = new U(2, z0);
                            object6 = V.a(x0.a()).v(u1, x0);
                        }
                    }
                    while(object6 != object1);
                    return object1;
                }
                catch(CancellationException cancellationException0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        l1 = l2;
    label_88:
        v.j j1 = (v.j)w1.X;
        if(j1 != null) {
            j1.i.setValue(Boolean.FALSE);
        }
        v.j j2 = (v.j)w1.X;
        if(j2 != null && j2.g == l1.b0) {
            l1.d0 = false;
        }
        throw cancellationException0;
    }

    public static Object c(float f, float f1, n0 n00, Function2 function20, j j0, int v) {
        if((v & 8) != 0) {
            n00 = v.c.i(0.0f, 7, null);
        }
        return b0.a(f, f1, 0.0f, n00, function20, j0);
    }

    public static Object d(l l0, v.w w0, Function1 function10, c c0) {
        Object object0 = l0.Y.getValue();
        Object object1 = b0.b(l0, new v(w0, l0.X, object0, l0.Z), 0x8000000000000000L, function10, c0);
        return object1 != a.X ? t.a : object1;
    }

    public static Object e(l l0, Float float0, k k0, boolean z, e e0, c c0, int v) {
        a0 a00 = (v & 8) == 0 ? e0 : a0.Y;
        Object object0 = l0.Y.getValue();
        Object object1 = b0.b(l0, new c0(k0, l0.X, object0, float0, l0.Z), (((v & 4) == 0 ? z : false) ? l0.b0 : 0x8000000000000000L), a00, c0);
        return object1 != a.X ? t.a : object1;
    }

    public static final void f(v.j j0, long v, float f, g g0, l l0, Function1 function10) {
        long v1 = f == 0.0f ? g0.d() : ((long)(((float)(v - j0.c)) / f));
        j0.g = v;
        Object object0 = g0.c(v1);
        j0.e.setValue(object0);
        j0.f = g0.g(v1);
        if(g0.h(v1)) {
            j0.h = j0.g;
            j0.i.setValue(Boolean.FALSE);
        }
        b0.h(j0, l0);
        function10.n(j0);
    }

    public static final float g(CoroutineContext coroutineContext0) {
        p p0 = (p)coroutineContext0.l(o.X);
        float f = p0 == null ? 1.0f : p0.O();
        if(f < 0.0f) {
            throw new IllegalStateException("negative scale factor");
        }
        return f;
    }

    public static final void h(v.j j0, l l0) {
        Object object0 = j0.e.getValue();
        l0.Y.setValue(object0);
        q q0 = l0.Z;
        q q1 = j0.f;
        int v = q0.b();
        for(int v1 = 0; v1 < v; ++v1) {
            q0.e(v1, q1.a(v1));
        }
        l0.c0 = j0.h;
        l0.b0 = j0.g;
        l0.d0 = ((Boolean)j0.i.getValue()).booleanValue();
    }
}

