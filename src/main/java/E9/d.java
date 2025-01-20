package e9;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.s0;

public final class d implements Adapter {
    public static final d a;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((s0)object0), "value");
        jsonWriter0.name("lng");
        Adapters.DoubleAdapter.toJson(jsonWriter0, customScalarAdapters0, ((double)((s0)object0).a));
        jsonWriter0.name("lat");
        Adapters.DoubleAdapter.toJson(jsonWriter0, customScalarAdapters0, ((double)((s0)object0).b));
        Optional optional0 = ((s0)object0).c;
        if(optional0 instanceof Present) {
            jsonWriter0.name("provider");
            Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        Optional optional1 = ((s0)object0).d;
        if(optional1 instanceof Present) {
            jsonWriter0.name("accuracy");
            Adapters.-present(Adapters.NullableDoubleAdapter).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional1));
        }
    }
}

