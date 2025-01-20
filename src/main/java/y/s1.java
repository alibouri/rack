package y;

import Ab.t;
import Eb.a;
import Fb.i;
import Nb.w;
import W5.f;
import Xb.G;
import Xb.J;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import m0.b;
import z0.h;
import z0.n;
import z0.x;

public final class s1 extends i implements Function2 {
    public Object Z;
    public Object b0;
    public w c0;
    public long d0;
    public int e0;
    public Object f0;
    public final G g0;
    public final Function3 h0;
    public final Function1 i0;
    public final Function1 j0;
    public final Function1 k0;
    public final t0 l0;

    public s1(G g0, Function3 function30, Function1 function10, Function1 function11, Function1 function12, t0 t00, g g1) {
        this.g0 = g0;
        this.h0 = function30;
        this.i0 = function10;
        this.j0 = function11;
        this.k0 = function12;
        this.l0 = t00;
        super(g1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((s1)this.t(((x)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        s1 s10 = new s1(this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, g0);
        s10.f0 = object0;
        return s10;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Function1 function13;
        Function1 function12;
        G g1;
        x x0;
        w w0;
        n n0;
        long v1;
        w w4;
        x x5;
        Object object6;
        x x4;
        w w2;
        n n2;
        x x3;
        Object object3;
        w w1;
        long v;
        n n1;
        x x2;
        Object object2;
        x x1;
        Object object1 = a.X;
        t0 t00 = this.l0;
        G g0 = this.g0;
        Function3 function30 = this.h0;
        Function1 function10 = this.k0;
        Function1 function11 = this.i0;
        switch(this.e0) {
            case 0: {
                f.b0(object0);
                x1 = (x)this.f0;
                this.f0 = x1;
                this.e0 = 1;
                object2 = v1.c(x1, this, 3);
                if(object2 == object1) {
                    return object1;
                }
                x2 = x1;
                goto label_30;
            }
            case 1: {
                x1 = (x)this.f0;
                f.b0(object0);
                object2 = object0;
                x2 = x1;
            label_30:
                n1 = (n)object2;
                n1.a();
                J.q(g0, null, null, new h1(t00, null), 3);
                if(function30 != v1.a) {
                    J.q(g0, null, null, new i1(function30, t00, n1, null), 3);
                }
                v = function11 == null ? 0x3FFFFFFFFFFFFFFFL : x2.f().c();
                w1 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                try {
                    j1 j10 = new j1(null);  // initializer: LFb/i;-><init>(Lkotlin/coroutines/g;)V
                    this.f0 = x2;
                    this.Z = n1;
                    this.b0 = w1;
                    this.c0 = w1;
                    this.d0 = v;
                    this.e0 = 2;
                    object3 = x2.g(v, j10, this);
                    if(object3 == object1) {
                        return object1;
                    }
                }
                catch(h unused_ex) {
                    x4 = x2;
                    goto label_76;
                }
                x3 = x2;
                n2 = n1;
                w2 = w1;
                goto label_65;
            }
            case 2: {
                v = this.d0;
                w1 = this.c0;
                w w3 = (w)this.b0;
                n1 = (n)this.Z;
                x2 = (x)this.f0;
                try {
                    f.b0(object0);
                    x3 = x2;
                    n2 = n1;
                    w2 = w3;
                    object3 = object0;
                    goto label_65;
                }
                catch(h unused_ex) {
                    w1 = w3;
                }
                x4 = x2;
                goto label_76;
                try {
                label_65:
                    w1.X = object3;
                    Object object4 = w2.X;
                    if(object4 == null) {
                        J.q(g0, null, null, new k1(t00, null), 3);
                    }
                    else {
                        ((n)object4).a();
                        J.q(g0, null, null, new l1(t00, null), 3);
                    }
                    goto label_93;
                }
                catch(h unused_ex) {
                    w1 = w2;
                    n1 = n2;
                    x4 = x3;
                }
            label_76:
                if(function11 != null) {
                    function11.n(new b(n1.c));
                }
                this.f0 = x4;
                this.Z = w1;
                this.b0 = null;
                this.c0 = null;
                this.d0 = v;
                this.e0 = 3;
                if(v1.a(x4, this) == object1) {
                    return object1;
                }
                goto label_90;
            }
            case 3: {
                v = this.d0;
                w1 = (w)this.Z;
                x4 = (x)this.f0;
                f.b0(object0);
            label_90:
                J.q(g0, null, null, new m1(t00, null), 3);
                w2 = w1;
                x3 = x4;
            label_93:
                Object object5 = w2.X;
                if(object5 != null) {
                    if(this.j0 != null) {
                        this.f0 = x3;
                        this.Z = w2;
                        this.b0 = null;
                        this.c0 = null;
                        this.d0 = v;
                        this.e0 = 4;
                        object6 = x3.h(x3.f().b(), new Y0(((n)object5), null), this);
                        if(object6 == object1) {
                            return object1;
                        }
                        x5 = x3;
                        w4 = w2;
                        v1 = v;
                        goto label_120;
                    }
                    else if(function10 != null) {
                        function10.n(new b(((n)object5).c));
                        return t.a;
                    }
                }
                break;
            }
            case 4: {
                long v2 = this.d0;
                w w5 = (w)this.Z;
                x x6 = (x)this.f0;
                f.b0(object0);
                w4 = w5;
                x5 = x6;
                object6 = object0;
                v1 = v2;
            label_120:
                n0 = (n)object6;
                if(n0 != null) {
                    J.q(g0, null, null, new n1(t00, null), 3);
                    if(function30 != v1.a) {
                        J.q(g0, null, null, new o1(function30, t00, n0, null), 3);
                    }
                    try {
                        function12 = function10;
                        function13 = function11;
                        g1 = g0;
                        new r1(this.g0, this.j0, this.k0, w4, t00, null);
                        this.f0 = x5;
                        this.Z = w4;
                        this.b0 = n0;
                        this.e0 = 5;
                        if(x5.g(v1, null, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    catch(h unused_ex) {
                        w0 = w4;
                        x0 = x5;
                    }
                label_140:
                    if(function12 != null) {
                        function12.n(new b(((n)w0.X).c));
                    }
                    if(function13 != null) {
                        function13.n(new b(n0.c));
                    }
                    this.f0 = null;
                    this.Z = null;
                    this.b0 = null;
                    this.e0 = 6;
                    if(v1.a(x0, this) == object1) {
                        return object1;
                    }
                    J.q(g1, null, null, new g1(t00, null), 3);
                    return t.a;
                }
                else if(function10 != null) {
                    function10.n(new b(((n)w4.X).c));
                    return t.a;
                }
                break;
            }
            case 5: {
                n0 = (n)this.b0;
                w0 = (w)this.Z;
                x0 = (x)this.f0;
                try {
                    f.b0(object0);
                    return t.a;
                }
                catch(h unused_ex) {
                    g1 = g0;
                    function12 = function10;
                    function13 = function11;
                    goto label_140;
                }
            }
            case 6: {
                f.b0(object0);
                J.q(g0, null, null, new g1(t00, null), 3);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return t.a;
    }
}

