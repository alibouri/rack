package Z8;

import Bb.q;
import Nb.j;
import Y8.n5;
import Y8.o;
import Y8.p5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class a3 implements Adapter {
    public static final a3 a;
    public static final List b;

    static {
        a3.a = new a3();  // initializer: Ljava/lang/Object;-><init>()V
        a3.b = q.L(new String[]{"id", "paymentCardWallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        p5 p50 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(a3.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    p50 = (p5)Adapters.-nullable(Adapters.-obj$default(c3.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new n5(s, p50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((n5)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((n5)object0).a);
        jsonWriter0.name("paymentCardWallet");
        Adapters.-nullable(Adapters.-obj$default(c3.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((n5)object0).b);
    }
}

