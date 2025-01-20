package Z8;

import Bb.q;
import Nb.j;
import Y8.r5;
import Y8.t5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class d3 implements Adapter {
    public static final d3 a;
    public static final List b;

    static {
        d3.a = new d3();  // initializer: Ljava/lang/Object;-><init>()V
        d3.b = q.K("pausePaymentCard");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        t5 t50;
        for(t50 = null; jsonReader0.selectName(d3.b) == 0; t50 = (t5)Adapters.-nullable(Adapters.-obj$default(f3.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new r5(t50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((r5)object0), "value");
        jsonWriter0.name("pausePaymentCard");
        Adapters.-nullable(Adapters.-obj$default(f3.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((r5)object0).a);
    }
}

