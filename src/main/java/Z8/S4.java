package Z8;

import Bb.q;
import Nb.j;
import Y8.C7;
import Y8.D7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class s4 implements Adapter {
    public static final s4 a;
    public static final List b;

    static {
        s4.a = new s4();  // initializer: Ljava/lang/Object;-><init>()V
        s4.b = q.K("session");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        D7 d70;
        for(d70 = null; jsonReader0.selectName(s4.b) == 0; d70 = (D7)Adapters.-obj(t4.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(d70 == null) {
            throw o.q(jsonReader0, "session");
        }
        return new C7(d70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((C7)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj(t4.a, true).toJson(jsonWriter0, customScalarAdapters0, ((C7)object0).a);
    }
}

