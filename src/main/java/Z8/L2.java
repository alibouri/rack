package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.r4;
import Y8.v4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class l2 implements Adapter {
    public static final l2 a;
    public static final List b;

    static {
        l2.a = new l2();  // initializer: Ljava/lang/Object;-><init>()V
        l2.b = q.L(new String[]{"__typename", "response", "responses"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        v4 v40 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(l2.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    v40 = (v4)Adapters.-obj(p2.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj(o2.a, true))).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(v40 == null) {
            throw o.q(jsonReader0, "response");
        }
        return new r4(s, v40, list0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((r4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((r4)object0).a);
        jsonWriter0.name("response");
        Adapters.-obj(p2.a, true).toJson(jsonWriter0, customScalarAdapters0, ((r4)object0).b);
        jsonWriter0.name("responses");
        Adapters.-nullable(Adapters.-list(Adapters.-obj(o2.a, true))).toJson(jsonWriter0, customScalarAdapters0, ((r4)object0).c);
    }
}

