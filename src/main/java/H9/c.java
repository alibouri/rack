package H9;

import Nb.j;
import V3.a;
import V3.b;
import ac.h;
import com.apollographql.apollo.api.ApolloRequest;

public final class c implements a {
    @Override  // V3.a
    public final h a(ApolloRequest apolloRequest0, b b0) {
        j.f(apolloRequest0, "request");
        return b0.a(apolloRequest0.newBuilder().addHttpHeader("X-APOLLO-OPERATION-NAME", apolloRequest0.getOperation().name()).addHttpHeader("X-APOLLO-OPERATION-ID", apolloRequest0.getOperation().id()).build());
    }
}

