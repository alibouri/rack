package Z8;

import Bb.q;
import Nb.j;
import Y8.n4;
import Y8.p4;
import Y8.u4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class o2 implements Adapter {
    public static final o2 a;
    public static final List b;

    static {
        o2.a = new o2();  // initializer: Ljava/lang/Object;-><init>()V
        o2.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        p4 p40;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        n4 n40 = null;
        String s;
        for(s = null; jsonReader0.selectName(o2.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"PayBill"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            p40 = j2.a(jsonReader0, customScalarAdapters0);
        }
        else {
            p40 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"AsyncPending"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            n40 = h2.a(jsonReader0, customScalarAdapters0);
        }
        return new u4(s, p40, n40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((u4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((u4)object0).a);
        p4 p40 = ((u4)object0).b;
        if(p40 != null) {
            j2.b(jsonWriter0, customScalarAdapters0, p40);
        }
        n4 n40 = ((u4)object0).c;
        if(n40 != null) {
            jsonWriter0.name("clientId");
            Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, n40.a);
        }
    }
}

