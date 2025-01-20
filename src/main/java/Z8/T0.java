package Z8;

import Bb.q;
import Nb.j;
import Y8.m1;
import Y8.n1;
import Y8.o1;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class t0 implements Adapter {
    public static final t0 a;
    public static final List b;

    static {
        t0.a = new t0();  // initializer: Ljava/lang/Object;-><init>()V
        t0.b = q.L(new String[]{"id", "sourceWallet", "user"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        m1 m10 = null;
        o1 o10 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(t0.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    m10 = (m1)Adapters.-nullable(Adapters.-obj(s0.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    o10 = (o1)Adapters.-nullable(Adapters.-obj(u0.a, true)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new n1(s, m10, o10);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((n1)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((n1)object0).a);
        jsonWriter0.name("sourceWallet");
        Adapters.-nullable(Adapters.-obj(s0.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((n1)object0).b);
        jsonWriter0.name("user");
        Adapters.-nullable(Adapters.-obj(u0.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((n1)object0).c);
    }
}

