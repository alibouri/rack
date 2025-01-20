package Z8;

import Bb.q;
import Nb.j;
import Y8.H7;
import Y8.I7;
import Y8.J7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class w4 implements Adapter {
    public static final w4 a;
    public static final List b;

    static {
        w4.a = new w4();  // initializer: Ljava/lang/Object;-><init>()V
        w4.b = q.L(new String[]{"__typename", "savingsWallet", "primaryWallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        J7 j70 = null;
        I7 i70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(w4.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    j70 = (J7)Adapters.-obj(y4.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    i70 = (I7)Adapters.-obj(x4.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(j70 == null) {
            throw o.q(jsonReader0, "savingsWallet");
        }
        if(i70 == null) {
            throw o.q(jsonReader0, "primaryWallet");
        }
        return new H7(s, j70, i70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((H7)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((H7)object0).a);
        jsonWriter0.name("savingsWallet");
        Adapters.-obj(y4.a, true).toJson(jsonWriter0, customScalarAdapters0, ((H7)object0).b);
        jsonWriter0.name("primaryWallet");
        Adapters.-obj(x4.a, true).toJson(jsonWriter0, customScalarAdapters0, ((H7)object0).c);
    }
}

