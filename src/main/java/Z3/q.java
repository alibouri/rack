package Z3;

import Ab.e;
import Ab.t;
import B3.d;
import Bb.F;
import Ea.S0;
import Ha.S;
import I5.h;
import Nb.j;
import Nb.w;
import T4.l;
import W3.b;
import W3.f;
import X3.a;
import Xb.G;
import Xb.H;
import Xb.I;
import Xb.J;
import Xb.r0;
import Zb.i;
import a4.c;
import a4.k;
import ac.G0;
import ac.i0;
import ac.n0;
import ac.o0;
import ac.u;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.http.DefaultHttpRequestComposer;
import com.apollographql.apollo.api.http.HttpHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

public final class q implements a {
    public final Function1 a;
    public final ArrayList b;
    public final d c;
    public final long d;
    public final A0.d e;
    public final Function3 f;
    public final i g;
    public final n0 h;
    public final i0 i;
    public final b j;
    public final h k;

    public q(Function1 function10, ArrayList arrayList0, d d0, long v, A0.d d1, Function3 function30) {
        this.a = function10;
        this.b = arrayList0;
        this.c = d0;
        this.d = v;
        this.e = d1;
        this.f = function30;
        this.g = l.i(0x7FFFFFFF, 6, null);
        n0 n00 = o0.a(0, 0x7FFFFFFF, Zb.a.X);
        this.h = n00;
        this.i = new i0(n00);
        n00.i();
        b b0 = new b();
        this.j = b0;
        J.q(H.a(b0.Y), null, null, new g(this, null), 3);
        this.k = new h(24, this);
    }

    @Override  // X3.a
    public final void a() {
        this.g.s(c.a);
    }

    @Override  // X3.a
    public final ac.h b(ApolloRequest apolloRequest0) {
        j.f(apolloRequest0, "request");
        W3.c c0 = new W3.c();
        m m0 = new m(this, apolloRequest0, null);
        return new u(new S(new Z3.l(new N2.l(new f(new S(new G0(this.i, m0), 7, apolloRequest0), new N9.l(apolloRequest0, null, 2), null)), apolloRequest0, c0, this), 8, c0), new S0(this, apolloRequest0, null, 5));
    }

