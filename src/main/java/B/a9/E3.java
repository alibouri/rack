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

public abstract class e3 implements Adapter {
    public static final List a;

    static {
        e3.a = q.L(new String[]{"transferId", "recipientName", "recipientMobile", "sendAmount", "receiveAmount", "isRefunded", "isUserReversible"});
    }

    public static W2 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Boolean boolean0 = null;
        Boolean boolean1 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        CurrencyAmount currencyAmount0 = null;
        CurrencyAmount currencyAmount1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(e3.a)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 4: {
                    currencyAmount1 = o.u(jsonReader0);
                    break;
                }
                case 5: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "transferId");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "recipientName");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "recipientMobile");
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "sendAmount");
        }
        if(currencyAmount1 == null) {
            throw o.q(jsonReader0, "receiveAmount");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isRefunded");
        }
        boolean z = boolean0.booleanValue();
        if(boolean1 == null) {
            throw o.q(jsonReader0, "isUserReversible");
        }
        return new W2(s, s1, s2, currencyAmount0, currencyAmount1, z, boolean1.booleanValue());
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, W2 w20) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(w20, "value");
        jsonWriter0.name("transferId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, w20.a);
        jsonWriter0.name("recipientName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, w20.b);
        jsonWriter0.name("recipientMobile");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, w20.c);
        jsonWriter0.name("sendAmount");
        String s = w20.d.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("receiveAmount");
        String s1 = w20.e.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
        jsonWriter0.name("isRefunded");
        o.E(w20.f, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "isUserReversible");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(w20.g));
    }
}

