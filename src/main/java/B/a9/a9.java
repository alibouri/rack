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

public final class a9 implements Adapter {
    public static final a9 a;
    public static final List b;

    static {
        a9.a = new a9();  // initializer: Ljava/lang/Object;-><init>()V
        a9.b = q.L(new String[]{"sendMoneyScreen", "confirmationDialog"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        O8 o80 = null;
        K8 k80 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(a9.b)) {
                case 0: {
                    o80 = (O8)Adapters.-obj$default(X8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    k80 = (K8)Adapters.-obj$default(T8.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(o80 == null) {
            throw o.q(jsonReader0, "sendMoneyScreen");
        }
        if(k80 == null) {
            throw o.q(jsonReader0, "confirmationDialog");
        }
        return new R8(o80, k80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((R8)object0), "value");
        jsonWriter0.name("sendMoneyScreen");
        Adapters.-obj$default(X8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((R8)object0).a);
        jsonWriter0.name("confirmationDialog");
        Adapters.-obj$default(T8.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((R8)object0).b);
    }
}

