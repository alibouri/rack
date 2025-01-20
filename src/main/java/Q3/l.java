package Q3;

import Ab.t;
import Fb.c;
import M3.i;
import N3.O;
import N3.V;
import N3.b;
import Nb.j;
import V3.a;
import Xb.J;
import ac.h;
import ac.w;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.ExecutionContext.Element;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.Subscription;
import java.util.Set;

public final class l implements b, a {
    public final q a;

    public l(q q0) {
        this.a = q0;
    }

    @Override  // V3.a
    public final h a(ApolloRequest apolloRequest0, V3.b b0) {
        j.f(apolloRequest0, "request");
        Operation operation0 = apolloRequest0.getOperation();
        if(operation0 instanceof Subscription) {
            CustomScalarAdapters customScalarAdapters0 = l.b(apolloRequest0);
            return new w(b0.a(apolloRequest0), new f(this, apolloRequest0, customScalarAdapters0, null), 4);
        }
        if(operation0 instanceof Mutation) {
            return new N2.l(new d(apolloRequest0, this, l.b(apolloRequest0), b0, null));
        }
        if(!(operation0 instanceof Query)) {
            throw new IllegalStateException(("Unknown operation " + apolloRequest0.getOperation()).toString());
        }
        CustomScalarAdapters customScalarAdapters1 = l.b(apolloRequest0);
        return ((N3.l)apolloRequest0.getExecutionContext().get(N3.l.a)) == null ? new N2.l(new e(false, this, apolloRequest0, customScalarAdapters1, b0, null)) : new N2.l(new e(true, this, apolloRequest0, customScalarAdapters1, b0, null));
    }

    public static CustomScalarAdapters b(ApolloRequest apolloRequest0) {
        j.f(apolloRequest0, "<this>");
        Element executionContext$Element0 = apolloRequest0.getExecutionContext().get(CustomScalarAdapters.Key);
        j.c(executionContext$Element0);
        return (CustomScalarAdapters)executionContext$Element0;
    }

    public final Object c(ApolloRequest apolloRequest0, ApolloResponse apolloResponse0, CustomScalarAdapters customScalarAdapters0, Set set0, c c0) {
        j.f(apolloRequest0, "<this>");
        N3.j j0 = (N3.j)apolloRequest0.getExecutionContext().get(N3.j.b);
        boolean z = false;
        Object object0 = t.a;
        if((j0 == null ? false : j0.a)) {
            return object0;
        }
        if(apolloResponse0.data == null) {
            return object0;
        }
        if(apolloResponse0.hasErrors()) {
            if(apolloRequest0.getExecutionContext().get(O.a) != null) {
                throw new ClassCastException();
            }
            return object0;
        }
        Q3.h h0 = new Q3.h(apolloResponse0, apolloRequest0, this, customScalarAdapters0, set0, null, 0);
        V v0 = (V)apolloRequest0.getExecutionContext().get(V.b);
        if(v0 != null) {
            z = v0.a;
        }
        if(z) {
            Element executionContext$Element0 = apolloRequest0.getExecutionContext().get(i.c);
            j.c(executionContext$Element0);
            g g0 = new g(h0, null);
            J.q(((i)executionContext$Element0).b, null, null, g0, 3);
            return object0;
        }
        Object object1 = h0.n(c0);
        if(object1 == Eb.a.X) {
            return object1 == Eb.a.X ? object1 : object0;
        }
        return object0;
    }
}

