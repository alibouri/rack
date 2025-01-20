package a9;

import Bb.q;
import Nb.j;
import W5.f;
import Y8.o;
import a.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import n0.M;
import n0.v;

public final class m implements Adapter {
    public static final m a;
    public static final List b;

    static {
        m.a = new m();  // initializer: Ljava/lang/Object;-><init>()V
        m.b = q.L(new String[]{"color", "stop"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        v v0 = null;
        Double double0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(m.b)) {
                case 0: {
                    String s = jsonReader0.nextString();
                    v0 = new v(o.p(2, s, s));
                    break;
                }
                case 1: {
                    double0 = (Double)Adapters.DoubleAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(v0 == null) {
            throw o.q(jsonReader0, "color");
        }
        if(double0 == null) {
            throw o.q(jsonReader0, "stop");
        }
        return new c(v0.a, ((double)double0));
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((c)object0), "value");
        jsonWriter0.name("color");
        int v = M.G(((c)object0).a);
        f.o(16);
        jsonWriter0.value("#" + Vb.j.g0(a.D(16, ((long)v) & 0xFFFFFFFFL), 8, '0'));
        jsonWriter0.name("stop");
        Adapters.DoubleAdapter.toJson(jsonWriter0, customScalarAdapters0, ((double)((c)object0).b));
    }
}

