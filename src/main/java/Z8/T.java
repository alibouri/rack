package Z8;

import Bb.q;
import Nb.j;
import Y8.C;
import Y8.o;
import Y8.y;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class t implements Adapter {
    public static final t a;
    public static final List b;

    static {
        t.a = new t();  // initializer: Ljava/lang/Object;-><init>()V
        t.b = q.L(new String[]{"id", "appProps"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        y y0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(t.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    y0 = (y)Adapters.-obj$default(p.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
        if(y0 == null) {
            throw o.q(jsonReader0, "appProps");
        }
        return new C(s, y0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((C)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((C)object0).a);
        jsonWriter0.name("appProps");
        Adapters.-obj$default(p.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((C)object0).b);
    }
}

