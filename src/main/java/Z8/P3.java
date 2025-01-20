package Z8;

import Bb.q;
import Nb.j;
import Y8.G5;
import Y8.J5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class p3 implements Adapter {
    public static final p3 a;
    public static final List b;

    static {
        p3.a = new p3();  // initializer: Ljava/lang/Object;-><init>()V
        p3.b = q.K("unpausePaymentCard");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        J5 j50;
        for(j50 = null; jsonReader0.selectName(p3.b) == 0; j50 = (J5)Adapters.-nullable(Adapters.-obj$default(s3.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new G5(j50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((G5)object0), "value");
        jsonWriter0.name("unpausePaymentCard");
        Adapters.-nullable(Adapters.-obj$default(s3.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((G5)object0).a);
    }
}

