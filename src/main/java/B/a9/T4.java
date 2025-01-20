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

public final class t4 implements Adapter {
    public static final t4 a;
    public static final List b;

    static {
        t4.a = new t4();  // initializer: Ljava/lang/Object;-><init>()V
        t4.b = q.L(new String[]{"cursor", "node"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        s4 s40 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(t4.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s40 = (s4)Adapters.-obj(v4.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "cursor");
        }
        if(s40 == null) {
            throw o.q(jsonReader0, "node");
        }
        return new q4(s, s40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((q4)object0), "value");
        jsonWriter0.name("cursor");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((q4)object0).a);
        jsonWriter0.name("node");
        Adapters.-obj(v4.a, true).toJson(jsonWriter0, customScalarAdapters0, ((q4)object0).b);
    }
}

