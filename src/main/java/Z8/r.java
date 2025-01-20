package Z8;

import Bb.q;
import Nb.j;
import Y8.A;
import Y8.B;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class r implements Adapter {
    public static final r a;
    public static final List b;

    static {
        r.a = new r();  // initializer: Ljava/lang/Object;-><init>()V
        r.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        B b0;
        for(b0 = null; jsonReader0.selectName(r.b) == 0; b0 = (B)Adapters.-obj$default(s.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(b0 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new A(b0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((A)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj$default(s.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((A)object0).a);
    }
}

