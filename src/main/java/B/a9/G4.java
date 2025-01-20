package a9;

import Bb.q;
import Nb.j;
import P4.c;
import Y8.o;
import Y8.t0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import g9.h;
import java.util.List;

public final class g4 implements Adapter {
    public static final g4 a;
    public static final List b;

    static {
        g4.a = new g4();  // initializer: Ljava/lang/Object;-><init>()V
        g4.b = q.L(new String[]{"formula", "label"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        h h0 = null;
        String s = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(g4.b)) {
                case 0: {
                    h0 = t0.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(h0 == null) {
            throw o.q(jsonReader0, "formula");
        }
        if(s == null) {
            throw o.q(jsonReader0, "label");
        }
        return new Z3(h0, s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Z3)object0), "value");
        jsonWriter0.name("formula");
        j.f(((Z3)object0).a, "value");
        String s = c.V(((Z3)object0).a.Y);
        j.e(s, "toJSONString(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("label");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Z3)object0).b);
    }
}

