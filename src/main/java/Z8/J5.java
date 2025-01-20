package Z8;

import Bb.q;
import Nb.j;
import Y8.F8;
import Y8.G8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.PartnerOrg;
import com.sendwave.backend.type.n2;
import java.util.List;

public final class j5 implements Adapter {
    public static final j5 a;
    public static final List b;

    static {
        j5.a = new j5();  // initializer: Ljava/lang/Object;-><init>()V
        j5.b = q.L(new String[]{"token", "partnerOrg"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        G8 g80 = null;
        PartnerOrg partnerOrg0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(j5.b)) {
                case 0: {
                    g80 = (G8)Adapters.-obj(k5.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    String s = jsonReader0.nextString();
                    j.c(s);
                    PartnerOrg.B.getClass();
                    partnerOrg0 = n2.a(s);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(g80 == null) {
            throw o.q(jsonReader0, "token");
        }
        if(partnerOrg0 == null) {
            throw o.q(jsonReader0, "partnerOrg");
        }
        return new F8(g80, partnerOrg0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((F8)object0), "value");
        jsonWriter0.name("token");
        Adapters.-obj(k5.a, true).toJson(jsonWriter0, customScalarAdapters0, ((F8)object0).a);
        jsonWriter0.name("partnerOrg");
        jsonWriter0.value(((F8)object0).b.a());
    }
}

