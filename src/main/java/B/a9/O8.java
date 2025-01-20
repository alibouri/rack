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

public final class o8 implements Adapter {
    public static final o8 a;
    public static final List b;

    static {
        o8.a = new o8();  // initializer: Ljava/lang/Object;-><init>()V
        o8.b = q.L(new String[]{"openingTime", "closingTime"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(o8.b)) {
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
            throw o.q(jsonReader0, "openingTime");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "closingTime");
        }
        return new g8(s, s1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((g8)object0), "value");
        jsonWriter0.name("openingTime");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((g8)object0).a);
        jsonWriter0.name("closingTime");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((g8)object0).b);
    }
}

