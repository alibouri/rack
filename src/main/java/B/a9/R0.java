package a9;

import Bb.q;
import Nb.j;
import Y8.t0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import g9.h;
import java.util.List;

public abstract class r0 implements Adapter {
    public static final List a;

    static {
        r0.a = q.L(new String[]{"feeFormula", "minimum", "maximum", "requiresRounding"});
    }

    public static i0 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        h h0 = null;
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
        Boolean boolean0 = null;
    alab1:
        while(true) {
            int v = jsonReader0.selectName(r0.a);
            if(v == 0) {
                h0 = (h)Adapters.-nullable(t0.e).fromJson(jsonReader0, customScalarAdapters0);
            }
            else {
                t0 t00 = t0.c;
                switch(v) {
                    case 1: {
                        currencyAmount0 = (CurrencyAmount)Adapters.-nullable(t00).fromJson(jsonReader0, customScalarAdapters0);
                        break;
                    }
                    case 2: {
                        currencyAmount1 = (CurrencyAmount)Adapters.-nullable(t00).fromJson(jsonReader0, customScalarAdapters0);
                        break;
                    }
                    case 3: {
                        boolean0 = (Boolean)Adapters.NullableBooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                        break;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
        }
        return new i0(h0, currencyAmount0, currencyAmount1, boolean0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, i0 i00) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(i00, "value");
        jsonWriter0.name("feeFormula");
        Adapters.-nullable(t0.e).toJson(jsonWriter0, customScalarAdapters0, i00.a);
        jsonWriter0.name("minimum");
        Adapters.-nullable(t0.c).toJson(jsonWriter0, customScalarAdapters0, i00.b);
        jsonWriter0.name("maximum");
        Adapters.-nullable(t0.c).toJson(jsonWriter0, customScalarAdapters0, i00.c);
        jsonWriter0.name("requiresRounding");
        Adapters.NullableBooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, i00.d);
    }
}

