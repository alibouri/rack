package Y8;

import Ab.k;
import Bb.F;
import Bb.p;
import Bb.q;
import Fb.c;
import N3.D;
import N3.I;
import N3.d;
import N4.o;
import Nb.j;
import Qb.e;
import Vb.a;
import W5.f;
import Xb.J;
import Xb.Q;
import Xb.V;
import Xb.i0;
import android.content.Context;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.Executable.Variables;
import com.apollographql.apollo.api.Executables;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.b;
import com.apollographql.apollo.api.http.HttpHeader;
import com.sendwave.util.Country;
import com.wave.customer.CustomerApp;
import d9.M3;
import hb.n;
import ib.g;
import io.sentry.i1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import q9.C3;
import q9.h0;
import q9.j0;
import q9.o0;

public final class e6 extends R6 {
    public final String a;
    public final C3 b;
    public final g c;
    public final Function1 d;
    public final Country e;
    public final String f;
    public final String g;
    public final M3.g h;

    public e6(String s, String s1, C3 c30, M3.g g0, g g1, Function1 function10, Country country0) {
        j.f(g0, "apolloClient");
        j.f(g1, "trafficMasking");
        j.f(country0, "country");
        super();
        this.a = s;
        this.b = c30;
        this.c = g1;
        this.d = function10;
        this.e = country0;
        String s2 = null;
        this.f = null;
        if(s != null && s1 != null) {
            byte[] arr_b = b.q(s, ":", s1).getBytes(a.a);
            j.e(arr_b, "getBytes(...)");
            s2 = o0.k(2, arr_b);
        }
        this.g = s2;
        this.h = g0;
    }

