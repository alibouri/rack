package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class m8 implements Adapter {
    public static final m8 a;
    public static final List b;

    static {
        m8.a = new m8();  // initializer: Ljava/lang/Object;-><init>()V
        m8.b = q.L(new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        b8 b80 = null;
        g8 g80 = null;
        h8 h80 = null;
        f8 f80 = null;
        a8 a80 = null;
        c8 c80 = null;
        d8 d80 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(m8.b)) {
                case 0: {
                    b80 = (b8)Adapters.-obj$default(j8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    g80 = (g8)Adapters.-obj$default(o8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    h80 = (h8)Adapters.-obj$default(p8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    f80 = (f8)Adapters.-obj$default(n8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    a80 = (a8)Adapters.-obj$default(i8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    c80 = (c8)Adapters.-obj$default(k8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    d80 = (d8)Adapters.-obj$default(l8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(b80 == null) {
            throw o.q(jsonReader0, "monday");
        }
        if(g80 == null) {
            throw o.q(jsonReader0, "tuesday");
        }
        if(h80 == null) {
            throw o.q(jsonReader0, "wednesday");
        }
        if(f80 == null) {
            throw o.q(jsonReader0, "thursday");
        }
        if(a80 == null) {
            throw o.q(jsonReader0, "friday");
        }
        if(c80 == null) {
            throw o.q(jsonReader0, "saturday");
        }
        if(d80 == null) {
            throw o.q(jsonReader0, "sunday");
        }
        return new e8(b80, g80, h80, f80, a80, c80, d80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((e8)object0), "value");
        jsonWriter0.name("monday");
        Adapters.-obj$default(j8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((e8)object0).a);
        jsonWriter0.name("tuesday");
        Adapters.-obj$default(o8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((e8)object0).b);
        jsonWriter0.name("wednesday");
        Adapters.-obj$default(p8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((e8)object0).c);
        jsonWriter0.name("thursday");
        Adapters.-obj$default(n8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((e8)object0).d);
        jsonWriter0.name("friday");
        Adapters.-obj$default(i8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((e8)object0).e);
        jsonWriter0.name("saturday");
        Adapters.-obj$default(k8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((e8)object0).f);
        jsonWriter0.name("sunday");
        Adapters.-obj$default(l8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((e8)object0).g);
    }
}