    // This method was un-flattened
    public static final Object c(q q0, G g0, Fb.c c0) {
        Z3.b b0;
        Object object8;
        Object object6;
        d d1;
        a4.f f3;
        q q10;
        G g10;
        w w36;
        w w35;
        w w34;
        Map map10;
        long v10;
        w w30;
        w w29;
        w w28;
        Map map8;
        long v8;
        w w24;
        G g7;
        q q7;
        w w23;
        w w22;
        w w21;
        Map map6;
        w w20;
        w w19;
        w w18;
        Map map5;
        Object object2;
        G g6;
        q q6;
        q q5;
        G g5;
        w w17;
        w w16;
        w w15;
        Map map4;
        a4.f f1;
        d d0;
        long v6;
        q q3;
        G g3;
        w w11;
        w w10;
        w w9;
        Map map2;
        a4.f f0;
        long v4;
        long v3;
        G g2;
        G g1;
        w w5;
        w w4;
        w w3;
        n n1;
        long v1;
        Map map0;
        q q1;
        n n0;
        q0.getClass();
        if(c0 instanceof n) {
            n0 = (n)c0;
            int v = n0.m0;
            if((v & 0x80000000) == 0) {
                q1 = q0;
                n0 = new n(q1, c0);
            }
            else {
                n0.m0 = v ^ 0x80000000;
                q1 = q0;
            }
        }
        else {
            q1 = q0;
            n0 = new n(q1, c0);
        }
        Object object0 = n0.k0;
        Object object1 = Eb.a.X;
        switch(n0.m0) {
            case 0: {
                W5.f.b0(object0);
                w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                w w1 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                w w2 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                map0 = new LinkedHashMap();
                v1 = 0L;
                n1 = n0;
                w3 = w2;
                w4 = w1;
                w5 = w0;
                g1 = g0;
                goto label_199;
            }
            case 1: {
                long v2 = n0.j0;
                Map map1 = n0.g0;
                w w6 = n0.f0;
                w w7 = n0.e0;
                w w8 = n0.d0;
                g2 = n0.c0;
                q q2 = n0.b0;
                W5.f.b0(object0);
                v3 = v2;
                map0 = map1;
                w5 = w8;
                n1 = n0;
                w3 = w6;
                w4 = w7;
                q1 = q2;
                goto label_213;
            }
            case 2: {
                v4 = n0.j0;
                f0 = n0.h0;
                map2 = n0.g0;
                w9 = n0.f0;
                w10 = n0.e0;
                w11 = n0.d0;
                g3 = n0.c0;
                q3 = n0.b0;
                W5.f.b0(object0);
                goto label_240;
            }
            case 3: {
                long v5 = n0.j0;
                Map map3 = n0.g0;
                w w12 = n0.f0;
                w w13 = n0.e0;
                w w14 = n0.d0;
                G g4 = n0.c0;
                q q4 = n0.b0;
                W5.f.b0(object0);
                g1 = g4;
                v1 = v5;
                map0 = map3;
                w5 = w14;
                n1 = n0;
                w3 = w12;
                w4 = w13;
                q1 = q4;
                goto label_199;
            }
            case 4: {
                try {
                    v6 = n0.j0;
                    d0 = n0.i0;
                    f1 = n0.h0;
                    map4 = n0.g0;
                    w15 = n0.f0;
                    w16 = n0.e0;
                    w17 = n0.d0;
                    g5 = n0.c0;
                    q5 = n0.b0;
                    W5.f.b0(object0);
                    q6 = q5;
                    w5 = w17;
                    g6 = g5;
                    goto label_327;
                }
                catch(Exception exception0) {
                    object2 = object1;
                    map5 = map4;
                    w18 = w15;
                    w19 = w16;
                    w20 = w17;
                    g6 = g5;
                    q6 = q5;
                    goto label_376;
                }
            }
            case 5: {
                try {
                    v6 = n0.j0;
                    a4.f f2 = n0.h0;
                    map6 = n0.g0;
                    w21 = n0.f0;
                    w22 = n0.e0;
                    w23 = n0.d0;
                    g6 = n0.c0;
                    q6 = n0.b0;
                    W5.f.b0(object0);
                    object2 = object1;
                    f1 = f2;
                    q7 = q6;
                    g7 = g6;
                    w24 = w23;
                    w16 = w22;
                    w15 = w21;
                    map4 = map6;
                    b0 = (Z3.b)object0;
                    goto label_398;
                }
                catch(Exception exception0) {
                    map5 = map6;
                    object2 = object1;
                    w18 = w21;
                    w19 = w22;
                    w20 = w23;
                    goto label_376;
                }
            }
            case 6: {
                long v7 = n0.j0;
                Map map7 = n0.g0;
                w w25 = n0.f0;
                w w26 = n0.e0;
                w w27 = n0.d0;
                G g8 = n0.c0;
                q q8 = n0.b0;
                W5.f.b0(object0);
                w5 = w27;
                g1 = g8;
                v1 = v7;
                map0 = map7;
                w4 = w26;
                n1 = n0;
                w3 = w25;
                q1 = q8;
                object1 = object1;
                goto label_199;
            }
            case 7: {
                try {
                    v8 = n0.j0;
                    f1 = n0.h0;
                    map4 = n0.g0;
                    w15 = n0.f0;
                    w16 = n0.e0;
                    w24 = n0.d0;
                    g7 = n0.c0;
                    q7 = n0.b0;
                    object2 = object1;
                    W5.f.b0(object0);
                    object2 = object1;
                    goto label_442;
                }
                catch(Exception exception1) {
                    map8 = map4;
                    w28 = w15;
                    w29 = w16;
                    w30 = w24;
                    goto label_420;
                }
            }
            case 8: {
                long v9 = n0.j0;
                Map map9 = n0.g0;
                w w31 = n0.f0;
                w w32 = n0.e0;
                w w33 = n0.d0;
                G g9 = n0.c0;
                q q9 = n0.b0;
                W5.f.b0(object0);
                w4 = w32;
                w5 = w33;
                g1 = g9;
                v1 = v9;
                map0 = map9;
                q1 = q9;
                n1 = n0;
                w3 = w31;
                object1 = object1;
                goto label_199;
            }
            case 9: {
                v10 = n0.j0;
                map10 = n0.g0;
                w34 = n0.f0;
                w35 = n0.e0;
                w36 = n0.d0;
                g10 = n0.c0;
                q10 = n0.b0;
                W5.f.b0(object0);
                object2 = object1;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            while(true) {
            label_183:
                g1 = g10;
                q1 = q10;
                w5 = w36;
                if(map10.isEmpty()) {
                    w5.X = J.q(g1, null, null, new p(q1, w34, w35, w5, null), 3);
                }
                else {
                    r0 r00 = (r0)w5.X;
                    if(r00 != null) {
                        r00.f(null);
                    }
                    w5.X = null;
                }
                w4 = w35;
                w3 = w34;
                map0 = map10;
                v1 = v10;
                n1 = n0;
                object1 = object2;
                while(true) {
                label_199:
                    n1.b0 = q1;
                    n1.c0 = g1;
                    n1.d0 = w5;
                    n1.e0 = w4;
                    n1.f0 = w3;
                    n1.g0 = map0;
                    n1.h0 = null;
                    n1.j0 = v1;
                    n1.m0 = 1;
                    Object object3 = q1.g.t(n1);
                    if(object3 == object1) {
                        return object1;
                    }
                    v3 = v1;
                    g2 = g1;
                    object0 = object3;
                label_213:
                    f3 = (a4.f)object0;
                    if(f3 instanceof a4.d) {
                        if(f3 instanceof a4.g) {
                            q.d(w3, w4, w5);
                            Function3 function30 = q1.f;
                            if(function30 == null) {
                                g3 = g2;
                            }
                            else {
                                n1.b0 = q1;
                                n1.c0 = g2;
                                n1.d0 = w5;
                                n1.e0 = w4;
                                n1.f0 = w3;
                                n1.g0 = map0;
                                n1.h0 = f3;
                                n1.j0 = v3;
                                n1.m0 = 2;
                                Object object4 = function30.h(((a4.g)f3).a, new Long(v3), n1);
                                if(object4 == object1) {
                                    return object1;
                                }
                                f0 = f3;
                                object0 = object4;
                                w11 = w5;
                                w10 = w4;
                                map2 = map0;
                                v4 = v3;
                                q3 = q1;
                                g3 = g2;
                                w9 = w3;
                                n0 = n1;
                            label_240:
                                if(((Boolean)object0).booleanValue()) {
                                    w5 = w11;
                                    map0 = map2;
                                    w4 = w10;
                                    n1 = n0;
                                    w3 = w9;
                                    q1 = q3;
                                    v1 = v4 + 1L;
                                    n1.b0 = q1;
                                    n1.c0 = g3;
                                    n1.d0 = w5;
                                    n1.e0 = w4;
                                    n1.f0 = w3;
                                    n1.g0 = map0;
                                    n1.h0 = null;
                                    n1.j0 = v1;
                                    n1.m0 = 3;
                                    if(q1.g.u(k.a, n1) == object1) {
                                        return object1;
                                    }
                                    g1 = g3;
                                }
                                else {
                                    f3 = f0;
                                    w5 = w11;
                                    map0 = map2;
                                    w4 = w10;
                                    n1 = n0;
                                    w3 = w9;
                                    q1 = q3;
                                    q1.h.q(f3);
                                    g1 = g3;
                                    v1 = 0L;
                                }
                                continue;
                            }
                            q1.h.q(f3);
                            g1 = g3;
                        }
                        else {
                            if(f3 instanceof a4.b) {
                                for(Object object5: map0.values()) {
                                    q1.g.s(((a4.l)object5));
                                }
                            }
                            else {
                                q1.h.q(f3);
                            }
                            g1 = g2;
                        }
                        v1 = 0L;
                        continue;
                    }
                    if(!(f3 instanceof a4.a)) {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                    if(f3 instanceof c) {
                        q.d(w3, w4, w5);
                        return t.a;
                    }
                    if(w3.X != null) {
                        goto label_454;
                    }
                    else if(f3 instanceof a4.m) {
                        map0.remove(((a4.m)f3).a.getRequestUuid());
                        g1 = g2;
                        v1 = v3;
                        continue;
                    }
                    else {
                        try {
                            d1 = q1.c;
                            n1.b0 = q1;
                            n1.c0 = g2;
                            n1.d0 = w5;
                            n1.e0 = w4;
                            n1.f0 = w3;
                            n1.g0 = map0;
                            n1.h0 = f3;
                            n1.i0 = d1;
                            n1.j0 = v3;
                            n1.m0 = 4;
                            object6 = q1.a.n(n1);
                        }
                        catch(Exception exception0) {
                            object2 = object1;
                            q6 = q1;
                            w18 = w3;
                            n0 = n1;
                            w19 = w4;
                            map5 = map0;
                            v6 = v3;
                            g6 = g2;
                            w20 = w5;
                            goto label_376;
                        }
                        if(object6 != object1) {
                            q6 = q1;
                            f1 = f3;
                            object0 = object6;
                            w16 = w4;
                            d0 = d1;
                            g6 = g2;
                            w15 = w3;
                            n0 = n1;
                            map4 = map0;
                            v6 = v3;
                            try {
                            label_327:
                                String s = (String)object0;
                                ArrayList arrayList0 = q6.b;
                                if(!arrayList0.isEmpty()) {
                                    Iterator iterator1 = arrayList0.iterator();
                                    while(iterator1.hasNext()) {
                                        Object object7 = iterator1.next();
                                        if(!j.a(((HttpHeader)object7).getName(), "Sec-WebSocket-Protocol")) {
                                            iterator1 = iterator1;
                                            continue;
                                        }
                                        object8 = object1;
                                        goto label_340;
                                    }
                                }
                                try {
                                    object8 = object1;
                                    arrayList0 = Bb.p.G0(arrayList0, new HttpHeader("Sec-WebSocket-Protocol", "graphql-ws"));
                                label_340:
                                    n0.b0 = q6;
                                    n0.c0 = g6;
                                    n0.d0 = w5;
                                    n0.e0 = w16;
                                    n0.f0 = w15;
                                    n0.g0 = map4;
                                    n0.h0 = f1;
                                    n0.i0 = null;
                                    n0.j0 = v6;
                                    n0.m0 = 5;
                                    object0 = d0.D(s, arrayList0, n0);
                                    object2 = object8;
                                    goto label_363;
                                }
                                catch(Exception exception0) {
                                    object2 = object8;
                                }
                                while(true) {
                                label_355:
                                    map5 = map4;
                                    w18 = w15;
                                    w19 = w16;
                                    w20 = w5;
                                    goto label_376;
                                }
                            }
                            catch(Exception exception0) {
                                object2 = object1;
                                goto label_355;
                            }
                        label_363:
                            if(object0 != object2) {
                                q7 = q6;
                                g7 = g6;
                                w24 = w5;
                                try {
                                    b0 = (Z3.b)object0;
                                    goto label_398;
                                }
                                catch(Exception exception0) {
                                    w18 = w15;
                                    w20 = w24;
                                    g6 = g7;
                                    q6 = q7;
                                    map5 = map4;
                                    w19 = w16;
                                }
                            label_376:
                                a4.g g11 = new a4.g(exception0);
                                n0.b0 = q6;
                                n0.c0 = g6;
                                n0.d0 = w20;
                                n0.e0 = w19;
                                n0.f0 = w18;
                                n0.g0 = map5;
                                n0.h0 = null;
                                n0.i0 = null;
                                n0.j0 = v6;
                                n0.m0 = 6;
                                if(q6.g.u(g11, n0) != object2) {
                                    w5 = w20;
                                    g1 = g6;
                                    v1 = v6;
                                    map0 = map5;
                                    w4 = w19;
                                    n1 = n0;
                                    w3 = w18;
                                    q1 = q6;
                                    object1 = object2;
                                    continue;
                                label_398:
                                    j.f(b0, "webSocketConnection");
                                    j.f(q7.k, "listener");
                                    j.f(g7, "scope");
                                    Z3.f f4 = new Z3.f(b0, q7.k, q7.e.a, ((Function1)q7.e.b), ((r)q7.e.c));
                                    w15.X = f4;
                                    n0.b0 = q7;
                                    n0.c0 = g7;
                                    n0.d0 = w24;
                                    n0.e0 = w16;
                                    n0.f0 = w15;
                                    n0.g0 = map4;
                                    n0.h0 = f1;
                                    v8 = v6;
                                    try {
                                        n0.j0 = v8;
                                        n0.m0 = 7;
                                        if(f4.e(n0) != object2) {
                                            break;
                                        }
                                        return object2;
                                    }
                                    catch(Exception exception1) {
                                        map8 = map4;
                                        w28 = w15;
                                        w29 = w16;
                                        w30 = w24;
                                    }
                                label_420:
                                    w28.X = null;
                                    a4.g g12 = new a4.g(exception1);
                                    n0.b0 = q7;
                                    n0.c0 = g7;
                                    n0.d0 = w30;
                                    n0.e0 = w29;
                                    n0.f0 = w28;
                                    n0.g0 = map8;
                                    n0.h0 = null;
                                    n0.j0 = v8;
                                    n0.m0 = 8;
                                    if(q7.g.u(g12, n0) != object2) {
                                        w5 = w30;
                                        g1 = g7;
                                        q1 = q7;
                                        w4 = w29;
                                        v1 = v8;
                                        map0 = map8;
                                        n1 = n0;
                                        w3 = w28;
                                        object1 = object2;
                                        continue;
                                    }
                                }
                            }
                            return object2;
                        }
                    }
                    return object1;
                }
            label_442:
                o o0 = new o(w15, null);
                w16.X = J.q(g7, null, I.b0, o0, 1);
                f3 = f1;
                map10 = map4;
                w34 = w15;
                q10 = q7;
                g10 = g7;
                w36 = w24;
                w35 = w16;
                v10 = v8;
                goto label_463;
            label_454:
                object2 = object1;
                w36 = w5;
                q10 = q1;
                map10 = map0;
                g10 = g2;
                v10 = v3;
                w35 = w4;
                w34 = w3;
                n0 = n1;
            label_463:
                if(((a4.a)f3) instanceof a4.l) {
                    map10.put(((a4.l)f3).a.getRequestUuid(), f3);
                    Object object9 = w34.X;
                    j.c(object9);
                    j.f(((a4.l)f3).a, "request");
                    Ab.k k0 = new Ab.k("type", "start");
                    Ab.k k1 = new Ab.k("payload", DefaultHttpRequestComposer.Companion.composePayload(((a4.l)f3).a));
                    ((Z3.f)(((Z3.u)object9))).d(F.K(new Ab.k[]{k0, new Ab.k("id", ((a4.l)f3).a.getRequestUuid().toString()), k1}), ((Z3.f)(((Z3.u)object9))).e);
                    continue;
                }
                else if(((a4.a)f3) instanceof a4.m) {
                    map10.remove(((a4.m)f3).a.getRequestUuid());
                    Object object10 = w34.X;
                    j.c(object10);
                    j.f(((a4.m)f3).a, "request");
                    ((Z3.f)(((Z3.u)object10))).d(F.K(new Ab.k[]{new Ab.k("type", "stop"), new Ab.k("id", ((a4.m)f3).a.getRequestUuid().toString())}), ((Z3.f)(((Z3.u)object10))).e);
                    continue;
                }
                else {
                    if(!(((a4.a)f3) instanceof k)) {
                        continue;
                    }
                    break;
                }
                throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
            }
            a4.b b1 = new a4.b();  // initializer: Ljava/lang/Object;-><init>()V
            n0.b0 = q10;
            n0.c0 = g10;
            n0.d0 = w36;
            n0.e0 = w35;
            n0.f0 = w34;
            n0.g0 = map10;
            n0.h0 = null;
            n0.j0 = v10;
            n0.m0 = 9;
            if(q10.g.u(b1, n0) != object2) {
                goto label_183;
            }
            break;
        }
        return object2;
    }

    public static final void d(w w0, w w1, w w2) {
        Z3.u u0 = (Z3.u)w0.X;
        if(u0 != null) {
            ((Dc.g)u0.a.b).b(1000, null);
        }
        w0.X = null;
        r0 r00 = (r0)w1.X;
        if(r00 != null) {
            r00.f(null);
        }
        w1.X = null;
        r0 r01 = (r0)w2.X;
        if(r01 != null) {
            r01.f(null);
        }
        w2.X = null;
    }
}

