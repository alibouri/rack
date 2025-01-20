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

public final class r extends j implements Function2 {
    public ApolloResponse c0;
    public int d0;
    public Object e0;
    public final b f0;
    public final ApolloRequest g0;

    public r(b b0, ApolloRequest apolloRequest0, g g0) {
        this.f0 = b0;
        this.g0 = apolloRequest0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((r)this.t(((i)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new r(this.f0, this.g0, g0);
        g1.e0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        ApolloResponse apolloResponse1;
        i i2;
        i i1;
        Object object1 = a.X;
        Object object2 = t.a;
        b b0 = this.f0;
        ApolloRequest apolloRequest0 = this.g0;
        boolean z = true;
        switch(this.d0) {
            case 0: {
                f.b0(object0);
                i i0 = (i)this.e0;
                Builder apolloRequest$Builder0 = apolloRequest0.newBuilder();
                I.b(apolloRequest$Builder0);
                h h0 = b0.a(apolloRequest$Builder0.build());
                this.e0 = i0;
                this.d0 = 1;
                Object object3 = o0.C(h0, this);
                if(object3 == object1) {
                    return object1;
                }
                i1 = i0;
                object0 = object3;
                goto label_24;
            }
            case 1: {
                i1 = (i)this.e0;
                f.b0(object0);
            label_24:
                com.apollographql.apollo.api.ApolloResponse.Builder apolloResponse$Builder0 = ((ApolloResponse)object0).newBuilder();
                if(((ApolloResponse)object0).exception != null) {
                    z = false;
                }
                ApolloResponse apolloResponse0 = apolloResponse$Builder0.isLast(z).build();
                this.e0 = i1;
                this.c0 = (ApolloResponse)object0;
                this.d0 = 2;
                if(i1.c(apolloResponse0, this) == object1) {
                    return object1;
                }
                i2 = i1;
                apolloResponse1 = (ApolloResponse)object0;
                break;
            }
            case 2: {
                apolloResponse1 = this.c0;
                i2 = (i)this.e0;
                f.b0(object0);
                break;
            }
            case 3: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(apolloResponse1.exception == null) {
            return object2;
        }
        h h1 = b0.a(apolloRequest0);
        this.e0 = null;
        this.c0 = null;
        this.d0 = 3;
        return o0.p(h1, i2, this) == object1 ? object1 : object2;
    }
}

