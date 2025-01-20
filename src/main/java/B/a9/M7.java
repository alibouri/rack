package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public abstract class m7 implements Adapter {
    public static final List a;

    static {
        m7.a = q.K("awardAmount");
    }

    public static U6 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        CurrencyAmount currencyAmount0;
        for(currencyAmount0 = null; jsonReader0.selectName(m7.a) == 0; currencyAmount0 = o.u(jsonReader0)) {
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "awardAmount");
        }
        return new U6(currencyAmount0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, U6 u60) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(u60, "value");
        jsonWriter0.name("awardAmount");
        String s = u60.a.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
    }
}

