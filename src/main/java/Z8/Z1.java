package Z8;

import Bb.q;
import Nb.j;
import Y8.c3;
import Y8.e3;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class z1 implements Adapter {
    public static final z1 a;
    public static final List b;

    static {
        z1.a = new z1();  // initializer: Ljava/lang/Object;-><init>()V
        z1.b = q.L(new String[]{"id", "historyEntry"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        c3 c30 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(z1.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    c30 = (c3)Adapters.-nullable(Adapters.-obj(x1.a, true)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new e3(s, c30);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((e3)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((e3)object0).a);
        jsonWriter0.name("historyEntry");
        Adapters.-nullable(Adapters.-obj(x1.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((e3)object0).b);
    }
}

