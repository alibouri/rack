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

public final class r7 implements Adapter {
    public static final r7 a;
    public static final List b;

    static {
        r7.a = new r7();  // initializer: Ljava/lang/Object;-><init>()V
        r7.b = q.L(new String[]{"currentStep", "maxVisibleStep", "pastMilestones", "upcomingMilestones", "instructions"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Integer integer1 = null;
        W6 w60 = null;
        List list0 = null;
        R6 r60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(r7.b)) {
                case 0: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    integer1 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    w60 = (W6)Adapters.-obj$default(o7.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    list0 = Adapters.-list(Adapters.-obj$default(v7.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    r60 = (R6)Adapters.-nullable(Adapters.-obj$default(j7.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "currentStep");
        }
        int v = (int)integer0;
        if(integer1 == null) {
            throw o.q(jsonReader0, "maxVisibleStep");
        }
        int v1 = (int)integer1;
        if(w60 == null) {
            throw o.q(jsonReader0, "pastMilestones");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "upcomingMilestones");
        }
        return new Z6(v, v1, w60, list0, r60);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Z6)object0), "value");
        jsonWriter0.name("currentStep");
        o.D(((Z6)object0).a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "maxVisibleStep");
        o.D(((Z6)object0).b, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "pastMilestones");
        Adapters.-obj$default(o7.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, ((Z6)object0).c);
        jsonWriter0.name("upcomingMilestones");
        Adapters.-list(Adapters.-obj$default(v7.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((Z6)object0).d);
        jsonWriter0.name("instructions");
        Adapters.-nullable(Adapters.-obj$default(j7.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((Z6)object0).e);
    }
}

