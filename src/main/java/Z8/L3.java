package Z8;

import Bb.q;
import Nb.j;
import Y8.B5;
import Y8.D5;
import Y8.E5;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class l3 implements Adapter {
    public static final l3 a;
    public static final List b;

    static {
        l3.a = new l3();  // initializer: Ljava/lang/Object;-><init>()V
        l3.b = q.L(new String[]{"paymentCardWallet", "primaryWallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        D5 d50 = null;
        E5 e50 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(l3.b)) {
                case 0: {
                    d50 = (D5)Adapters.-obj(n3.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    e50 = (E5)Adapters.-obj(o3.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(d50 == null) {
            throw o.q(jsonReader0, "paymentCardWallet");
        }
        if(e50 == null) {
            throw o.q(jsonReader0, "primaryWallet");
        }
        return new B5(d50, e50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((B5)object0), "value");
        jsonWriter0.name("paymentCardWallet");
        Adapters.-obj(n3.a, true).toJson(jsonWriter0, customScalarAdapters0, ((B5)object0).a);
        jsonWriter0.name("primaryWallet");
        Adapters.-obj(o3.a, true).toJson(jsonWriter0, customScalarAdapters0, ((B5)object0).b);
    }
}

