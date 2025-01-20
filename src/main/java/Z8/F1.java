package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.w2;
import Y8.x2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class f1 implements Adapter {
    public static final f1 a;
    public static final List b;

    static {
        f1.a = new f1();  // initializer: Ljava/lang/Object;-><init>()V
        f1.b = q.K("questionForm");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        x2 x20;
        for(x20 = null; jsonReader0.selectName(f1.b) == 0; x20 = (x2)Adapters.-obj(g1.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(x20 == null) {
            throw o.q(jsonReader0, "questionForm");
        }
        return new w2(x20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((w2)object0), "value");
        jsonWriter0.name("questionForm");
        Adapters.-obj(g1.a, true).toJson(jsonWriter0, customScalarAdapters0, ((w2)object0).a);
    }
}

