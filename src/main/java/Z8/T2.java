package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.z4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class t2 implements Adapter {
    public static final t2 a;
    public static final List b;

    static {
        t2.a = new t2();  // initializer: Ljava/lang/Object;-><init>()V
        t2.b = q.L(new String[]{"code", "message"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(t2.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "code");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "message");
        }
        return new z4(s, s1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((z4)object0), "value");
        jsonWriter0.name("code");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((z4)object0).a);
        jsonWriter0.name("message");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((z4)object0).b);
    }
}

