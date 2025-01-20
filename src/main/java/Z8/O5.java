package Z8;

import Bb.q;
import Nb.j;
import Y8.J8;
import Y8.K8;
import Y8.L8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class o5 implements Adapter {
    public static final o5 a;
    public static final List b;

    static {
        o5.a = new o5();  // initializer: Ljava/lang/Object;-><init>()V
        o5.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        K8 k80;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        J8 j80 = null;
        String s;
        for(s = null; jsonReader0.selectName(o5.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"Voip"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            k80 = n5.a(jsonReader0, customScalarAdapters0);
        }
        else {
            k80 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"Pots"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            j80 = m5.a(jsonReader0, customScalarAdapters0);
        }
        return new L8(s, k80, j80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((L8)object0), "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, ((L8)object0).a);
        K8 k80 = ((L8)object0).b;
        if(k80 != null) {
            jsonWriter0.name("token");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, k80.a);
        }
        J8 j80 = ((L8)object0).c;
        if(j80 != null) {
            m5.b(jsonWriter0, customScalarAdapters0, j80);
        }
    }
}

