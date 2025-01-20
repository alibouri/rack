package Y8;

import Nb.j;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Fragment.Data;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

public final class q2 implements Adapter {
    public final Adapter a;
    public final r2 b;

    public q2(Adapter adapter0, r2 r20) {
        this.a = adapter0;
        this.b = r20;
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return new m2(((Data)this.a.fromJson(jsonReader0, customScalarAdapters0)), this.b.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((m2)object0), "value");
        this.a.toJson(jsonWriter0, customScalarAdapters0, ((m2)object0).a);
    }
}

