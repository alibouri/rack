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

public abstract class n7 implements Adapter {
    public static final List a;

    static {
        n7.a = q.L(new String[]{"headerText", "imageUrl"});
    }

    public static V6 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(n7.a)) {
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
            throw o.q(jsonReader0, "headerText");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "imageUrl");
        }
        return new V6(s, s1);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, V6 v60) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(v60, "value");
        jsonWriter0.name("headerText");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, v60.a);
        jsonWriter0.name("imageUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, v60.b);
    }
}

