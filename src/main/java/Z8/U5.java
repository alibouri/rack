package Z8;

import Bb.q;
import Nb.j;
import Y8.T8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class u5 implements Adapter {
    public static final u5 a;
    public static final List b;

    static {
        u5.a = new u5();  // initializer: Ljava/lang/Object;-><init>()V
        u5.b = q.K("supportNumber");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(u5.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw o.q(jsonReader0, "supportNumber");
        }
        return new T8(s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((T8)object0), "value");
        jsonWriter0.name("supportNumber");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((T8)object0).a);
    }
}

