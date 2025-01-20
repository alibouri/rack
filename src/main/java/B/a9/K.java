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

public final class k implements Adapter {
    public static final k a;
    public static final List b;

    static {
        k.a = new k();  // initializer: Ljava/lang/Object;-><init>()V
        k.b = q.L(new String[]{"name", "uri", "shareInfo"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        i i0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(k.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    i0 = (i)Adapters.-nullable(Adapters.-obj$default(s.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "name");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "uri");
        }
        return new a(s, s1, i0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((a)object0), "value");
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((a)object0).a);
        jsonWriter0.name("uri");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((a)object0).b);
        jsonWriter0.name("shareInfo");
        Adapters.-nullable(Adapters.-obj$default(s.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((a)object0).c);
    }
}

