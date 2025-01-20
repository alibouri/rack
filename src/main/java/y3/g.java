package Y3;

import Fb.c;
import com.apollographql.apollo.api.http.HttpRequest;
import java.util.ArrayList;

public final class g implements e {
    public final ArrayList a;

    public g(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    @Override  // Y3.e
    public final Object a(HttpRequest httpRequest0, a a0, c c0) {
        return a0.b(HttpRequest.newBuilder$default(httpRequest0, null, null, 3, null).addHeaders(this.a).build(), c0);
    }
}

