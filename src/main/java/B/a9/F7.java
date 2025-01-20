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

public final class f7 implements Adapter {
    public static final f7 a;
    public static final List b;

    static {
        f7.a = new f7();  // initializer: Ljava/lang/Object;-><init>()V
        f7.b = q.L(new String[]{"text", "backgroundColor", "textColor", "iconUrl"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        v v0 = null;
        v v1 = null;
        String s = null;
        String s1 = null;
    alab1:
        while(true) {
            int v2 = jsonReader0.selectName(f7.b);
            if(v2 == 0) {
                s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
            }
            else {
                switch(v2) {
                    case 1: {
                        String s2 = jsonReader0.nextString();
                        v0 = new v(o.p(2, s2, s2));
                        continue;
                    }
                    case 2: {
                        String s3 = jsonReader0.nextString();
                        v1 = new v(o.p(2, s3, s3));
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
                s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "text");
        }
        if(v0 == null) {
            throw o.q(jsonReader0, "backgroundColor");
        }
        if(v1 == null) {
            throw o.q(jsonReader0, "textColor");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "iconUrl");
        }
        return new N6(v0.a, v1.a, s, s1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((N6)object0), "value");
        jsonWriter0.name("text");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((N6)object0).a);
        jsonWriter0.name("backgroundColor");
        t0.d(jsonWriter0, customScalarAdapters0, ((N6)object0).b);
        jsonWriter0.name("textColor");
        t0.d(jsonWriter0, customScalarAdapters0, ((N6)object0).c);
        jsonWriter0.name("iconUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((N6)object0).d);
    }
}

