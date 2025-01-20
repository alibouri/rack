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

public final class l7 implements Adapter {
    public static final l7 a;
    public static final List b;

    static {
        l7.a = new l7();  // initializer: Ljava/lang/Object;-><init>()V
        l7.b = q.L(new String[]{"step", "reward"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Y6 y60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(l7.b)) {
                case 0: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    y60 = (Y6)Adapters.-obj(q7.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "step");
        }
        int v = (int)integer0;
        if(y60 == null) {
            throw o.q(jsonReader0, "reward");
        }
        return new T6(v, y60);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((T6)object0), "value");
        jsonWriter0.name("step");
        o.D(((T6)object0).a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "reward");
        Adapters.-obj(q7.a, true).toJson(jsonWriter0, customScalarAdapters0, ((T6)object0).b);
    }
}

