package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.r7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class k4 implements Adapter {
    public static final k4 a;
    public static final List b;

    static {
        k4.a = new k4();  // initializer: Ljava/lang/Object;-><init>()V
        k4.b = q.L(new String[]{"id", "balance"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        CurrencyAmount currencyAmount0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(k4.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "id");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        return new r7(currencyAmount0, s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((r7)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((r7)object0).a);
        jsonWriter0.name("balance");
        j.f(((r7)object0).b, "value");
        String s = ((r7)object0).b.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
    }
}

