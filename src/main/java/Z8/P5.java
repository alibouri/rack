package Z8;

import Bb.q;
import Nb.j;
import Y8.N8;
import Y8.O8;
import Y8.P8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class p5 implements Adapter {
    public static final p5 a;
    public static final List b;

    static {
        p5.a = new p5();  // initializer: Ljava/lang/Object;-><init>()V
        p5.b = q.L(new String[]{"support", "me"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        P8 p80 = null;
        O8 o80 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(p5.b)) {
                case 0: {
                    p80 = (P8)Adapters.-obj$default(r5.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    o80 = (O8)Adapters.-nullable(Adapters.-obj(q5.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(p80 == null) {
            throw o.q(jsonReader0, "support");
        }
        return new N8(p80, o80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((N8)object0), "value");
        jsonWriter0.name("support");
        Adapters.-obj$default(r5.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((N8)object0).a);
        jsonWriter0.name("me");
        Adapters.-nullable(Adapters.-obj(q5.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((N8)object0).b);
    }
}

