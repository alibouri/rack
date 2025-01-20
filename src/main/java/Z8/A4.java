package Z8;

import Bb.q;
import Nb.j;
import Y8.d7;
import Y8.e7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class a4 implements Adapter {
    public static final a4 a;
    public static final List b;

    static {
        a4.a = new a4();  // initializer: Ljava/lang/Object;-><init>()V
        a4.b = q.K("resendMagicLinkSecurityChallengeSMSOnLogin");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        e7 e70;
        for(e70 = null; jsonReader0.selectName(a4.b) == 0; e70 = (e7)Adapters.-nullable(Adapters.-obj$default(b4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new d7(e70);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((d7)object0), "value");
        jsonWriter0.name("resendMagicLinkSecurityChallengeSMSOnLogin");
        Adapters.-nullable(Adapters.-obj$default(b4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((d7)object0).a);
    }
}

