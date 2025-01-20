package Q3;

import Ab.t;
import Bb.B;
import Eb.a;
import Fb.j;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class f extends j implements Function2 {
    public int c0;
    public Object d0;
    public final l e0;
    public final ApolloRequest f0;
    public final CustomScalarAdapters g0;

    public f(l l0, ApolloRequest apolloRequest0, CustomScalarAdapters customScalarAdapters0, g g0) {
        this.e0 = l0;
        this.f0 = apolloRequest0;
        this.g0 = customScalarAdapters0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f)this.t(((ApolloResponse)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new f(this.e0, this.f0, this.g0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                W5.f.b0(object0);
                this.c0 = 1;
                return this.e0.c(this.f0, ((ApolloResponse)this.d0), this.g0, B.X, this) == object1 ? object1 : t.a;
            }
            case 1: {
                W5.f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

