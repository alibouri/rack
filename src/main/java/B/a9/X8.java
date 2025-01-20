package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.KycFineGrainTier;
import e9.a;
import java.util.List;

public final class x8 implements Adapter {
    public static final x8 a;
    public static final List b;

    static {
        x8.a = new x8();  // initializer: Ljava/lang/Object;-><init>()V
        x8.b = q.K("kycTier");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        KycFineGrainTier kycFineGrainTier0;
        for(kycFineGrainTier0 = null; jsonReader0.selectName(x8.b) == 0; kycFineGrainTier0 = a.d(jsonReader0, customScalarAdapters0)) {
        }
        if(kycFineGrainTier0 == null) {
            throw o.q(jsonReader0, "kycTier");
        }
        return new u8(kycFineGrainTier0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((u8)object0), "value");
        jsonWriter0.name("kycTier");
        jsonWriter0.value(((u8)object0).a.a());
    }
}

