package Z8;

import Bb.q;
import Nb.j;
import Y8.b0;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class v implements Adapter {
    public static final v a;
    public static final List b;

    static {
        v.a = new v();  // initializer: Ljava/lang/Object;-><init>()V
        v.b = q.L(new String[]{"name", "value"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(v.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
            throw o.q(jsonReader0, "value");
        }
        return new b0(s, s1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((b0)object0), "value");
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((b0)object0).a);
        jsonWriter0.name("value");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((b0)object0).b);
    }
}

