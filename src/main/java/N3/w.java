package N3;

import Ab.t;
import Fb.j;
import U3.b;
import W5.f;
import com.apollographql.apollo.api.ApolloResponse;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

public final class w extends j implements Function2 {
    public Object c0;
    public final Nb.w d0;

    public w(Nb.w w0, g g0) {
        this.d0 = w0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        ((w)this.t(((ApolloResponse)object0), ((g)object1))).v(t.a);
        return t.a;
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new w(this.d0, g0);
        g1.c0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        f.b0(object0);
        b b0 = ((ApolloResponse)this.c0).exception;
        if(b0 != null) {
            Nb.w w0 = this.d0;
            if(w0.X == null) {
                w0.X = b0;
            }
        }
        return t.a;
    }
}

