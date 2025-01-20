package Z8;

import Bb.q;
import Nb.j;
import Y8.e;
import Y8.f;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class d implements Adapter {
    public static final d a;
    public static final List b;

    static {
        d.a = new d();  // initializer: Ljava/lang/Object;-><init>()V
        d.b = q.K("acknowledgePricePromoBottomSheet");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        e e0;
        for(e0 = null; jsonReader0.selectName(d.b) == 0; e0 = (e)Adapters.-nullable(Adapters.-obj$default(c.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new f(e0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((f)object0), "value");
        jsonWriter0.name("acknowledgePricePromoBottomSheet");
        Adapters.-nullable(Adapters.-obj$default(c.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((f)object0).a);
    }
}

