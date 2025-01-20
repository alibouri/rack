package a9;

import Bb.q;
import Nb.j;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class x6 implements Adapter {
    public static final x6 a;
    public static final List b;

    static {
        x6.a = new x6();  // initializer: Ljava/lang/Object;-><init>()V
        x6.b = q.K("lockedVaultFeatureEnabled");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0;
        for(boolean0 = null; jsonReader0.selectName(x6.b) == 0; boolean0 = (Boolean)Adapters.NullableBooleanAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new s6(boolean0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((s6)object0), "value");
        jsonWriter0.name("lockedVaultFeatureEnabled");
        Adapters.NullableBooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, ((s6)object0).a);
    }
}

