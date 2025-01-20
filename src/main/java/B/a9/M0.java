package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class m0 implements Adapter {
    public static final m0 a;
    public static final List b;

    static {
        m0.a = new m0();  // initializer: Ljava/lang/Object;-><init>()V
        m0.b = q.L(new String[]{"value", "displayName", "price"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        CurrencyAmount currencyAmount0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(m0.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "value");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "displayName");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "price");
        }
        return new d0(s, s1, currencyAmount0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((d0)object0), "value");
        jsonWriter0.name("value");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((d0)object0).a);
        jsonWriter0.name("displayName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((d0)object0).b);
        jsonWriter0.name("price");
        j.f(((d0)object0).c, "value");
        String s = ((d0)object0).c.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
    }
}

