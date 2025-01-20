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

public abstract class p implements Adapter {
    public static final List a;

    static {
        p.a = q.L(new String[]{"colorStops", "direction"});
    }

    public static f a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0 = null;
        Integer integer0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(p.a)) {
                case 0: {
                    list0 = Adapters.-list(Adapters.-obj$default(m.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "colorStops");
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "direction");
        }
        return new f(((int)integer0), list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, f f0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(f0, "value");
        jsonWriter0.name("colorStops");
        Adapters.-list(Adapters.-obj$default(m.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, f0.a);
        jsonWriter0.name("direction");
        Adapters.IntAdapter.toJson(jsonWriter0, customScalarAdapters0, ((int)f0.b));
    }
}

