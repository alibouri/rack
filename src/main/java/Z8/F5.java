package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.y8;
import Y8.z8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class f5 implements Adapter {
    public static final f5 a;
    public static final List b;

    static {
        f5.a = new f5();  // initializer: Ljava/lang/Object;-><init>()V
        f5.b = q.L(new String[]{"id", "state"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        y8 y80 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(f5.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    y80 = (y8)Adapters.-obj(e5.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(y80 == null) {
            throw o.q(jsonReader0, "state");
        }
        return new z8(s, y80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((z8)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((z8)object0).a);
        jsonWriter0.name("state");
        Adapters.-obj(e5.a, true).toJson(jsonWriter0, customScalarAdapters0, ((z8)object0).b);
    }
}

