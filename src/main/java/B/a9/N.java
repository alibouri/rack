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

public final class n implements Adapter {
    public static final n a;
    public static final List b;

    static {
        n.a = new n();  // initializer: Ljava/lang/Object;-><init>()V
        n.b = q.L(new String[]{"title", "message", "imageUrl", "actions"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(n.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj$default(k.a, false, 1, null))).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "title");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "message");
        }
        return new d(s, s1, s2, list0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((d)object0), "value");
        jsonWriter0.name("title");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((d)object0).a);
        jsonWriter0.name("message");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((d)object0).b);
        jsonWriter0.name("imageUrl");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((d)object0).c);
        jsonWriter0.name("actions");
        Adapters.-nullable(Adapters.-list(Adapters.-obj$default(k.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, ((d)object0).d);
    }
}

