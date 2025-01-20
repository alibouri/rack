package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.x8;
import Y8.z8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class d5 implements Adapter {
    public static final d5 a;
    public static final List b;

    static {
        d5.a = new d5();  // initializer: Ljava/lang/Object;-><init>()V
        d5.b = q.K("transfer");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        z8 z80;
        for(z80 = null; jsonReader0.selectName(d5.b) == 0; z80 = (z8)Adapters.-obj$default(f5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(z80 == null) {
            throw o.q(jsonReader0, "transfer");
        }
        return new x8(z80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((x8)object0), "value");
        jsonWriter0.name("transfer");
        Adapters.-obj$default(f5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((x8)object0).a);
    }
}

