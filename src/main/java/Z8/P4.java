package Z8;

import Bb.q;
import Nb.j;
import Y8.x7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class p4 implements Adapter {
    public static final p4 a;
    public static final List b;

    static {
        p4.a = new p4();  // initializer: Ljava/lang/Object;-><init>()V
        p4.b = q.K("announcements");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0;
        for(list0 = null; jsonReader0.selectName(p4.b) == 0; list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-nullable(Adapters.-obj(n4.a, true)))).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new x7(list0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((x7)object0), "value");
        jsonWriter0.name("announcements");
        Adapters.-nullable(Adapters.-list(Adapters.-nullable(Adapters.-obj(n4.a, true)))).toJson(jsonWriter0, customScalarAdapters0, ((x7)object0).a);
    }
}

