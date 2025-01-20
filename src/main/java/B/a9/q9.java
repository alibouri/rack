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

public final class q9 implements Adapter {
    public static final q9 a;
    public static final List b;

    static {
        q9.a = new q9();  // initializer: Ljava/lang/Object;-><init>()V
        q9.b = q.L(new String[]{"minDaysBetweenUpdateAttempts", "minDaysBetweenUpdateRequests"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Integer integer1 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(q9.b)) {
                case 0: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    integer1 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "minDaysBetweenUpdateAttempts");
        }
        int v = (int)integer0;
        if(integer1 == null) {
            throw o.q(jsonReader0, "minDaysBetweenUpdateRequests");
        }
        return new l9(v, ((int)integer1));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((l9)object0), "value");
        jsonWriter0.name("minDaysBetweenUpdateAttempts");
        o.D(((l9)object0).a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "minDaysBetweenUpdateRequests");
        Adapters.IntAdapter.toJson(jsonWriter0, customScalarAdapters0, ((int)((l9)object0).b));
    }
}

