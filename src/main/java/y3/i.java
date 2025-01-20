package Y3;

import Ab.t;
import Bb.p;
import Eb.a;
import Ec.l;
import Fb.j;
import M.J;
import Nb.w;
import U3.b;
import Vb.q;
import W3.h;
import W5.f;
import ac.o0;
import ac.u;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operations;
import com.apollographql.apollo.api.http.HttpHeaders;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse;
import com.apollographql.apollo.api.json.-JsonReaders;
import java.util.ArrayList;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class i extends j implements Function2 {
    public long c0;
    public int d0;
    public Object e0;
    public final n f0;
    public final HttpRequest g0;
    public final ApolloRequest h0;
    public final CustomScalarAdapters i0;

    public i(n n0, HttpRequest httpRequest0, ApolloRequest apolloRequest0, CustomScalarAdapters customScalarAdapters0, g g0) {
        this.f0 = n0;
        this.g0 = httpRequest0;
        this.h0 = apolloRequest0;
        this.i0 = customScalarAdapters0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((i)this.t(((ac.i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        i i0 = new i(this.f0, this.g0, this.h0, this.i0, g0);
        i0.e0 = object0;
        return i0;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        l l2;
        N2.l l0;
        b b1;
        ac.i i1;
        long v1;
        HttpResponse httpResponse0;
        Object object3;
        long v;
        ac.i i0;
        Object object1 = a.X;
        Object object2 = t.a;
        n n0 = this.f0;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                i0 = (ac.i)this.e0;
                v = System.currentTimeMillis();
                try {
                    ArrayList arrayList0 = p.G0(n0.c, n0.e);
                    HttpRequest httpRequest0 = this.g0;
                    this.e0 = i0;
                    this.c0 = v;
                    this.d0 = 1;
                    if(arrayList0.size() <= 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    object3 = ((e)arrayList0.get(0)).a(httpRequest0, new Y3.a(1, arrayList0), this);
                    if(object3 == object1) {
                        return object1;
                    }
                    goto label_24;
                }
                catch(b b0) {
                    break;
                }
            }
            case 1: {
                v = this.c0;
                i0 = (ac.i)this.e0;
                try {
                    f.b0(object0);
                    object3 = object0;
                label_24:
                    httpResponse0 = (HttpResponse)object3;
                    v1 = v;
                    i1 = i0;
                    b1 = null;
                    goto label_34;
                }
                catch(b b0) {
                }
                break;
            }
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        v1 = v;
        i1 = i0;
        b1 = b0;
        httpResponse0 = null;
    label_34:
        ApolloRequest apolloRequest0 = this.h0;
        if(httpResponse0 == null) {
            Nb.j.c(b1);
            n0.getClass();
            l0 = new N2.l(4, n.c(apolloRequest0.getOperation(), b1));
        }
        else {
            int v2 = httpResponse0.getStatusCode();
            if(200 > v2 || v2 >= 300) {
                Operation operation1 = apolloRequest0.getOperation();
                if(n0.d) {
                    l2 = httpResponse0.getBody();
                }
                else {
                    l l3 = httpResponse0.getBody();
                    if(l3 != null) {
                        l3.close();
                    }
                    l2 = null;
                }
                l0 = new N2.l(4, n.c(operation1, new U3.e(httpResponse0.getStatusCode(), httpResponse0.getHeaders(), l2, J.d(httpResponse0.getStatusCode(), "Http request failed with status code `", "`"))));
            }
            else {
                String s = HttpHeaders.valueOf(httpResponse0.getHeaders(), "Content-Type");
                CustomScalarAdapters customScalarAdapters0 = this.i0;
                if(s == null || !q.O(s, "multipart/", true)) {
                    n0.getClass();
                    l l1 = httpResponse0.getBody();
                    Nb.j.c(l1);
                    l0 = new N2.l(4, Operations.toApolloResponse$default(-JsonReaders.jsonReader(l1), apolloRequest0.getOperation(), null, customScalarAdapters0, null, 2, null).newBuilder().isLast(true).build());
                }
                else {
                    Operation operation0 = apolloRequest0.getOperation();
                    n0.getClass();
                    w w0 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                    w w1 = new w();  // initializer: Ljava/lang/Object;-><init>()V
                    l0 = new ac.w(new Y3.l(new u(new N2.l(new W3.g(w1, httpResponse0, null)), new h(w1, null, 0)), operation0, customScalarAdapters0, n0, w0), new m(operation0, null));
                }
            }
        }
        this.e0 = null;
        this.d0 = 2;
        o0.r(i1);
        Object object4 = l0.d(new I.w(i1, this.f0, this.h0, httpResponse0, v1), this);
        a a0 = a.X;
        if(object4 != a0) {
            object4 = object2;
        }
        if(object4 != a0) {
            object4 = object2;
        }
        return object4 == object1 ? object1 : object2;
    }
}

