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

public final class t implements Adapter {
    public static final t a;
    public static final List b;

    static {
        t.a = new t();  // initializer: Ljava/lang/Object;-><init>()V
        t.b = q.L(new String[]{"textColor", "dismissIconColor", "playButton", "background"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        v v0 = null;
        v v1 = null;
        h h0 = null;
        b b0 = null;
    alab1:
        while(true) {
            int v2 = jsonReader0.selectName(t.b);
            if(v2 == 0) {
                String s = jsonReader0.nextString();
                v0 = new v(o.p(2, s, s));
            }
            else {
                switch(v2) {
                    case 1: {
                        String s1 = jsonReader0.nextString();
                        v1 = new v(o.p(2, s1, s1));
                        continue;
                    }
                    case 2: {
                        h0 = (h)Adapters.-obj$default(r.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                        continue;
                    label_18:
                        if(v2 == 3) {
                            break;
                        }
                        break alab1;
                    }
                    default: {
                        goto label_18;
                    }
                }
                b0 = (b)Adapters.-obj(l.a, true).fromJson(jsonReader0, customScalarAdapters0);
            }
        }
        if(v0 == null) {
            throw o.q(jsonReader0, "textColor");
        }
        if(v1 == null) {
            throw o.q(jsonReader0, "dismissIconColor");
        }
        if(h0 == null) {
            throw o.q(jsonReader0, "playButton");
        }
        if(b0 == null) {
            throw o.q(jsonReader0, "background");
        }
        return new a9.j(v0.a, v1.a, h0, b0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((a9.j)object0), "value");
        jsonWriter0.name("textColor");
        t0.d(jsonWriter0, customScalarAdapters0, ((a9.j)object0).a);
        jsonWriter0.name("dismissIconColor");
        t0.d(jsonWriter0, customScalarAdapters0, ((a9.j)object0).b);
        jsonWriter0.name("playButton");
        Adapters.-obj$default(r.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((a9.j)object0).c);
        jsonWriter0.name("background");
        Adapters.-obj(l.a, true).toJson(jsonWriter0, customScalarAdapters0, ((a9.j)object0).d);
    }
}

