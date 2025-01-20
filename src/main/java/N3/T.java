package N3;

import Nb.j;
import V3.a;
import V3.b;
import ac.h;
import com.apollographql.apollo.api.ApolloRequest.Builder;
import com.apollographql.apollo.api.ApolloRequest;

public final class t implements a {
    @Override  // V3.a
    public final h a(ApolloRequest apolloRequest0, b b0) {
        j.f(apolloRequest0, "request");
        Builder apolloRequest$Builder0 = apolloRequest0.newBuilder();
        I.b(apolloRequest$Builder0);
        return b0.a(apolloRequest$Builder0.build());
    }
}

