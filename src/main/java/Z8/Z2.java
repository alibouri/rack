package Z8;

import Bb.q;
import Nb.j;
import Y8.H4;
import Y8.J4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class z2 implements Adapter {
    public static final z2 a;
    public static final List b;

    static {
        z2.a = new z2();  // initializer: Ljava/lang/Object;-><init>()V
        z2.b = q.K("payMerchant");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        J4 j40;
        for(j40 = null; jsonReader0.selectName(z2.b) == 0; j40 = (J4)Adapters.-nullable(Adapters.-obj$default(B2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new H4(j40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((H4)object0), "value");
        jsonWriter0.name("payMerchant");
        Adapters.-nullable(Adapters.-obj$default(B2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((H4)object0).a);
    }
}

