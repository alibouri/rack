package Z8;

import Bb.q;
import Nb.j;
import Y8.A2;
import Y8.D2;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class i1 implements Adapter {
    public static final i1 a;
    public static final List b;

    static {
        i1.a = new i1();  // initializer: Ljava/lang/Object;-><init>()V
        i1.b = q.L(new String[]{"__typename", "response"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        D2 d20 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(i1.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    d20 = (D2)Adapters.-nullable(Adapters.-obj(l1.a, true)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new A2(s, d20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((A2)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((A2)object0).a);
        jsonWriter0.name("response");
        Adapters.-nullable(Adapters.-obj(l1.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((A2)object0).b);
    }
}

