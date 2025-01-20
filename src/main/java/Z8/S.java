package Z8;

import Bb.q;
import Nb.j;
import Y8.B;
import Y8.C;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class s implements Adapter {
    public static final s a;
    public static final List b;

    static {
        s.a = new s();  // initializer: Ljava/lang/Object;-><init>()V
        s.b = q.L(new String[]{"id", "user"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        C c0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(s.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    c0 = (C)Adapters.-obj$default(t.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
        if(c0 == null) {
            throw o.q(jsonReader0, "user");
        }
        return new B(s, c0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((B)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((B)object0).a);
        jsonWriter0.name("user");
        Adapters.-obj$default(t.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((B)object0).b);
    }
}

