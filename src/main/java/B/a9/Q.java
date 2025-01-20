package a9;

import Nb.j;
import W5.f;
import Y8.o;
import a.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import n0.M;
import n0.v;

public abstract class q implements Adapter {
    public static final List a;

    static {
        q.a = Bb.q.K("color");
    }

    public static g a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        v v0;
        for(v0 = null; jsonReader0.selectName(q.a) == 0; v0 = new v(o.p(2, s, s))) {
            String s = jsonReader0.nextString();
        }
        if(v0 == null) {
            throw o.q(jsonReader0, "color");
        }
        return new g(v0.a);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, g g0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(g0, "value");
        jsonWriter0.name("color");
        int v = M.G(g0.a);
        f.o(16);
        jsonWriter0.value("#" + Vb.j.g0(a.D(16, ((long)v) & 0xFFFFFFFFL), 8, '0'));
    }
}

