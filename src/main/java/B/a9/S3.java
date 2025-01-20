package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.KycFineGrainTier;
import e9.a;
import java.util.List;

public final class s3 implements Adapter {
    public static final s3 a;
    public static final List b;

    static {
        s3.a = new s3();  // initializer: Ljava/lang/Object;-><init>()V
        s3.b = q.L(new String[]{"kycTier", "limits", "idStatus"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        KycFineGrainTier kycFineGrainTier0 = null;
        List list0 = null;
        o3 o30 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(s3.b)) {
                case 0: {
                    kycFineGrainTier0 = a.d(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = Adapters.-list(Adapters.-obj(t3.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    o30 = (o3)Adapters.-obj(r3.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(kycFineGrainTier0 == null) {
            throw o.q(jsonReader0, "kycTier");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "limits");
        }
        if(o30 == null) {
            throw o.q(jsonReader0, "idStatus");
        }
        return new p3(kycFineGrainTier0, list0, o30);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((p3)object0), "value");
        jsonWriter0.name("kycTier");
        jsonWriter0.value(((p3)object0).a.a());
        jsonWriter0.name("limits");
        Adapters.-list(Adapters.-obj(t3.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((p3)object0).b);
        jsonWriter0.name("idStatus");
        Adapters.-obj(r3.a, true).toJson(jsonWriter0, customScalarAdapters0, ((p3)object0).c);
    }
}

