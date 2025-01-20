package Y8;

import Ab.e;
import Ab.t;
import Bb.F;
import Bb.p;
import Bb.z;
import Fb.c;
import I2.k;
import Lc.b;
import Nb.j;
import R9.x1;
import W5.f;
import Xb.J;
import ac.B0;
import ac.h0;
import ac.o0;
import dc.o;
import hb.n;
import java.io.Serializable;
import java.util.List;
import k2.H;
import k2.N;
import k2.W;
import k2.g0;
import k2.u;
import k2.w;
import mb.a;

public final class a3 extends w {
    public final x1 c;
    public final k d;
    public final h0 e;
    public final B0 f;
    public final Object g;
    public final V2 h;
    public Ab.k i;

    public a3(x1 x10, k k0, B0 b00) {
        j.f(k0, "cache");
        super(3);
        this.c = x10;
        this.d = k0;
        this.e = b00;
        this.f = o0.c(null);
        this.g = new Object();
        this.h = new V2(this, null);
    }

    @Override  // k2.w
    public final Object a(Object object0) {
        return ((f9.j)object0).a;
    }

    @Override  // k2.w
    public final Object b(b b0, W w0) {
        String s = null;
        Object object0 = b0.e;
        switch(((g0)b0.d).ordinal()) {
            case 0: {
                Xb.k k0 = new Xb.k(1, N4.j.w(w0));
                k0.v();
                N n0 = new N(k0, this, 1);
                this.i = new Ab.k(((int)b0.b), null);
                n.a("loadInitial", null, F.K(new Ab.k[]{new Ab.k("before", "null"), new Ab.k("delegate", this.c.toString())}), null, null, 26);
                if(object0 != null) {
                    J.u(new Y2(this, n0, null));
                    return k0.u();
                }
                Z2 z20 = new Z2(this, n0, null);
                a.a(o.a, null, z20, 2);
                return k0.u();
            }
            case 1: {
                j.c(object0);
                Xb.k k1 = new Xb.k(1, N4.j.w(w0));
                k1.v();
                z z0 = z.X;
                Object object1 = p.q0(z0);
                String s1 = object1 == null ? null : ((f9.j)object1).a;
                Object object2 = p.x0(z0);
                if(object2 != null) {
                    s = ((f9.j)object2).a;
                }
                k1.i(new u(z0, s1, s, 0x80000000, 0x80000000));
                return k1.u();
            }
            case 2: {
                j.c(object0);
                D.w w1 = new D.w(b0.c, object0);
                Xb.k k2 = new Xb.k(1, N4.j.w(w0));
                k2.v();
                N n1 = new N(k2, this, 0);
                n.a("loadAfter", null, F.K(new Ab.k[]{new Ab.k("key", object0), new Ab.k("delegate", this.c.toString())}), null, null, 26);
                a.a(null, null, new X2(this, w1, n1, null), 3);
                return k2.u();
            }
            default: {
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
        }
    }

    public static final Object c(a3 a30, Ab.k k0, H h0, c c0) {
        S2 s20;
        if(c0 instanceof S2) {
            s20 = (S2)c0;
            int v = s20.g0;
            if((v & 0x80000000) == 0) {
                s20 = new S2(a30, c0);
            }
            else {
                s20.g0 = v ^ 0x80000000;
            }
        }
        else {
            s20 = new S2(a30, c0);
        }
        Object object0 = s20.e0;
        Object object1 = Eb.a.X;
        switch(s20.g0) {
            case 0: {
                f.b0(object0);
                try {
                    ((B0)a30.e).getClass();
                    ((B0)a30.e).l(null, t3.Y);
                    s20.b0 = a30;
                    s20.c0 = k0;
                    s20.d0 = h0;
                    s20.g0 = 1;
                    object0 = a30.h.j(k0, s20);
                    if(object0 == object1) {
                        return object1;
                    label_23:
                        h0 = s20.d0;
                        k0 = s20.c0;
                        a30 = s20.b0;
                        f.b0(object0);
                    }
                    Ab.k k1 = a30.i;
                    if(k1 != null) {
                        j.a(k0, k1);
                    }
                    List list0 = p.H0(a30.c.b(((List)object0)));
                    ((B0)a30.e).getClass();
                    ((B0)a30.e).l(null, (list0.isEmpty() ? t3.c0 : t3.Z));
                    h0.c(list0);
                    return t.a;
                }
                catch(O o0) {
                    break;
                }
            }
            case 1: {
                goto label_23;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((B0)a30.e).getClass();
        ((B0)a30.e).l(null, t3.b0);
        a30.f.k(o0.getLocalizedMessage());
        return t.a;
    }

    public static final Object d(a3 a30, Ab.k k0, c c0) {
        Ab.k k4;
        a3 a33;
        Ab.k k3;
        T2 t20;
        a3 a31 = a30;
        Ab.k k1 = k0;
        a30.getClass();
        if(c0 instanceof T2) {
            t20 = (T2)c0;
            int v = t20.f0;
            if((v & 0x80000000) == 0) {
                t20 = new T2(a31, c0);
            }
            else {
                t20.f0 = v ^ 0x80000000;
            }
        }
        else {
            t20 = new T2(a31, c0);
        }
        Object object0 = t20.d0;
        Object object1 = Eb.a.X;
        switch(t20.f0) {
            case 0: {
                f.b0(object0);
                a31.d.getClass();
                j.f(k1, "params");
                List list0 = (List)a31.d.a.remove(k1);
                x1 x10 = a31.c;
                Object object2 = k1.Y;
                if(list0 != null) {
                    n.a("fetchQueryCacheAndNetwork in-memory cache", null, F.K(new Ab.k[]{new Ab.k("before", String.valueOf(object2)), new Ab.k("delegate", x10.toString())}), null, null, 26);
                    return list0;
                }
                try {
                    int v1 = ((Number)k1.X).intValue();
                    t20.b0 = a31;
                    t20.c0 = k1;
                    t20.f0 = 1;
                    object0 = x10.c(v1, ((String)object2), H6.Y, t20);
                    if(object0 != object1) {
                        k3 = new Ab.k(object0, Boolean.TRUE);
                        goto label_56;
                    label_32:
                        Ab.k k2 = t20.c0;
                        a3 a32 = t20.b0;
                        k1 = k2;
                        a31 = a32;
                        f.b0(object0);
                        k1 = k2;
                        a31 = a32;
                        k3 = new Ab.k(object0, Boolean.TRUE);
                        goto label_56;
                    }
                    break;
                }
                catch(O unused_ex) {
                    goto label_41;
                }
            }
            case 1: {
                goto label_32;
            label_41:
                int v2 = ((Number)k1.X).intValue();
                t20.b0 = a31;
                t20.c0 = k1;
                t20.f0 = 2;
                object0 = a31.c.c(v2, ((String)k1.Y), H6.Z, t20);
                if(object0 != object1) {
                    a33 = a31;
                    k4 = k1;
                    goto label_53;
                }
                break;
            }
            case 2: {
                k4 = t20.c0;
                a33 = t20.b0;
                f.b0(object0);
            label_53:
                k3 = new Ab.k(object0, Boolean.FALSE);
                k1 = k4;
                a31 = a33;
            label_56:
                object1 = (List)k3.X;
                n.a("fetchQueryCacheAndNetwork", null, F.K(new Ab.k[]{new Ab.k("cache_hit", ((Boolean)k3.Y)), new Ab.k("before", String.valueOf(k1.Y)), new Ab.k("delegate", a31.c.toString())}), null, null, 26);
                if(((Boolean)k3.Y).booleanValue()) {
                    a.a(null, null, new U2(a31, ((List)object1), k1, null), 3);
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object1;
    }

    public static final Object e(a3 a30, List list0, Ab.k k0, c c0) {
        Ab.k k3;
        List list3;
        a3 a33;
        O o1;
        Serializable serializable0;
        List list2;
        List list1;
        Ab.k k1;
        W2 w20;
        a3 a31 = a30;
        if(c0 instanceof W2) {
            w20 = (W2)c0;
            int v = w20.h0;
            if((v & 0x80000000) == 0) {
                w20 = new W2(a31, c0);
            }
            else {
                w20.h0 = v ^ 0x80000000;
            }
        }
        else {
            w20 = new W2(a31, c0);
        }
        Object object0 = w20.f0;
        Object object1 = Eb.a.X;
        switch(w20.h0) {
            case 0: {
                f.b0(object0);
                try {
                    int v1 = ((Number)k0.X).intValue();
                    w20.b0 = a31;
                    w20.c0 = list0;
                    w20.d0 = k0;
                    w20.h0 = 1;
                    object0 = a31.c.c(v1, ((String)k0.Y), H6.Z, w20);
                }
                catch(O o0) {
                    k1 = k0;
                    list1 = list0;
                    goto label_41;
                }
                if(object0 == object1) {
                    return object1;
                }
                k1 = k0;
                list1 = list0;
                list2 = (List)object0;
                goto label_59;
            }
            case 1: {
                try {
                    Ab.k k2 = w20.d0;
                    list1 = w20.c0;
                    a3 a32 = w20.b0;
                    k1 = k2;
                    a31 = a32;
                    f.b0(object0);
                    k1 = k2;
                    a31 = a32;
                    list2 = (List)object0;
                    goto label_59;
                }
                catch(O o0) {
                }
                try {
                label_41:
                    int v2 = ((Number)k1.X).intValue();
                    w20.b0 = a31;
                    w20.c0 = list1;
                    w20.d0 = k1;
                    w20.e0 = o0;
                    w20.h0 = 2;
                    serializable0 = a31.c.c(v2, ((String)k1.Y), H6.Y, w20);
                }
                catch(O unused_ex) {
                    o1 = o0;
                    throw o1;
                }
                if(serializable0 == object1) {
                    return object1;
                }
                a33 = a31;
                list3 = list1;
                k3 = k1;
                o1 = o0;
                object0 = serializable0;
                goto label_76;
            label_59:
                if(!j.a(list1, list2)) {
                    k k4 = a31.d;
                    Ab.k k5 = a31.i;
                    if(k5 != null) {
                        k4.getClass();
                        k4.a.put(k5, list2);
                        a31.b.i();
                        n.a("Invalidating datasource and updating page from network", null, F.K(new Ab.k[]{new Ab.k("before", String.valueOf(k1.Y)), new Ab.k("delegate", a31.c.toString())}), null, null, 26);
                        return t.a;
                    }
                    j.p("initialQuery");
                    throw null;
                }
                return t.a;
            }
            case 2: {
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            o1 = w20.e0;
            k3 = w20.d0;
            list3 = w20.c0;
            a33 = w20.b0;
            f.b0(object0);
        label_76:
            if(!j.a(((List)object0), list3)) {
                k k6 = a33.d;
                Ab.k k7 = a33.i;
                if(k7 == null) {
                    j.p("initialQuery");
                    throw null;
                }
                k6.getClass();
                k6.a.put(k7, ((List)object0));
                a33.b.i();
                n.a("Invalidating datasource and updating page from cache", null, F.K(new Ab.k[]{new Ab.k("before", String.valueOf(k3.Y)), new Ab.k("delegate", a33.c.toString())}), null, null, 26);
            }
        }
        catch(O unused_ex) {
        }
        throw o1;
    }
}

