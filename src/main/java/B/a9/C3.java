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

public abstract class c3 implements Adapter {
    public static final List a;

    static {
        c3.a = q.L(new String[]{"senderName", "senderMobile", "sendAmount", "receiveAmount"});
    }

    public static U2 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(c3.a)) {
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
                case 3: {
                    currencyAmount1 = o.u(jsonReader0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "senderName");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "senderMobile");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "sendAmount");
        }
        if(currencyAmount1 == null) {
            throw o.q(jsonReader0, "receiveAmount");
        }
        return new U2(s, s1, currencyAmount0, currencyAmount1);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, U2 u20) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(u20, "value");
        jsonWriter0.name("senderName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, u20.a);
        jsonWriter0.name("senderMobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, u20.b);
        jsonWriter0.name("sendAmount");
        String s = u20.c.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("receiveAmount");
        String s1 = u20.d.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
    }
}

