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

public final class n4 implements Adapter {
    public static final n4 a;
    public static final List b;

    static {
        n4.a = new n4();  // initializer: Ljava/lang/Object;-><init>()V
        n4.b = q.L(new String[]{"toWallet", "fromWallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Integer integer1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(n4.b)) {
                case 0: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    integer1 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "toWallet");
        }
        int v = (int)integer0;
        if(integer1 == null) {
            throw o.q(jsonReader0, "fromWallet");
        }
        return new l4(v, ((int)integer1));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((l4)object0), "value");
        jsonWriter0.name("toWallet");
        o.D(((l4)object0).a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "fromWallet");
        Adapters.IntAdapter.toJson(jsonWriter0, customScalarAdapters0, ((int)((l4)object0).b));
    }
}

