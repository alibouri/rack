package Z8;

import Bb.q;
import Nb.j;
import Y8.w7;
import Y8.x7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class o4 implements Adapter {
    public static final o4 a;
    public static final List b;

    static {
        o4.a = new o4();  // initializer: Ljava/lang/Object;-><init>()V
        o4.b = q.K("savePlayInstallReferrer");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        x7 x70;
        for(x70 = null; jsonReader0.selectName(o4.b) == 0; x70 = (x7)Adapters.-nullable(Adapters.-obj$default(p4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new w7(x70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((w7)object0), "value");
        jsonWriter0.name("savePlayInstallReferrer");
        Adapters.-nullable(Adapters.-obj$default(p4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((w7)object0).a);
    }
}

