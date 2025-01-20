package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.s7;
import Y8.t7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class l4 implements Adapter {
    public static final l4 a;
    public static final List b;

    static {
        l4.a = new l4();  // initializer: Ljava/lang/Object;-><init>()V
        l4.b = q.L(new String[]{"succeeded", "user"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        t7 t70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(l4.b)) {
                case 0: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    t70 = (t7)Adapters.-obj(m4.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "succeeded");
        }
        boolean z = boolean0.booleanValue();
        if(t70 == null) {
            throw o.q(jsonReader0, "user");
        }
        return new s7(z, t70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((s7)object0), "value");
        jsonWriter0.name("succeeded");
        o.E(((s7)object0).a, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "user");
        Adapters.-obj(m4.a, true).toJson(jsonWriter0, customScalarAdapters0, ((s7)object0).b);
    }
}

