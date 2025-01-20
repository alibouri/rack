package Z8;

import Bb.q;
import Nb.j;
import Y8.k4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class e2 implements Adapter {
    public static final e2 a;
    public static final List b;

    static {
        e2.a = new e2();  // initializer: Ljava/lang/Object;-><init>()V
        e2.b = q.K("receiptHistoryEntryIdForCieMigration");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(e2.b) == 0; s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new k4(s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((k4)object0), "value");
        jsonWriter0.name("receiptHistoryEntryIdForCieMigration");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k4)object0).a);
    }
}

