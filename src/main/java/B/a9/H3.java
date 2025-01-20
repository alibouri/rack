package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import e9.a;
import java.util.List;

public final class h3 implements Adapter {
    public static final h3 a;
    public static final List b;

    static {
        h3.a = new h3();  // initializer: Ljava/lang/Object;-><init>()V
        h3.b = q.L(new String[]{"inline", "overflow"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0 = null;
        List list1 = null;
    alab1:
        while(true) {
            int v = jsonReader0.selectName(h3.b);
            a a0 = a.i;
            switch(v) {
                case 0: {
                    list0 = Adapters.-list(a0).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list1 = Adapters.-list(a0).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "inline");
        }
        if(list1 == null) {
            throw o.q(jsonReader0, "overflow");
        }
        return new g3(list0, list1);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((g3)object0), "value");
        jsonWriter0.name("inline");
        Adapters.-list(a.i).toJson(jsonWriter0, customScalarAdapters0, ((g3)object0).a);
        jsonWriter0.name("overflow");
        Adapters.-list(a.i).toJson(jsonWriter0, customScalarAdapters0, ((g3)object0).b);
    }
}

