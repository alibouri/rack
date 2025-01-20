package Z8;

import Bb.q;
import Nb.j;
import Y8.Q0;
import Y8.V0;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class f0 implements Adapter {
    public static final f0 a;
    public static final List b;

    static {
        f0.a = new f0();  // initializer: Ljava/lang/Object;-><init>()V
        f0.b = q.L(new String[]{"id", "customerHistoryConnection"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        Q0 q00 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(f0.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    q00 = (Q0)Adapters.-obj$default(a0.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
        if(q00 == null) {
            throw o.q(jsonReader0, "customerHistoryConnection");
        }
        return new V0(s, q00);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((V0)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((V0)object0).a);
        jsonWriter0.name("customerHistoryConnection");
        Adapters.-obj$default(a0.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((V0)object0).b);
    }
}

