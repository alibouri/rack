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

public final class r9 implements Adapter {
    public static final r9 a;
    public static final List b;

    static {
        r9.a = new r9();  // initializer: Ljava/lang/Object;-><init>()V
        r9.b = q.L(new String[]{"customerCountryIso2", "traveledToCountryIso2"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(r9.b)) {
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
            throw o.q(jsonReader0, "customerCountryIso2");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "traveledToCountryIso2");
        }
        return new m9(s, s1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((m9)object0), "value");
        jsonWriter0.name("customerCountryIso2");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((m9)object0).a);
        jsonWriter0.name("traveledToCountryIso2");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((m9)object0).b);
    }
}

