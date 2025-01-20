package Z8;

import Bb.q;
import Nb.j;
import Y8.m4;
import Y8.r4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class g2 implements Adapter {
    public static final g2 a;
    public static final List b;

    static {
        g2.a = new g2();  // initializer: Ljava/lang/Object;-><init>()V
        g2.b = q.K("payBill2");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        r4 r40;
        for(r40 = null; jsonReader0.selectName(g2.b) == 0; r40 = (r4)Adapters.-nullable(Adapters.-obj$default(l2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new m4(r40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((m4)object0), "value");
        jsonWriter0.name("payBill2");
        Adapters.-nullable(Adapters.-obj$default(l2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((m4)object0).a);
    }
}

