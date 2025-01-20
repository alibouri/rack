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

public final class w3 implements Adapter {
    public static final w3 a;
    public static final List b;

    static {
        w3.a = new w3();  // initializer: Ljava/lang/Object;-><init>()V
        w3.b = q.L(new String[]{"total", "remaining"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(w3.b)) {
                case 0: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 1: {
                    currencyAmount1 = o.u(jsonReader0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "total");
        }
        if(currencyAmount1 == null) {
            throw o.q(jsonReader0, "remaining");
        }
        return new u3(currencyAmount0, currencyAmount1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((u3)object0), "value");
        jsonWriter0.name("total");
        j.f(((u3)object0).a, "value");
        String s = ((u3)object0).a.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("remaining");
        j.f(((u3)object0).b, "value");
        String s1 = ((u3)object0).b.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
    }
}

