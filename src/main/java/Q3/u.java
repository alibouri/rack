package Q3;

import Eb.a;
import Ha.S;
import Nb.w;
import V3.b;
import ac.h;
import ac.i;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.CustomScalarAdapters;
import kotlin.coroutines.g;

public final class u implements h {
    public final S X;
    public final ApolloRequest Y;
    public final b Z;
    public final w b0;
    public final x c0;
    public final CustomScalarAdapters d0;

    public u(S s0, ApolloRequest apolloRequest0, b b0, w w0, x x0, CustomScalarAdapters customScalarAdapters0) {
        this.X = s0;
        this.Y = apolloRequest0;
        this.Z = b0;
        this.b0 = w0;
        this.c0 = x0;
        this.d0 = customScalarAdapters0;
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        t t0 = new t(i0, this.Y, this.Z, this.b0, this.c0, this.d0, 0);
        Object object0 = this.X.d(t0, g0);
        return object0 == a.X ? object0 : Ab.t.a;
    }
}

