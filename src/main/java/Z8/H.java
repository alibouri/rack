package Z8;

import Bb.q;
import Nb.j;
import Y8.l;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class h implements Adapter {
    public static final h a;
    public static final List b;

    static {
        h.a = new h();  // initializer: Ljava/lang/Object;-><init>()V
        h.b = q.L(new String[]{"id", "mobile", "name", "city", "subcity"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(h.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s3 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    s4 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(s1 == null) {
            throw o.q(jsonReader0, "mobile");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "name");
        }
        if(s3 == null) {
            throw o.q(jsonReader0, "city");
        }
        if(s4 == null) {
            throw o.q(jsonReader0, "subcity");
        }
        return new l(s, s1, s2, s3, s4);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((l)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((l)object0).a);
        jsonWriter0.name("mobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((l)object0).b);
        jsonWriter0.name("name");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((l)object0).c);
        jsonWriter0.name("city");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((l)object0).d);
        jsonWriter0.name("subcity");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((l)object0).e);
    }
}

