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

public final class h6 implements Adapter {
    public static final h6 a;
    public static final List b;

    static {
        h6.a = new h6();  // initializer: Ljava/lang/Object;-><init>()V
        h6.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        e6 e60;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        d6 d60 = null;
        String s;
        for(s = null; jsonReader0.selectName(h6.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"BillType", "PayableBusiness"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            e60 = j6.a(jsonReader0, customScalarAdapters0);
        }
        else {
            e60 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"DealWithDetail"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            d60 = i6.a(jsonReader0, customScalarAdapters0);
        }
        return new c6(s, e60, d60);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((c6)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((c6)object0).a);
        e6 e60 = ((c6)object0).b;
        if(e60 != null) {
            j6.b(jsonWriter0, customScalarAdapters0, e60);
        }
        d6 d60 = ((c6)object0).c;
        if(d60 != null) {
            i6.b(jsonWriter0, customScalarAdapters0, d60);
        }
    }
}

