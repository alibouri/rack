package Z8;

import Bb.q;
import Nb.j;
import Y8.T5;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class z3 implements Adapter {
    public static final z3 a;
    public static final List b;

    static {
        z3.a = new z3();  // initializer: Ljava/lang/Object;-><init>()V
        z3.b = q.K("edges");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0;
        for(list0 = null; jsonReader0.selectName(z3.b) == 0; list0 = Adapters.-list(Adapters.-obj(y3.a, true)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "edges");
        }
        return new T5(list0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((T5)object0), "value");
        jsonWriter0.name("edges");
        Adapters.-list(Adapters.-obj(y3.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((T5)object0).a);
    }
}

