package a9;

import Bb.q;
import Nb.j;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.AnnouncementFrequencyUnit;
import e9.a;
import java.util.List;

public final class o implements Adapter {
    public static final o a;
    public static final List b;

    static {
        o.a = new o();  // initializer: Ljava/lang/Object;-><init>()V
        o.b = q.L(new String[]{"unit", "interval"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        AnnouncementFrequencyUnit announcementFrequencyUnit0 = null;
        Integer integer0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(o.b)) {
                case 0: {
                    announcementFrequencyUnit0 = a.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(announcementFrequencyUnit0 == null) {
            throw Y8.o.q(jsonReader0, "unit");
        }
        if(integer0 == null) {
            throw Y8.o.q(jsonReader0, "interval");
        }
        return new e(announcementFrequencyUnit0, ((int)integer0));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((e)object0), "value");
        jsonWriter0.name("unit");
        jsonWriter0.value(((e)object0).a.a());
        jsonWriter0.name("interval");
        Adapters.IntAdapter.toJson(jsonWriter0, customScalarAdapters0, ((int)((e)object0).b));
    }
}

