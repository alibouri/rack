package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t0;
import Y8.v1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.Date;
import java.util.List;

public final class h5 implements Adapter {
    public static final h5 a;
    public static final List b;

    static {
        h5.a = new h5();  // initializer: Ljava/lang/Object;-><init>()V
        h5.b = q.L(new String[]{"principalTotalAmount", "principalOwedAmount", "chargesOwedAmount", "dueDate"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
        CurrencyAmount currencyAmount2 = null;
        Date date0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(h5.b)) {
                case 0: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 1: {
                    currencyAmount1 = o.u(jsonReader0);
                    break;
                }
                case 2: {
                    currencyAmount2 = o.u(jsonReader0);
                    break;
                }
                case 3: {
                    date0 = v1.a.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "principalTotalAmount");
        }
        if(currencyAmount1 == null) {
            throw o.q(jsonReader0, "principalOwedAmount");
        }
        if(currencyAmount2 == null) {
            throw o.q(jsonReader0, "chargesOwedAmount");
        }
        if(date0 == null) {
            throw o.q(jsonReader0, "dueDate");
        }
        return new Y4(currencyAmount0, currencyAmount1, currencyAmount2, date0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Y4)object0), "value");
        jsonWriter0.name("principalTotalAmount");
        t0.b(jsonWriter0, customScalarAdapters0, ((Y4)object0).a);
        jsonWriter0.name("principalOwedAmount");
        t0.b(jsonWriter0, customScalarAdapters0, ((Y4)object0).b);
        jsonWriter0.name("chargesOwedAmount");
        t0.b(jsonWriter0, customScalarAdapters0, ((Y4)object0).c);
        jsonWriter0.name("dueDate");
        v1.a.b(jsonWriter0, customScalarAdapters0, ((Y4)object0).d);
    }
}

