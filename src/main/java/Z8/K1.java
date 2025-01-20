package Z8;

import Bb.q;
import Nb.j;
import Y8.C2;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;

public abstract class k1 implements Adapter {
    public static final List a;

    static {
        k1.a = q.K("balanceText");
    }

    public static C2 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(k1.a) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw o.q(jsonReader0, "balanceText");
        }
        return new C2(s);
    }
}

