package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.t0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import n0.v;

public final class r implements Adapter {
    public static final r a;
    public static final List b;

    static {
        r.a = new r();  // initializer: Ljava/lang/Object;-><init>()V
        r.b = q.L(new String[]{"playPauseButtonColor", "playProgressColor", "bufferProgressColor", "backgroundColor"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        v v0 = null;
        v v1 = null;
        v v2 = null;
        v v3 = null;
    alab1:
        while(true) {
            int v4 = jsonReader0.selectName(r.b);
            if(v4 == 0) {
                String s = jsonReader0.nextString();
                v0 = new v(o.p(2, s, s));
            }
            else {
                switch(v4) {
                    case 1: {
                        String s1 = jsonReader0.nextString();
                        v1 = new v(o.p(2, s1, s1));
                        continue;
                    }
                    case 2: {
                        String s2 = jsonReader0.nextString();
                        v2 = new v(o.p(2, s2, s2));
                        continue;
                    label_19:
                        if(v4 == 3) {
                            break;
                        }
                        break alab1;
                    }
                    default: {
                        goto label_19;
                    }
                }
                String s3 = jsonReader0.nextString();
                v3 = new v(o.p(2, s3, s3));
            }
        }
        if(v0 == null) {
            throw o.q(jsonReader0, "playPauseButtonColor");
        }
        if(v1 == null) {
            throw o.q(jsonReader0, "playProgressColor");
        }
        if(v2 == null) {
            throw o.q(jsonReader0, "bufferProgressColor");
        }
        if(v3 == null) {
            throw o.q(jsonReader0, "backgroundColor");
        }
        return new h(v0.a, v1.a, v2.a, v3.a);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((h)object0), "value");
        jsonWriter0.name("playPauseButtonColor");
        t0.d(jsonWriter0, customScalarAdapters0, ((h)object0).a);
        jsonWriter0.name("playProgressColor");
        t0.d(jsonWriter0, customScalarAdapters0, ((h)object0).b);
        jsonWriter0.name("bufferProgressColor");
        t0.d(jsonWriter0, customScalarAdapters0, ((h)object0).c);
        jsonWriter0.name("backgroundColor");
        t0.d(jsonWriter0, customScalarAdapters0, ((h)object0).d);
    }
}

