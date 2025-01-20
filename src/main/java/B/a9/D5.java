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

public final class d5 implements Adapter {
    public static final d5 a;
    public static final List b;

    static {
        d5.a = new d5();  // initializer: Ljava/lang/Object;-><init>()V
        d5.b = q.L(new String[]{"id", "dueDateInfo"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        Q4 q40 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(d5.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    q40 = (Q4)Adapters.-nullable(Adapters.-obj$default(Z4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "id");
        }
        return new U4(s, q40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((U4)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((U4)object0).a);
        jsonWriter0.name("dueDateInfo");
        Adapters.-nullable(Adapters.-obj$default(Z4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((U4)object0).b);
    }
}

