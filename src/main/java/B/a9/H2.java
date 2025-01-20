package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.u1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Date;
import java.util.List;

public final class h2 implements Adapter {
    public static final h2 a;
    public static final List b;

    static {
        h2.a = new h2();  // initializer: Ljava/lang/Object;-><init>()V
        h2.b = q.L(new String[]{"deviceModel", "isCurrentDevice", "whenUsed"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        Boolean boolean0 = null;
        Date date0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(h2.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    date0 = (Date)Adapters.-nullable(u1.a).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "deviceModel");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isCurrentDevice");
        }
        return new f2(s, boolean0.booleanValue(), date0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((f2)object0), "value");
        jsonWriter0.name("deviceModel");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((f2)object0).a);
        jsonWriter0.name("isCurrentDevice");
        o.E(((f2)object0).b, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "whenUsed");
        Adapters.-nullable(u1.a).toJson(jsonWriter0, customScalarAdapters0, ((f2)object0).c);
    }
}

