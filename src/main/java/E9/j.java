package e9;

import Y8.o;
import Y8.t0;
import Y8.v1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional.Present;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.J4;

public final class j implements Adapter {
    public static final j a;

    static {
        j.a = new j();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        Nb.j.f(jsonWriter0, "writer");
        Nb.j.f(customScalarAdapters0, "customScalarAdapters");
        Nb.j.f(((J4)object0), "value");
        jsonWriter0.name("principalAmount");
        t0 t00 = t0.c;
        t0.b(jsonWriter0, customScalarAdapters0, ((J4)object0).a);
        jsonWriter0.name("dueDate");
        v1.a.b(jsonWriter0, customScalarAdapters0, ((J4)object0).b);
        Optional optional0 = ((J4)object0).c;
        if(optional0 instanceof Present) {
            jsonWriter0.name("chargesAmount");
            Adapters.-present(Adapters.-nullable(t00)).toJson(jsonWriter0, customScalarAdapters0, ((Present)optional0));
        }
        jsonWriter0.name("setupFee");
        Adapters.-obj$default(h.c, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((J4)object0).d);
        jsonWriter0.name("lateFee");
        Adapters.-obj$default(h.c, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((J4)object0).e);
        jsonWriter0.name("interest");
        Adapters.-obj$default(h.c, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((J4)object0).f);
    }
}

