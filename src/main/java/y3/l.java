package Y3;

import Ab.t;
import Eb.a;
import Nb.w;
import ac.h;
import ac.i;
import ac.u;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Operation;
import kotlin.coroutines.g;

public final class l implements h {
    public final u X;
    public final Operation Y;
    public final CustomScalarAdapters Z;
    public final n b0;
    public final w c0;

    public l(u u0, Operation operation0, CustomScalarAdapters customScalarAdapters0, n n0, w w0) {
        this.X = u0;
        this.Y = operation0;
        this.Z = customScalarAdapters0;
        this.b0 = n0;
        this.c0 = w0;
    }

    @Override  // ac.h
    public final Object d(i i0, g g0) {
        k k0 = new k(i0, this.Y, this.Z, this.b0, this.c0);
        Object object0 = this.X.d(k0, g0);
        return object0 == a.X ? object0 : t.a;
    }
}

