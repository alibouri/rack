package Z8;

import Bb.q;
import Nb.j;
import Y8.a0;
import Y8.c0;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class w implements Adapter {
    public static final w a;
    public static final List b;

    static {
        w.a = new w();  // initializer: Ljava/lang/Object;-><init>()V
        w.b = q.K("billConfirmationPolling");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        a0 a00;
        for(a00 = null; jsonReader0.selectName(w.b) == 0; a00 = (a0)Adapters.-obj(u.a, true).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(a00 == null) {
            throw o.q(jsonReader0, "billConfirmationPolling");
        }
        return new c0(a00);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((c0)object0), "value");
        jsonWriter0.name("billConfirmationPolling");
        Adapters.-obj(u.a, true).toJson(jsonWriter0, customScalarAdapters0, ((c0)object0).a);
    }
}

