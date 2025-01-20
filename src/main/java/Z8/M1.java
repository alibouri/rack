package Z8;

import Bb.q;
import Nb.j;
import Y8.F2;
import Y8.G2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class m1 implements Adapter {
    public static final m1 a;
    public static final List b;

    static {
        m1.a = new m1();  // initializer: Ljava/lang/Object;-><init>()V
        m1.b = q.K("getBillTypePromotionInfo");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        G2 g20;
        for(g20 = null; jsonReader0.selectName(m1.b) == 0; g20 = (G2)Adapters.-nullable(Adapters.-obj$default(n1.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new F2(g20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((F2)object0), "value");
        jsonWriter0.name("getBillTypePromotionInfo");
        Adapters.-nullable(Adapters.-obj$default(n1.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((F2)object0).a);
    }
}

