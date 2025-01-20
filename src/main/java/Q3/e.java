package Q3;

import Ab.t;
import Eb.a;
import Fb.j;
import N3.D;
import N3.I;
import N3.d;
import U3.h;
import V3.b;
import W5.f;
import ac.H;
import ac.i;
import ac.o0;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse.Builder;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query.Data;
import java.util.LinkedHashMap;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class e extends j implements Function2 {
    public int c0;
    public Object d0;
    public final boolean e0;
    public final l f0;
    public final ApolloRequest g0;
    public final CustomScalarAdapters h0;
    public final b i0;

    public e(boolean z, l l0, ApolloRequest apolloRequest0, CustomScalarAdapters customScalarAdapters0, b b0, g g0) {
        this.e0 = z;
        this.f0 = l0;
        this.g0 = apolloRequest0;
        this.h0 = customScalarAdapters0;
        this.i0 = b0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((e)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        e e0 = new e(this.e0, this.f0, this.g0, this.h0, this.i0, g0);
        e0.d0 = object0;
        return e0;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        ApolloResponse apolloResponse0;
        Data query$Data0;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i i0 = (i)this.d0;
                CustomScalarAdapters customScalarAdapters0 = this.h0;
                ApolloRequest apolloRequest0 = this.g0;
                l l0 = this.f0;
                if(this.e0) {
                    l0.getClass();
                    Operation operation0 = apolloRequest0.getOperation();
                    long v = System.currentTimeMillis();
                    try {
                        d d0 = (d)apolloRequest0.getExecutionContext().get(d.b);
                        O3.a a0 = d0 == null ? O3.a.b : d0.a;
                        D d1 = (D)apolloRequest0.getExecutionContext().get(D.b);
                        if((d1 == null ? false : d1.a)) {
                            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                            linkedHashMap0.put("memory-cache-only", "true");
                            a0 = a0.a(new O3.a(linkedHashMap0));
                        }
                        query$Data0 = (Data)l0.a.c(operation0, customScalarAdapters0, a0);
                    }
                    catch(h h0) {
                        apolloResponse0 = I.a(new Builder(operation0, apolloRequest0.getRequestUuid()).exception(h0).addExecutionContext(apolloRequest0.getExecutionContext()), new N3.f(v, System.currentTimeMillis(), 0L, 0L, false, null)).isLast(true).build();
                        this.c0 = 1;
                        return i0.c(apolloResponse0, this) == object1 ? object1 : object2;
                    }
                    apolloResponse0 = I.a(new Builder(operation0, apolloRequest0.getRequestUuid()).data(query$Data0).addExecutionContext(apolloRequest0.getExecutionContext()), new N3.f(v, System.currentTimeMillis(), 0L, 0L, true, null)).isLast(true).build();
                    this.c0 = 1;
                    return i0.c(apolloResponse0, this) == object1 ? object1 : object2;
                }
                l0.getClass();
                ac.h h1 = this.i0.a(apolloRequest0);
                k k0 = new k(l0, apolloRequest0, customScalarAdapters0, null);
                this.c0 = 2;
                o0.r(i0);
                Object object3 = h1.d(new H(new Q3.j(i0, System.currentTimeMillis(), 0), k0), this);
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 != object1) {
                    object3 = object2;
                }
                if(object3 != object1) {
                    object3 = object2;
                }
                return object3 == object1 ? object1 : object2;
            }
            case 1: 
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

