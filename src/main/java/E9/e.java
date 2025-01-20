package e9;

import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;

public final class e implements Adapter {
    public static final e a;

    static {
        e.a = new e();  // initializer: Ljava/lang/Object;-><init>()V
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        throw o.v(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters", "Input type used in output position");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        if(object0 != null) {
            throw new ClassCastException();
        }
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(null, "value");
        throw null;
    }
}

