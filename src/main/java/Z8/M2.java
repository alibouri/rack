package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.s4;
import Y8.u1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;
import java.util.List;

public final class m2 implements Adapter {
    public static final m2 a;
    public static final List b;

    static {
        m2.a = new m2();  // initializer: Ljava/lang/Object;-><init>()V
        m2.b = q.L(new String[]{"sendAmount", "clientId", "billType", "whenCreated"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        CurrencyAmount currencyAmount0 = null;
        String s = null;
        String s1 = null;
        Date date0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(m2.b)) {
                case 0: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 1: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    date0 = u1.a.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "sendAmount");
        }
        if(s == null) {
            throw o.q(jsonReader0, "clientId");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "billType");
        }
        if(date0 == null) {
            throw o.q(jsonReader0, "whenCreated");
        }
        return new s4(currencyAmount0, s, s1, date0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((s4)object0), "value");
        jsonWriter0.name("sendAmount");
        j.f(((s4)object0).a, "value");
        String s = ((s4)object0).a.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("clientId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((s4)object0).b);
        jsonWriter0.name("billType");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((s4)object0).c);
        jsonWriter0.name("whenCreated");
        u1.a.b(jsonWriter0, customScalarAdapters0, ((s4)object0).d);
    }
}

