package Z8;

import Bb.q;
import Nb.j;
import Y8.B5;
import Y8.C5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class m3 implements Adapter {
    public static final m3 a;
    public static final List b;

    static {
        m3.a = new m3();  // initializer: Ljava/lang/Object;-><init>()V
        m3.b = q.K("completePaymentCardWalletTransfer");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        B5 b50;
        for(b50 = null; jsonReader0.selectName(m3.b) == 0; b50 = (B5)Adapters.-nullable(Adapters.-obj$default(l3.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new C5(b50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((C5)object0), "value");
        jsonWriter0.name("completePaymentCardWalletTransfer");
        Adapters.-nullable(Adapters.-obj$default(l3.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((C5)object0).a);
    }
}

