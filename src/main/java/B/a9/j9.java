package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class j9 implements Adapter {
    public static final j9 a;
    public static final List b;

    static {
        j9.a = new j9();  // initializer: Ljava/lang/Object;-><init>()V
        j9.b = q.L(new String[]{"id", "appProps"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        e9 e90 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(j9.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    e90 = (e9)Adapters.-obj$default(h9.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "id");
        }
        if(e90 == null) {
            throw o.q(jsonReader0, "appProps");
        }
        return new g9(s, e90);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((g9)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((g9)object0).a);
        jsonWriter0.name("appProps");
        Adapters.-obj$default(h9.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((g9)object0).b);
    }
}