    public final Serializable j(String s, String s1, String s2, long v, boolean z, c c0) {
        Cb.c c3;
        Cb.c c2;
        String s3;
        Z5 z50;
        if(c0 instanceof Z5) {
            z50 = (Z5)c0;
            int v1 = z50.f0;
            if((v1 & 0x80000000) == 0) {
                z50 = new Z5(this, c0);
            }
            else {
                z50.f0 = v1 ^ 0x80000000;
            }
        }
        else {
            z50 = new Z5(this, c0);
        }
        Object object0 = z50.d0;
        Serializable serializable0 = Eb.a.X;
        switch(z50.f0) {
            case 0: {
                f.b0(object0);
                Cb.c c1 = q.m();
                C3 c30 = this.b;
                j.e("com.wave.personal", "getPackageName(...)");
                c1.add(new HttpHeader("apollographql-client-name", "com.wave.personal"));
                c1.add(new HttpHeader("apollographql-client-version", String.valueOf(c30.h())));
                c1.add(new HttpHeader("content-type", "application/json"));
                try {
                    Context context0 = c30.getApplicationContext();
                    j.e(context0, "getApplicationContext(...)");
                    s3 = f.D(context0).getLanguage() + "-" + c30.k().Y;
                }
                catch(Throwable throwable0) {
                    n.d("Unable to find user accept language for HTTP request", i1.INFO, b.t("underlyingExceptionMessage", throwable0.getMessage()), false, 8);
                    s3 = null;
                }
                if(s3 != null) {
                    c1.add(new HttpHeader("Accept-Language", s3));
                }
                c1.add(new HttpHeader("x-cloud-trace-context", s2 + "/" + a.a.D(10, v) + ";o=1"));
                if(s1 != null) {
                    byte[] arr_b = (this.a + ":" + s1).getBytes(a.a);
                    j.e(arr_b, "getBytes(...)");
                    c1.add(new HttpHeader("Authorization", "Basic " + o0.k(2, arr_b)));
                }
                else if(s != null) {
                    c1.add(new HttpHeader("Authorization", "Basic " + s));
                }
                if(((CustomerApp)c30).G0 == 1) {
                    c1.add(new HttpHeader("X-Local-Country-ISO2", this.e.Y));
                }
                if(z) {
                    try {
                        j0 j00 = (j0)c30.h0.getValue();
                        z50.b0 = c1;
                        z50.c0 = c1;
                        z50.f0 = 1;
                        j00.getClass();
                        long v2 = o.I(5, Wb.c.b0);
                        h0 h00 = new h0(j00, null);
                        object0 = J.z(Q.d(v2), h00, z50);
                    }
                    catch(Exception unused_ex) {
                        return q.i(c1);
                    }
                    if(object0 == serializable0) {
                        return serializable0;
                    }
                    c2 = c1;
                    c3 = c2;
                    goto label_59;
                }
                return q.i(c1);
            }
            case 1: {
                try {
                    c2 = z50.c0;
                    c3 = z50.b0;
                    f.b0(object0);
                label_59:
                    if(((String)object0) != null) {
                        c2.add(new HttpHeader("X-Firebase-AppCheck", ((String)object0)));
                    }
                }
                catch(Exception unused_ex) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return q.i(c3);
    }

    public final Object k(M3.b b0, String s, G6 g60, c c0) {
        Object object5;
        a6 a60;
        if(c0 instanceof a6) {
            a60 = (a6)c0;
            int v = a60.e0;
            if((v & 0x80000000) == 0) {
                a60 = new a6(this, c0);
            }
            else {
                a60.e0 = v ^ 0x80000000;
            }
        }
        else {
            a60 = new a6(this, c0);
        }
        Object object0 = a60.c0;
        Object object1 = Eb.a.X;
        switch(a60.e0) {
            case 0: {
                boolean z = false;
                f.b0(object0);
                j.f(e.X, "<this>");
                long v1 = e.Y.d().nextLong();
                k k0 = new k("trace_id", s);
                k k1 = new k("country", this.e.Y);
                n.a("Apollo call", hb.a.Y, F.K(new k[]{new k("operation", b0.Y.getOperation().name()), k0, k1, new k("authed", String.valueOf(this.a != null))}), null, "http", 8);
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                String s1 = b0.Y.getOperation().name();
                j.f(s1, "headerValue");
                linkedHashMap0.put("X-TRACING-OPERATION-NAME", s1);
                linkedHashMap0.put("X-TRACING-OPERATION-TYPE", S6.d(b0.Y.getOperation()));
                b0.addExecutionContext(new d(new O3.a(linkedHashMap0)));
                b0.addExecutionContext(new D(g60 == G6.Y));
                b0.addExecutionContext(new N3.j(g60 == G6.Z));
                Operation operation0 = b0.Y.getOperation();
                if(((CustomerApp)this.b).J0 && operation0 instanceof Mutation) {
                    Object object2 = p.p0(((Mutation)operation0).rootField().getSelections());
                    j.d(object2, "null cannot be cast to non-null type com.apollographql.apollo.api.CompiledField");
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object3: ((CompiledField)object2).getSelections()) {
                        if(object3 instanceof CompiledField) {
                            arrayList0.add(object3);
                        }
                    }
                    if(!arrayList0.isEmpty()) {
                        for(Object object4: arrayList0) {
                            if(j.a(((CompiledField)object4).getType().rawType().getName(), M3.a.getName())) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                a60.b0 = b0;
                a60.e0 = 1;
                object0 = this.j(this.g, this.f, s, v1, z, a60);
                if(object0 == object1) {
                    return object1;
                }
                object5 = b0;
                break;
            }
            case 1: {
                object5 = a60.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        object5.Y.httpHeaders(((List)object0));
        return object5;
    }

    public final void l(O o0, String s) {
        o0.Z = s;
        if(!(o0 instanceof y3)) {
            if(o0 instanceof z3) {
                String s1 = this.a;
                if(s1 != null) {
                    this.d.n(s1);
                    return;
                }
                n.d("Got LoggedOutUserSession for `null` mobile.", null, null, false, 14);
                return;
            }
            if(o0 instanceof T) {
                g g0 = this.c;
                if(g0.g == null) {
                    if(g0.a() < 30L) {
                        v7.d.s(("Skipping, last retrieval: " + g0.a() + " seconds ago"));
                        return;
                    }
                    if(g0.d.tryAcquire()) {
                        ib.e e0 = new ib.e(g0, null);
                        J.q(i0.X, V.c, null, e0, 2);
                    }
                }
            }
        }
    }

    public final Object m(M3.b b0, G6 g60, c c0) {
        e6 e61;
        String s5;
        String s4;
        String s3;
        String s2;
        e6 e60;
        d6 d60;
        if(c0 instanceof d6) {
            d60 = (d6)c0;
            int v = d60.h0;
            if((v & 0x80000000) == 0) {
                d60 = new d6(this, c0);
            }
            else {
                d60.h0 = v ^ 0x80000000;
            }
        }
        else {
            d60 = new d6(this, c0);
        }
        Object object0 = d60.f0;
        Object object1 = Eb.a.X;
        switch(d60.h0) {
            case 0: {
                f.b0(object0);
                String s = b0.Y.getOperation().name();
                e.X.getClass();
                e.Y.getClass();
                byte[] arr_b = new byte[16];
                e.Y.d().nextBytes(arr_b);
                String s1 = Z6.b.z(arr_b);
                d60.b0 = this;
                d60.c0 = "performCall";
                d60.d0 = s;
                d60.e0 = s1;
                d60.h0 = 1;
                Object object2 = this.k(b0, s1, g60, d60);
                if(object2 == object1) {
                    return object1;
                }
                e60 = this;
                s2 = s;
                object0 = object2;
                s3 = s1;
                s4 = "performCall";
                goto label_39;
            }
            case 1: {
                s3 = d60.e0;
                s2 = d60.d0;
                s4 = d60.c0;
                e60 = d60.b0;
                f.b0(object0);
            label_39:
                d60.b0 = e60;
                d60.c0 = s4;
                d60.d0 = s2;
                d60.e0 = s3;
                d60.h0 = 2;
                object0 = N.b(((M3.b)object0), d60);
                if(object0 == object1) {
                    return object1;
                }
                s5 = s4;
                e61 = e60;
                break;
            }
            case 2: {
                s3 = d60.e0;
                s2 = d60.d0;
                s5 = d60.c0;
                e61 = d60.b0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ApolloResponse apolloResponse0 = (ApolloResponse)((k)object0).X;
        O o0 = (O)((k)object0).Y;
        if(o0 == null) {
            hd.c.a.n(s5);
            hd.c.a.a("Completed \'" + s2 + "\' without errors", new Object[0]);
            N.c(apolloResponse0.data);
            boolean z = I.e(apolloResponse0);
            Variables executable$Variables0 = Executables.variables(apolloResponse0.operation, e61.h.c0);
            return new y6(apolloResponse0.data, z, apolloResponse0.isLast, executable$Variables0);
        }
        hd.c.a.n(s5);
        hd.c.a.b(o0, "Completed \'" + s2 + "\' with errors", new Object[0]);
        e61.l(o0, s3);
        boolean z1 = I.e(apolloResponse0);
        Variables executable$Variables1 = Executables.variables(apolloResponse0.operation, e61.h.c0);
        return new x6(o0, z1, apolloResponse0.isLast, executable$Variables1);
    }
}

