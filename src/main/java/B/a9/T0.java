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

public abstract class t0 implements Adapter {
    public static final List a;

    static {
        t0.a = q.L(new String[]{"minLength", "maxLength", "formatter", "inputType"});
    }

    public static k0 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Integer integer1 = null;
        f0 f00 = null;
        String s = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(t0.a)) {
                case 0: {
                    integer0 = (Integer)Adapters.NullableIntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    integer1 = (Integer)Adapters.NullableIntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    f00 = (f0)Adapters.-nullable(Adapters.-obj(o0.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "inputType");
        }
        return new k0(integer0, integer1, f00, s);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, k0 k00) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(k00, "value");
        jsonWriter0.name("minLength");
        Adapters.NullableIntAdapter.toJson(jsonWriter0, customScalarAdapters0, k00.a);
        jsonWriter0.name("maxLength");
        Adapters.NullableIntAdapter.toJson(jsonWriter0, customScalarAdapters0, k00.b);
        jsonWriter0.name("formatter");
        Adapters.-nullable(Adapters.-obj(o0.a, true)).toJson(jsonWriter0, customScalarAdapters0, k00.c);
        jsonWriter0.name("inputType");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, k00.d);
    }
}

