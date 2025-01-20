package Z8;

import Bb.q;
import Nb.j;
import Y8.N2;
import Y8.O2;
import Y8.P2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class v1 implements Adapter {
    public static final v1 a;
    public static final List b;

    static {
        v1.a = new v1();  // initializer: Ljava/lang/Object;-><init>()V
        v1.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        O2 o20;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        N2 n20 = null;
        String s;
        for(s = null; jsonReader0.selectName(v1.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"LinkedAccountBalanceInfoActual"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            o20 = u1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            o20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"AsyncPending"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            n20 = t1.a(jsonReader0, customScalarAdapters0);
        }
        return new P2(s, o20, n20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((P2)object0), "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, ((P2)object0).a);
        O2 o20 = ((P2)object0).b;
        if(o20 != null) {
            jsonWriter0.name("balanceText");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, o20.a);
        }
        N2 n20 = ((P2)object0).c;
        if(n20 != null) {
            jsonWriter0.name("clientId");
            Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, n20.a);
        }
    }
}

