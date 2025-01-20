package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class b9 implements Adapter {
    public static final b9 a;
    public static final List b;

    static {
        b9.a = new b9();  // initializer: Ljava/lang/Object;-><init>()V
        b9.b = q.K("sendMoneyScreen");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        P8 p80;
        for(p80 = null; jsonReader0.selectName(b9.b) == 0; p80 = (P8)Adapters.-obj$default(Y8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(p80 == null) {
            throw o.q(jsonReader0, "sendMoneyScreen");
        }
        return new S8(p80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((S8)object0), "value");
        jsonWriter0.name("sendMoneyScreen");
        Adapters.-obj$default(Y8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((S8)object0).a);
    }
}

