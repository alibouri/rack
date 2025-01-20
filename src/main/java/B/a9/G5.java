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

public final class g5 implements Adapter {
    public static final g5 a;
    public static final List b;

    static {
        g5.a = new g5();  // initializer: Ljava/lang/Object;-><init>()V
        g5.b = q.L(new String[]{"icon", "text"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(g5.b)) {
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
            throw o.q(jsonReader0, "icon");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "text");
        }
        return new X4(s, s1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((X4)object0), "value");
        jsonWriter0.name("icon");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((X4)object0).a);
        jsonWriter0.name("text");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((X4)object0).b);
    }
}

