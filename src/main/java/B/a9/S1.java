package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.ReceiptTemplateId;
import e9.a;
import java.util.List;

public abstract class s1 implements Adapter {
    public static final List a;

    static {
        s1.a = q.L(new String[]{"billId", "icon", "billName", "billAccount", "meterNumber", "receiptTemplateId", "historyEntryButtonInfo"});
    }

    public static c1 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        ReceiptTemplateId receiptTemplateId0 = null;
        a1 a10 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(s1.a)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s3 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    s4 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    receiptTemplateId0 = (ReceiptTemplateId)Adapters.-nullable(a.p).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    a10 = (a1)Adapters.-nullable(Adapters.-obj$default(q1.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "billId");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "billName");
        }
        if(s3 == null) {
            throw o.q(jsonReader0, "billAccount");
        }
        return new c1(s, s1, s2, s3, s4, receiptTemplateId0, a10);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, c1 c10) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(c10, "value");
        jsonWriter0.name("billId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, c10.a);
        jsonWriter0.name("icon");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, c10.b);
        jsonWriter0.name("billName");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, c10.c);
        jsonWriter0.name("billAccount");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, c10.d);
        jsonWriter0.name("meterNumber");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, c10.e);
        jsonWriter0.name("receiptTemplateId");
        Adapters.-nullable(a.p).toJson(jsonWriter0, customScalarAdapters0, c10.f);
        jsonWriter0.name("historyEntryButtonInfo");
        Adapters.-nullable(Adapters.-obj$default(q1.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, c10.g);
    }
}

