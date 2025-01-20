package a9;

import Bb.q;
import Nb.j;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class b2 implements Adapter {
    public static final b2 a;
    public static final List b;

    static {
        b2.a = new b2();  // initializer: Ljava/lang/Object;-><init>()V
        b2.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Z1 z10 = null;
        String s;
        for(s = null; jsonReader0.selectName(b2.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"DealUriAction"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            z10 = c2.a(jsonReader0, customScalarAdapters0);
        }
        return new Y1(s, z10);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((Y1)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((Y1)object0).a);
        Z1 z10 = ((Y1)object0).b;
        if(z10 != null) {
            c2.b(jsonWriter0, customScalarAdapters0, z10);
        }
    }
}

