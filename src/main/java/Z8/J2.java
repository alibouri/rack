package Z8;

import Bb.q;
import Nb.j;
import Y8.p4;
import Y8.s4;
import Y8.w4;
import Y8.z4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public abstract class j2 implements Adapter {
    public static final List a;

    static {
        j2.a = q.L(new String[]{"payment", "userFacingError", "sourceWallet"});
    }

    public static p4 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        s4 s40 = null;
        z4 z40 = null;
        w4 w40 = null;
    alab1:
        while(true) {
            int v = jsonReader0.selectName(j2.a);
            switch(v) {
                case 0: {
                    s40 = (s4)Adapters.-nullable(Adapters.-obj$default(m2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 1: {
                    z40 = (z4)Adapters.-nullable(Adapters.-obj$default(t2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                label_12:
                    if(v == 2) {
                        break;
                    }
                    break alab1;
                }
                default: {
                    goto label_12;
                }
            }
            w40 = (w4)Adapters.-nullable(Adapters.-obj(q2.a, true)).fromJson(jsonReader0, customScalarAdapters0);
        }
        return new p4(s40, z40, w40);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, p4 p40) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(p40, "value");
        jsonWriter0.name("payment");
        Adapters.-nullable(Adapters.-obj$default(m2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, p40.a);
        jsonWriter0.name("userFacingError");
        Adapters.-nullable(Adapters.-obj$default(t2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, p40.b);
        jsonWriter0.name("sourceWallet");
        Adapters.-nullable(Adapters.-obj(q2.a, true)).toJson(jsonWriter0, customScalarAdapters0, p40.c);
    }
}

