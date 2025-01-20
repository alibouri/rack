package Z8;

import Bb.q;
import Nb.j;
import Y8.F7;
import Y8.K7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class z4 implements Adapter {
    public static final z4 a;
    public static final List b;

    static {
        z4.a = new z4();  // initializer: Ljava/lang/Object;-><init>()V
        z4.b = q.L(new String[]{"id", "customerAnnouncements"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        F7 f70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(z4.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    f70 = (F7)Adapters.-obj(u4.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "id");
        }
        if(f70 == null) {
            throw o.q(jsonReader0, "customerAnnouncements");
        }
        return new K7(s, f70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((K7)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((K7)object0).a);
        jsonWriter0.name("customerAnnouncements");
        Adapters.-obj(u4.a, true).toJson(jsonWriter0, customScalarAdapters0, ((K7)object0).b);
    }
}

