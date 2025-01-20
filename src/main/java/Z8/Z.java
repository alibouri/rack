package Z8;

import Bb.q;
import Nb.j;
import Y8.f0;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public abstract class z implements Adapter {
    public static final List a;

    static {
        z.a = q.L(new String[]{"displayFields", "confirmedFields"});
    }

    public static f0 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0 = null;
        List list1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(z.a)) {
                case 0: {
                    list0 = Adapters.-list(Adapters.-obj$default(x.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list1 = Adapters.-list(Adapters.-obj$default(v.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "displayFields");
        }
        if(list1 == null) {
            throw o.q(jsonReader0, "confirmedFields");
        }
        return new f0(list0, list1);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, f0 f00) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(f00, "value");
        jsonWriter0.name("displayFields");
        Adapters.-list(Adapters.-obj$default(x.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, f00.a);
        jsonWriter0.name("confirmedFields");
        Adapters.-list(Adapters.-obj$default(v.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, f00.b);
    }
}

