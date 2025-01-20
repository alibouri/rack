package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.ReceiptTemplateSlot;
import e9.a;
import java.util.List;

public final class p1 implements Adapter {
    public static final p1 a;
    public static final List b;

    static {
        p1.a = new p1();  // initializer: Ljava/lang/Object;-><init>()V
        p1.b = q.L(new String[]{"label", "value", "formatType", "internalValue", "templateSlot"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        ReceiptTemplateSlot receiptTemplateSlot0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(p1.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    s3 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    receiptTemplateSlot0 = (ReceiptTemplateSlot)Adapters.-nullable(a.q).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "label");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "value");
        }
        return new Z0(s, s1, s2, s3, receiptTemplateSlot0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Z0)object0), "value");
        jsonWriter0.name("label");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Z0)object0).a);
        jsonWriter0.name("value");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Z0)object0).b);
        jsonWriter0.name("formatType");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Z0)object0).c);
        jsonWriter0.name("internalValue");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Z0)object0).d);
        jsonWriter0.name("templateSlot");
        Adapters.-nullable(a.q).toJson(jsonWriter0, customScalarAdapters0, ((Z0)object0).e);
    }
}

