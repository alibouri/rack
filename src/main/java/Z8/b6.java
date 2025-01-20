package Z8;

import Bb.q;
import Nb.j;
import Y8.L9;
import Y8.M9;
import Y8.O9;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class b6 implements Adapter {
    public static final b6 a;
    public static final List b;

    static {
        b6.a = new b6();  // initializer: Ljava/lang/Object;-><init>()V
        b6.b = q.L(new String[]{"id", "savingsWallet", "paymentCardWallet"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        M9 m90 = null;
        L9 l90 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(b6.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    m90 = (M9)Adapters.-obj(Z5.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    l90 = (L9)Adapters.-nullable(Adapters.-obj(Y5.a, true)).fromJson(jsonReader0, customScalarAdapters0);
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
        if(m90 == null) {
            throw o.q(jsonReader0, "savingsWallet");
        }
        return new O9(s, m90, l90);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((O9)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((O9)object0).a);
        jsonWriter0.name("savingsWallet");
        Adapters.-obj(Z5.a, true).toJson(jsonWriter0, customScalarAdapters0, ((O9)object0).b);
        jsonWriter0.name("paymentCardWallet");
        Adapters.-nullable(Adapters.-obj(Y5.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((O9)object0).c);
    }
}

