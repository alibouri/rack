package Z8;

import Bb.q;
import Nb.j;
import Y8.A7;
import Y8.z7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class q4 implements Adapter {
    public static final q4 a;
    public static final List b;

    static {
        q4.a = new q4();  // initializer: Ljava/lang/Object;-><init>()V
        q4.b = q.K("savePushNotificationToken");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        A7 a70;
        for(a70 = null; jsonReader0.selectName(q4.b) == 0; a70 = (A7)Adapters.-nullable(Adapters.-obj$default(r4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new z7(a70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((z7)object0), "value");
        jsonWriter0.name("savePushNotificationToken");
        Adapters.-nullable(Adapters.-obj$default(r4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((z7)object0).a);
    }
}

