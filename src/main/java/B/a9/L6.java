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

public final class l6 implements Adapter {
    public static final l6 a;
    public static final List b;

    static {
        l6.a = new l6();  // initializer: Ljava/lang/Object;-><init>()V
        l6.b = q.L(new String[]{"id", "deviceModel", "whenExpires"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        Date date0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(l6.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    date0 = u1.a.a(jsonReader0, customScalarAdapters0);
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
        if(s1 == null) {
            throw o.q(jsonReader0, "deviceModel");
        }
        if(date0 == null) {
            throw o.q(jsonReader0, "whenExpires");
        }
        return new k6(s, s1, date0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((k6)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k6)object0).a);
        jsonWriter0.name("deviceModel");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k6)object0).b);
        jsonWriter0.name("whenExpires");
        u1.a.b(jsonWriter0, customScalarAdapters0, ((k6)object0).c);
    }
}

