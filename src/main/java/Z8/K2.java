package Z8;

import Bb.q;
import Nb.j;
import Y8.A4;
import Y8.q4;
import Y8.t4;
import Y8.x4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public abstract class k2 implements Adapter {
    public static final List a;

    static {
        k2.a = q.L(new String[]{"payment", "userFacingError", "sourceWallet", "historyEntryIdToDisplayNow"});
    }

    public static q4 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        t4 t40 = null;
        A4 a40 = null;
        x4 x40 = null;
        String s = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(k2.a)) {
                case 0: {
                    t40 = (t4)Adapters.-nullable(Adapters.-obj$default(n2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    a40 = (A4)Adapters.-nullable(Adapters.-obj$default(u2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    x40 = (x4)Adapters.-nullable(Adapters.-obj(r2.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        return new q4(t40, a40, x40, s);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, q4 q40) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(q40, "value");
        jsonWriter0.name("payment");
        Adapters.-nullable(Adapters.-obj$default(n2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, q40.a);
        jsonWriter0.name("userFacingError");
        Adapters.-nullable(Adapters.-obj$default(u2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, q40.b);
        jsonWriter0.name("sourceWallet");
        Adapters.-nullable(Adapters.-obj(r2.a, true)).toJson(jsonWriter0, customScalarAdapters0, q40.c);
        jsonWriter0.name("historyEntryIdToDisplayNow");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, q40.d);
    }
}

