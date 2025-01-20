package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.v1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;
import java.util.List;

public final class w0 implements Adapter {
    public static final w0 a;
    public static final List b;

    static {
        w0.a = new w0();  // initializer: Ljava/lang/Object;-><init>()V
        w0.b = q.L(new String[]{"amount", "dueDate", "invoiceReference", "customerName", "period"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        CurrencyAmount currencyAmount0 = null;
        Date date0 = null;
        String s = null;
        String s1 = null;
        Date date1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(w0.b)) {
                case 0: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 1: {
                    date0 = v1.a.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    date1 = (Date)Adapters.-nullable(v1.a).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "amount");
        }
        if(date0 == null) {
            throw o.q(jsonReader0, "dueDate");
        }
        if(s == null) {
            throw o.q(jsonReader0, "invoiceReference");
        }
        return new v0(currencyAmount0, date0, s, s1, date1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((v0)object0), "value");
        jsonWriter0.name("amount");
        j.f(((v0)object0).a, "value");
        String s = ((v0)object0).a.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("dueDate");
        v1.a.b(jsonWriter0, customScalarAdapters0, ((v0)object0).b);
        jsonWriter0.name("invoiceReference");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((v0)object0).c);
        jsonWriter0.name("customerName");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((v0)object0).d);
        jsonWriter0.name("period");
        Adapters.-nullable(v1.a).toJson(jsonWriter0, customScalarAdapters0, ((v0)object0).e);
    }
}

