package Z8;

import Bb.q;
import Nb.j;
import Y8.g7;
import Y8.h7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class c4 implements Adapter {
    public static final c4 a;
    public static final List b;

    static {
        c4.a = new c4();  // initializer: Ljava/lang/Object;-><init>()V
        c4.b = q.K("resendSMS");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        h7 h70;
        for(h70 = null; jsonReader0.selectName(c4.b) == 0; h70 = (h7)Adapters.-nullable(Adapters.-obj$default(d4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new g7(h70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((g7)object0), "value");
        jsonWriter0.name("resendSMS");
        Adapters.-nullable(Adapters.-obj$default(d4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((g7)object0).a);
    }
}

