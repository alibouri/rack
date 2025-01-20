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
import d9.U4;

public final class k implements Adapter {
    public static final k a;

    static {
        k.a = new k();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((U4)object0), "value");
        jsonWriter0.name("appCallSid");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((U4)object0).a);
        jsonWriter0.name("loggedInMobile");
        Adapters.-present(Adapters.NullableStringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((U4)object0).b);
        Optional optional0 = ((U4)object0).c;
        if(optional0 instanceof Present) {
            jsonWriter0.name("callState");
            Adapters.-present(Adapters.-nullable(a.e)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        jsonWriter0.name("network");
        Adapters.-obj$default(l.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((U4)object0).d);
    }
}

