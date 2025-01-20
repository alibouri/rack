package N3;

import Ab.t;
import Eb.a;
import Fb.j;
import V3.b;
import W5.f;
import ac.h;
import ac.i;
import ac.o0;
import com.apollographql.apollo.api.ApolloRequest.Builder;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class p extends j implements Function2 {
    public int c0;
    public Object d0;
    public final b e0;
    public final ApolloRequest f0;

    public p(b b0, ApolloRequest apolloRequest0, g g0) {
        this.e0 = b0;
        this.f0 = apolloRequest0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((p)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new p(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        i i1;
        Object object1 = a.X;
        b b0 = this.e0;
        ApolloRequest apolloRequest0 = this.f0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i i0 = (i)this.d0;
                Builder apolloRequest$Builder0 = apolloRequest0.newBuilder();
                I.b(apolloRequest$Builder0);
                h h0 = b0.a(apolloRequest$Builder0.build());
                this.d0 = i0;
                this.c0 = 1;
                Object object2 = o0.C(h0, this);
                if(object2 == object1) {
                    return object1;
                }
                i1 = i0;
                object0 = object2;
                goto label_22;
            }
            case 1: {
                i1 = (i)this.d0;
                f.b0(object0);
            label_22:
                ApolloResponse apolloResponse0 = ((ApolloResponse)object0).newBuilder().isLast(false).build();
                this.d0 = i1;
                this.c0 = 2;
                if(i1.c(apolloResponse0, this) == object1) {
                    return object1;
                }
                break;
            }
            case 2: {
                i1 = (i)this.d0;
                f.b0(object0);
                break;
            }
            case 3: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        h h1 = b0.a(apolloRequest0);
        this.d0 = null;
        this.c0 = 3;
        return o0.p(h1, i1, this) == object1 ? object1 : t.a;
    }
}

