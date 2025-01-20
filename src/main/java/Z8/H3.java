package Z8;

import Bb.q;
import Nb.j;
import Y8.w5;
import Y8.y5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class h3 implements Adapter {
    public static final h3 a;
    public static final List b;

    static {
        h3.a = new h3();  // initializer: Ljava/lang/Object;-><init>()V
        h3.b = q.K("renewPaymentCard");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        y5 y50;
        for(y50 = null; jsonReader0.selectName(h3.b) == 0; y50 = (y5)Adapters.-nullable(Adapters.-obj$default(j3.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new w5(y50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((w5)object0), "value");
        jsonWriter0.name("renewPaymentCard");
        Adapters.-nullable(Adapters.-obj$default(j3.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((w5)object0).a);
    }
}

