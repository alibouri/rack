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

public final class z implements Adapter {
    public static final z a;
    public static final List b;

    static {
        z.a = new z();  // initializer: Ljava/lang/Object;-><init>()V
        z.b = q.L(new String[]{"announcements", "splashAnnouncement"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0 = null;
        x x0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(z.b)) {
                case 0: {
                    list0 = Adapters.-list(Adapters.-obj(y.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    x0 = (x)Adapters.-nullable(Adapters.-obj(B.a, true)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "announcements");
        }
        return new v(list0, x0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((v)object0), "value");
        jsonWriter0.name("announcements");
        Adapters.-list(Adapters.-obj(y.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((v)object0).a);
        jsonWriter0.name("splashAnnouncement");
        Adapters.-nullable(Adapters.-obj(B.a, true)).toJson(jsonWriter0, customScalarAdapters0, ((v)object0).b);
    }
}

