package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.r1;
import Y8.s1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class x0 implements Adapter {
    public static final x0 a;
    public static final List b;

    static {
        x0.a = new x0();  // initializer: Ljava/lang/Object;-><init>()V
        x0.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        r1 r10;
        for(r10 = null; jsonReader0.selectName(x0.b) == 0; r10 = (r1)Adapters.-obj(w0.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(r10 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new s1(r10);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((s1)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj(w0.a, true).toJson(jsonWriter0, customScalarAdapters0, ((s1)object0).a);
    }
}

