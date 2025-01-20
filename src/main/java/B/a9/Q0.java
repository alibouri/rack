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

public abstract class q0 implements Adapter {
    public static final List a;

    static {
        q0.a = q.L(new String[]{"choices", "incompatibleChoices", "shouldEnableToggle", "description", "toggleText", "descriptionToggleOff"});
    }

    public static h0 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        List list0 = null;
        List list1 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(q0.a)) {
                case 0: {
                    list0 = Adapters.-list(Adapters.-obj$default(m0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list1 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj$default(p0.a, false, 1, null))).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "choices");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "shouldEnableToggle");
        }
        boolean z = boolean0.booleanValue();
        if(s == null) {
            throw o.q(jsonReader0, "description");
        }
        return new h0(list0, list1, z, s, s1, s2);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, h0 h00) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(h00, "value");
        jsonWriter0.name("choices");
        Adapters.-list(Adapters.-obj$default(m0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, h00.a);
        jsonWriter0.name("incompatibleChoices");
        Adapters.-nullable(Adapters.-list(Adapters.-obj$default(p0.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, h00.b);
        jsonWriter0.name("shouldEnableToggle");
        o.E(h00.c, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "description");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, h00.d);
        jsonWriter0.name("toggleText");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, h00.e);
        jsonWriter0.name("descriptionToggleOff");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, h00.f);
    }
}

