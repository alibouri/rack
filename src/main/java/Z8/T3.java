package Z8;

import Bb.q;
import Nb.j;
import Y8.L5;
import Y8.M5;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class t3 implements Adapter {
    public static final t3 a;
    public static final List b;

    static {
        t3.a = new t3();  // initializer: Ljava/lang/Object;-><init>()V
        t3.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        M5 m50;
        for(m50 = null; jsonReader0.selectName(t3.b) == 0; m50 = (M5)Adapters.-obj(u3.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(m50 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new L5(m50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((L5)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj(u3.a, true).toJson(jsonWriter0, customScalarAdapters0, ((L5)object0).a);
    }
}

