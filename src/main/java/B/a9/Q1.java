package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import n0.v;

public final class q1 implements Adapter {
    public static final q1 a;
    public static final List b;

    static {
        q1.a = new q1();  // initializer: Ljava/lang/Object;-><init>()V
        q1.b = q.L(new String[]{"text", "color", "colorPressed"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        v v0 = null;
        v v1 = null;
        String s = null;
    alab1:
        while(true) {
            int v2 = jsonReader0.selectName(q1.b);
            if(v2 == 0) {
                s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
            }
            else {
                switch(v2) {
                    case 1: {
                        String s1 = jsonReader0.nextString();
                        v0 = new v(o.p(2, s1, s1));
                        break;
                    }
                    case 2: {
                        String s2 = jsonReader0.nextString();
                        v1 = new v(o.p(2, s2, s2));
                        break;
                    }
                    default: {
                        break alab1;
                    }
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "text");
        }
        if(v0 == null) {
            throw o.q(jsonReader0, "color");
        }
        if(v1 == null) {
            throw o.q(jsonReader0, "colorPressed");
        }
        return new a1(s, v0.a, v1.a);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((a1)object0), "value");
        jsonWriter0.name("text");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((a1)object0).a);
        jsonWriter0.name("color");
        t0.d(jsonWriter0, customScalarAdapters0, ((a1)object0).b);
        jsonWriter0.name("colorPressed");
        t0.d(jsonWriter0, customScalarAdapters0, ((a1)object0).c);
    }
}

