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

public final class e7 implements Adapter {
    public static final e7 a;
    public static final List b;

    static {
        e7.a = new e7();  // initializer: Ljava/lang/Object;-><init>()V
        e7.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        U6 u60;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        V6 v60 = null;
        String s;
        for(s = null; jsonReader0.selectName(e7.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"CashScratchCardAward"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            u60 = m7.a(jsonReader0, customScalarAdapters0);
        }
        else {
            u60 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"CustomScratchCardAward"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            v60 = n7.a(jsonReader0, customScalarAdapters0);
        }
        return new M6(s, u60, v60);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((M6)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((M6)object0).a);
        U6 u60 = ((M6)object0).b;
        if(u60 != null) {
            m7.b(jsonWriter0, customScalarAdapters0, u60);
        }
        V6 v60 = ((M6)object0).c;
        if(v60 != null) {
            n7.b(jsonWriter0, customScalarAdapters0, v60);
        }
    }
}

