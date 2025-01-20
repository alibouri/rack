package Z8;

import Bb.q;
import Nb.j;
import Y8.M2;
import Y8.P2;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class s1 implements Adapter {
    public static final s1 a;
    public static final List b;

    static {
        s1.a = new s1();  // initializer: Ljava/lang/Object;-><init>()V
        s1.b = q.L(new String[]{"__typename", "response"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        P2 p20 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(s1.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    p20 = (P2)Adapters.-nullable(Adapters.-obj(v1.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new M2(s, p20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((M2)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((M2)object0).a);
        jsonWriter0.name("response");
        Adapters.-nullable(Adapters.-obj(v1.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((M2)object0).b);
    }
}

