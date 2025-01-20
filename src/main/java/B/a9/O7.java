package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class o7 implements Adapter {
    public static final o7 a;
    public static final List b;

    static {
        o7.a = new o7();  // initializer: Ljava/lang/Object;-><init>()V
        o7.b = q.K("edges");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0;
        for(list0 = null; jsonReader0.selectName(o7.b) == 0; list0 = Adapters.-list(Adapters.-obj$default(i7.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "edges");
        }
        return new W6(list0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((W6)object0), "value");
        jsonWriter0.name("edges");
        Adapters.-list(Adapters.-obj$default(i7.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((W6)object0).a);
    }
}

