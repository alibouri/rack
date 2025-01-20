package Q3;

import Ab.t;
import Fb.j;
import O3.k;
import W5.f;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class w extends j implements Function2 {
    public Object c0;
    public final Nb.w d0;
    public final x e0;
    public final ApolloRequest f0;
    public final CustomScalarAdapters g0;

    public w(Nb.w w0, x x0, ApolloRequest apolloRequest0, CustomScalarAdapters customScalarAdapters0, g g0) {
        this.d0 = w0;
        this.e0 = x0;
        this.f0 = apolloRequest0;
        this.g0 = customScalarAdapters0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((w)this.t(((ApolloResponse)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        w w0 = new w(this.d0, this.e0, this.f0, this.g0, g0);
        w0.c0 = object0;
        return w0;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        ApolloResponse apolloResponse0 = (ApolloResponse)this.c0;
        if(apolloResponse0.data != null) {
            Operation operation0 = this.f0.getOperation();
            Nb.j.c(apolloResponse0.data);
            Nb.j.f(operation0, "operation");
            this.d0.X = k.a(k.c(operation0, apolloResponse0.data, this.g0, this.e0.a.a).values());
        }
        return t.a;
    }
}

