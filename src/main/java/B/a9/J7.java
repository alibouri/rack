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

public final class j7 implements Adapter {
    public static final j7 a;
    public static final List b;

    static {
        j7.a = new j7();  // initializer: Ljava/lang/Object;-><init>()V
        j7.b = q.L(new String[]{"currentStepDescription", "instructionSteps"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(j7.b)) {
                case 0: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = Adapters.-list(Adapters.StringAdapter).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "instructionSteps");
        }
        return new R6(s, list0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((R6)object0), "value");
        jsonWriter0.name("currentStepDescription");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((R6)object0).a);
        jsonWriter0.name("instructionSteps");
        Adapters.-list(Adapters.StringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((R6)object0).b);
    }
}

