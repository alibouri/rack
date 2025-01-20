package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.UserOverdraftChargeFrequency;
import com.sendwave.backend.type.UserOverdraftChargeType;
import e9.h;
import java.util.List;

public final class a5 implements Adapter {
    public static final a5 a;
    public static final List b;

    static {
        a5.a = new a5();  // initializer: Ljava/lang/Object;-><init>()V
        a5.b = q.L(new String[]{"type", "frequency"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        UserOverdraftChargeType userOverdraftChargeType0 = null;
        UserOverdraftChargeFrequency userOverdraftChargeFrequency0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(a5.b)) {
                case 0: {
                    userOverdraftChargeType0 = h.c(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    userOverdraftChargeFrequency0 = h.b(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(userOverdraftChargeType0 == null) {
            throw o.q(jsonReader0, "type");
        }
        if(userOverdraftChargeFrequency0 == null) {
            throw o.q(jsonReader0, "frequency");
        }
        return new R4(userOverdraftChargeFrequency0, userOverdraftChargeType0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((R4)object0), "value");
        jsonWriter0.name("type");
        jsonWriter0.value(((R4)object0).a.a());
        jsonWriter0.name("frequency");
        jsonWriter0.value(((R4)object0).b.a());
    }
}

