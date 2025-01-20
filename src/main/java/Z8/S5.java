package Z8;

import Bb.q;
import Nb.j;
import Y8.R8;
import Y8.S8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class s5 implements Adapter {
    public static final s5 a;
    public static final List b;

    static {
        s5.a = new s5();  // initializer: Ljava/lang/Object;-><init>()V
        s5.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        S8 s80;
        for(s80 = null; jsonReader0.selectName(s5.b) == 0; s80 = (S8)Adapters.-obj$default(t5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s80 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new R8(s80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((R8)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj$default(t5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((R8)object0).a);
    }
}

