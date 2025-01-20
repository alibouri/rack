package N3;

import Ab.t;
import Fb.j;
import U3.b;
import W5.f;
import com.apollographql.apollo.api.ApolloResponse;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public Object c0;
    public final h d0;

    public g(h h0, kotlin.coroutines.g g0) {
        this.d0 = h0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((g)this.t(((ApolloResponse)object0), ((kotlin.coroutines.g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        kotlin.coroutines.g g1 = new g(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        b b0 = ((ApolloResponse)this.c0).exception;
        if(b0 instanceof U3.h) {
            Nb.j.c(b0);
            this.d0.a.n(b0.getMessage());
        }
        return t.a;
    }
}

