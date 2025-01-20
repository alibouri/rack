package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.u8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public abstract class a5 implements Adapter {
    public static final List a;

    static {
        a5.a = q.L(new String[]{"ufeCode", "ufeMessage"});
    }

    public static u8 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(a5.a)) {
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
            throw o.q(jsonReader0, "ufeCode");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "ufeMessage");
        }
        return new u8(s, s1);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, u8 u80) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(u80, "value");
        jsonWriter0.name("ufeCode");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, u80.a);
        jsonWriter0.name("ufeMessage");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, u80.b);
    }
}

