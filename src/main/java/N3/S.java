package N3;

import N2.l;
import Nb.j;
import V3.a;
import V3.b;
import ac.h;
import com.apollographql.apollo.api.ApolloRequest;

public final class s implements a {
    @Override  // V3.a
    public final h a(ApolloRequest apolloRequest0, b b0) {
        j.f(apolloRequest0, "request");
        return new l(new r(b0, apolloRequest0, null));
    }
}

