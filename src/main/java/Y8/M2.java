package Y8;

import Nb.j;
import com.apollographql.apollo.api.Query.Data;
import com.sendwave.backend.FragmentHandle;
import com.sendwave.backend.ParcelableVariables;

public final class m2 implements o2, Data {
    public final com.apollographql.apollo.api.Fragment.Data a;
    public final ParcelableVariables b;

    public m2(com.apollographql.apollo.api.Fragment.Data fragment$Data0, ParcelableVariables parcelableVariables0) {
        j.f(fragment$Data0, "fragment");
        j.f(parcelableVariables0, "variables");
        super();
        this.a = fragment$Data0;
        this.b = parcelableVariables0;
    }

    @Override  // Y8.o2
    public final FragmentHandle a(com.apollographql.apollo.api.Fragment.Data fragment$Data0) {
        j.f(fragment$Data0, "fragment");
        return new FragmentHandle(S6.c(fragment$Data0).a, this.b);
    }
}

