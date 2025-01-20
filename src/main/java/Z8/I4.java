package Z8;

import Bb.q;
import Nb.j;
import Y8.o7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class i4 implements Adapter {
    public static final i4 a;
    public static final List b;

    static {
        i4.a = new i4();  // initializer: Ljava/lang/Object;-><init>()V
        i4.b = q.K("acknowledged");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0;
        for(boolean0 = null; jsonReader0.selectName(i4.b) == 0; boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "acknowledged");
        }
        return new o7(boolean0.booleanValue());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((o7)object0), "value");
        jsonWriter0.name("acknowledged");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((o7)object0).a));
    }
}

