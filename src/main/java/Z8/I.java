package Z8;

import Bb.q;
import Nb.j;
import Y8.m;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class i implements Adapter {
    public static final i a;
    public static final List b;

    static {
        i.a = new i();  // initializer: Ljava/lang/Object;-><init>()V
        i.b = q.K("agentList2");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0;
        for(list0 = null; jsonReader0.selectName(i.b) == 0; list0 = Adapters.-list(Adapters.-obj$default(h.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "agentList2");
        }
        return new m(list0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((m)object0), "value");
        jsonWriter0.name("agentList2");
        Adapters.-list(Adapters.-obj$default(h.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((m)object0).a);
    }
}

