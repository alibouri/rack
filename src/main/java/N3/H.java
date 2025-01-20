package N3;

import Nb.j;
import V3.a;
import V3.b;
import ac.w;
import com.apollographql.apollo.api.ApolloRequest;
import kotlin.jvm.functions.Function1;

public final class h implements a {
    public final Function1 a;

    public h(Function1 function10) {
        this.a = function10;
    }

    @Override  // V3.a
    public final ac.h a(ApolloRequest apolloRequest0, b b0) {
        j.f(apolloRequest0, "request");
        return new w(b0.a(apolloRequest0), new g(this, null), 4);
    }
}

