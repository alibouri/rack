package Z8;

import Bb.q;
import Nb.j;
import Y8.X0;
import Y8.Y0;
import Y8.o;
import Y8.u1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.Date;
import java.util.List;

public final class g0 implements Adapter {
    public static final g0 a;
    public static final List b;

    static {
        g0.a = new g0();  // initializer: Ljava/lang/Object;-><init>()V
        g0.b = q.L(new String[]{"session", "currentTime"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Y0 y00 = null;
        Date date0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(g0.b)) {
                case 0: {
                    y00 = (Y0)Adapters.-obj(h0.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    date0 = u1.a.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(y00 == null) {
            throw o.q(jsonReader0, "session");
        }
        if(date0 == null) {
            throw o.q(jsonReader0, "currentTime");
        }
        return new X0(y00, date0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((X0)object0), "value");
        jsonWriter0.name("session");
        Adapters.-obj(h0.a, true).toJson(jsonWriter0, customScalarAdapters0, ((X0)object0).a);
        jsonWriter0.name("currentTime");
        u1.a.b(jsonWriter0, customScalarAdapters0, ((X0)object0).b);
    }
}

