package Z8;

import Bb.q;
import Nb.j;
import Y8.B2;
import Y8.C2;
import Y8.D2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class l1 implements Adapter {
    public static final l1 a;
    public static final List b;

    static {
        l1.a = new l1();  // initializer: Ljava/lang/Object;-><init>()V
        l1.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        C2 c20;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        B2 b20 = null;
        String s;
        for(s = null; jsonReader0.selectName(l1.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"BillTypeBalanceInfoActual"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            c20 = k1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            c20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"AsyncPending"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            b20 = j1.a(jsonReader0, customScalarAdapters0);
        }
        return new D2(s, c20, b20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((D2)object0), "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, ((D2)object0).a);
        C2 c20 = ((D2)object0).b;
        if(c20 != null) {
            jsonWriter0.name("balanceText");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, c20.a);
        }
        B2 b20 = ((D2)object0).c;
        if(b20 != null) {
            jsonWriter0.name("clientId");
            Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, b20.a);
        }
    }
}

