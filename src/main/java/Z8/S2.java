package Z8;

import Bb.q;
import Nb.j;
import Y8.k4;
import Y8.l4;
import Y8.o;
import Y8.y4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class s2 implements Adapter {
    public static final s2 a;
    public static final List b;

    static {
        s2.a = new s2();  // initializer: Ljava/lang/Object;-><init>()V
        s2.b = q.L(new String[]{"id", "appProps", "customerAnnouncements"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        k4 k40 = null;
        l4 l40 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(s2.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    k40 = (k4)Adapters.-obj$default(e2.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    l40 = (l4)Adapters.-obj(f2.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(k40 == null) {
            throw o.q(jsonReader0, "appProps");
        }
        if(l40 == null) {
            throw o.q(jsonReader0, "customerAnnouncements");
        }
        return new y4(s, k40, l40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((y4)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((y4)object0).a);
        jsonWriter0.name("appProps");
        Adapters.-obj$default(e2.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((y4)object0).b);
        jsonWriter0.name("customerAnnouncements");
        Adapters.-obj(f2.a, true).toJson(jsonWriter0, customScalarAdapters0, ((y4)object0).c);
    }
}

