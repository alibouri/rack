package Z8;

import Bb.q;
import Nb.j;
import Y8.l1;
import Y8.n1;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class r0 implements Adapter {
    public static final r0 a;
    public static final List b;

    static {
        r0.a = new r0();  // initializer: Ljava/lang/Object;-><init>()V
        r0.b = q.L(new String[]{"transfer", "showUserCanReverseTxAnnouncement"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        n1 n10 = null;
        Boolean boolean0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(r0.b)) {
                case 0: {
                    n10 = (n1)Adapters.-nullable(Adapters.-obj$default(t0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "showUserCanReverseTxAnnouncement");
        }
        return new l1(n10, boolean0.booleanValue());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((l1)object0), "value");
        jsonWriter0.name("transfer");
        Adapters.-nullable(Adapters.-obj$default(t0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((l1)object0).a);
        jsonWriter0.name("showUserCanReverseTxAnnouncement");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((l1)object0).b));
    }
}

