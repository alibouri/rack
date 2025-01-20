package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.x5;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.List;

public abstract class i3 implements Adapter {
    public static final List a;

    static {
        i3.a = q.K("idempotencyKey");
    }

    public static x5 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(i3.a) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw o.q(jsonReader0, "idempotencyKey");
        }
        return new x5(s);
    }
}

