package Z8;

import Bb.q;
import Nb.j;
import Y8.h7;
import Y8.i7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class d4 implements Adapter {
    public static final d4 a;
    public static final List b;

    static {
        d4.a = new d4();  // initializer: Ljava/lang/Object;-><init>()V
        d4.b = q.K("token");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        i7 i70;
        for(i70 = null; jsonReader0.selectName(d4.b) == 0; i70 = (i7)Adapters.-obj(e4.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(i70 == null) {
            throw o.q(jsonReader0, "token");
        }
        return new h7(i70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((h7)object0), "value");
        jsonWriter0.name("token");
        Adapters.-obj(e4.a, true).toJson(jsonWriter0, customScalarAdapters0, ((h7)object0).a);
    }
}

