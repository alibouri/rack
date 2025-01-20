package Z8;

import Bb.q;
import Nb.j;
import Y8.h4;
import Y8.i4;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class c2 implements Adapter {
    public static final c2 a;
    public static final List b;

    static {
        c2.a = new c2();  // initializer: Ljava/lang/Object;-><init>()V
        c2.b = q.L(new String[]{"id", "user"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        i4 i40 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(c2.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    i40 = (i4)Adapters.-obj(d2.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(i40 == null) {
            throw o.q(jsonReader0, "user");
        }
        return new h4(s, i40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((h4)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((h4)object0).a);
        jsonWriter0.name("user");
        Adapters.-obj(d2.a, true).toJson(jsonWriter0, customScalarAdapters0, ((h4)object0).b);
    }
}

