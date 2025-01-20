package Z8;

import Bb.q;
import Nb.j;
import Y8.R5;
import Y8.U5;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class x3 implements Adapter {
    public static final x3 a;
    public static final List b;

    static {
        x3.a = new x3();  // initializer: Ljava/lang/Object;-><init>()V
        x3.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        U5 u50;
        for(u50 = null; jsonReader0.selectName(x3.b) == 0; u50 = (U5)Adapters.-obj$default(A3.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(u50 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new R5(u50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((R5)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj$default(A3.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((R5)object0).a);
    }
}

