package Z8;

import Bb.q;
import Nb.j;
import Y8.m5;
import Y8.o;
import Y8.p5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class c3 implements Adapter {
    public static final c3 a;
    public static final List b;

    static {
        c3.a = new c3();  // initializer: Ljava/lang/Object;-><init>()V
        c3.b = q.L(new String[]{"id", "balance", "historyConnection"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        CurrencyAmount currencyAmount0 = null;
        m5 m50 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(c3.b)) {
                case 0: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 2: {
                    m50 = (m5)Adapters.-nullable(Adapters.-obj$default(Z2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        return new p5(s, currencyAmount0, m50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((p5)object0), "value");
        jsonWriter0.name("id");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((p5)object0).a);
        jsonWriter0.name("balance");
        j.f(((p5)object0).b, "value");
        String s = ((p5)object0).b.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("historyConnection");
        Adapters.-nullable(Adapters.-obj$default(Z2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((p5)object0).c);
    }
}

