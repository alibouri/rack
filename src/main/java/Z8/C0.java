package Z8;

import Bb.q;
import Nb.j;
import Y8.S0;
import Y8.U0;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class c0 implements Adapter {
    public static final c0 a;
    public static final List b;

    static {
        c0.a = new c0();  // initializer: Ljava/lang/Object;-><init>()V
        c0.b = q.L(new String[]{"cursor", "node"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        U0 u00 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(c0.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    u00 = (U0)Adapters.-obj(e0.a, true).fromJson(jsonReader0, customScalarAdapters0);
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
        if(u00 == null) {
            throw o.q(jsonReader0, "node");
        }
        return new S0(s, u00);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((S0)object0), "value");
        jsonWriter0.name("cursor");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((S0)object0).a);
        jsonWriter0.name("node");
        Adapters.-obj(e0.a, true).toJson(jsonWriter0, customScalarAdapters0, ((S0)object0).b);
    }
}

