package Z8;

import Bb.q;
import Nb.j;
import Y8.Z8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class y5 implements Adapter {
    public static final y5 a;
    public static final List b;

    static {
        y5.a = new y5();  // initializer: Ljava/lang/Object;-><init>()V
        y5.b = q.L(new String[]{"latestVersion", "askUserToReaccept", "terms"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Boolean boolean0 = null;
        String s = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(y5.b)) {
                case 0: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "latestVersion");
        }
        int v = (int)integer0;
        if(boolean0 == null) {
            throw o.q(jsonReader0, "askUserToReaccept");
        }
        boolean z = boolean0.booleanValue();
        if(s == null) {
            throw o.q(jsonReader0, "terms");
        }
        return new Z8(s, z, v);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Z8)object0), "value");
        jsonWriter0.name("latestVersion");
        o.D(((Z8)object0).a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "askUserToReaccept");
        o.E(((Z8)object0).b, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "terms");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Z8)object0).c);
    }
}

