package Z8;

import Bb.q;
import Nb.j;
import Y8.d3;
import Y8.e3;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class y1 implements Adapter {
    public static final y1 a;
    public static final List b;

    static {
        y1.a = new y1();  // initializer: Ljava/lang/Object;-><init>()V
        y1.b = q.L(new String[]{"id", "wallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        e3 e30 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(y1.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    e30 = (e3)Adapters.-obj$default(z1.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
        if(e30 == null) {
            throw o.q(jsonReader0, "wallet");
        }
        return new d3(s, e30);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((d3)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((d3)object0).a);
        jsonWriter0.name("wallet");
        Adapters.-obj$default(z1.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((d3)object0).b);
    }
}

