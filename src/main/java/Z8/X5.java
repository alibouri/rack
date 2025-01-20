package Z8;

import Bb.q;
import Nb.j;
import Y8.Y8;
import Y8.Z8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class x5 implements Adapter {
    public static final x5 a;
    public static final List b;

    static {
        x5.a = new x5();  // initializer: Ljava/lang/Object;-><init>()V
        x5.b = q.K("termsAndConditions");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Z8 z80;
        for(z80 = null; jsonReader0.selectName(x5.b) == 0; z80 = (Z8)Adapters.-obj$default(y5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(z80 == null) {
            throw o.q(jsonReader0, "termsAndConditions");
        }
        return new Y8(z80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Y8)object0), "value");
        jsonWriter0.name("termsAndConditions");
        Adapters.-obj$default(y5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((Y8)object0).a);
    }
}

