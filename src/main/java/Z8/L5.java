package Z8;

import Bb.q;
import Nb.j;
import Y8.I8;
import Y8.L8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class l5 implements Adapter {
    public static final l5 a;
    public static final List b;

    static {
        l5.a = new l5();  // initializer: Ljava/lang/Object;-><init>()V
        l5.b = q.K("supportCallType");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        L8 l80;
        for(l80 = null; jsonReader0.selectName(l5.b) == 0; l80 = (L8)Adapters.-obj(o5.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(l80 == null) {
            throw o.q(jsonReader0, "supportCallType");
        }
        return new I8(l80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((I8)object0), "value");
        jsonWriter0.name("supportCallType");
        Adapters.-obj(o5.a, true).toJson(jsonWriter0, customScalarAdapters0, ((I8)object0).a);
    }
}

