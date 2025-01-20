package Z8;

import Bb.q;
import Nb.j;
import Y8.N9;
import Y8.O9;
import Y8.P9;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class a6 implements Adapter {
    public static final a6 a;
    public static final List b;

    static {
        a6.a = new a6();  // initializer: Ljava/lang/Object;-><init>()V
        a6.b = q.L(new String[]{"id", "wallet", "user"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        P9 p90 = null;
        O9 o90 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(a6.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    p90 = (P9)Adapters.-obj(c6.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    o90 = (O9)Adapters.-obj$default(b6.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
        if(p90 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        if(o90 == null) {
            throw o.q(jsonReader0, "user");
        }
        return new N9(s, p90, o90);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((N9)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((N9)object0).a);
        jsonWriter0.name("wallet");
        Adapters.-obj(c6.a, true).toJson(jsonWriter0, customScalarAdapters0, ((N9)object0).b);
        jsonWriter0.name("user");
        Adapters.-obj$default(b6.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((N9)object0).c);
    }
}

