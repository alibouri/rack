package Z8;

import Bb.q;
import Nb.j;
import Y8.b9;
import Y8.c9;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class z5 implements Adapter {
    public static final z5 a;
    public static final List b;

    static {
        z5.a = new z5();  // initializer: Ljava/lang/Object;-><init>()V
        z5.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        c9 c90;
        for(c90 = null; jsonReader0.selectName(z5.b) == 0; c90 = (c9)Adapters.-obj(A5.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(c90 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new b9(c90);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((b9)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj(A5.a, true).toJson(jsonWriter0, customScalarAdapters0, ((b9)object0).a);
    }
}

