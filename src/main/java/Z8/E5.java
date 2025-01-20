package Z8;

import Bb.q;
import Nb.j;
import Y8.u8;
import Y8.v8;
import Y8.w8;
import Y8.y8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class e5 implements Adapter {
    public static final e5 a;
    public static final List b;

    static {
        e5.a = new e5();  // initializer: Ljava/lang/Object;-><init>()V
        e5.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        u8 u80;
        v8 v80;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        w8 w80 = null;
        String s;
        for(s = null; jsonReader0.selectName(e5.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"LinkedAccountTransferPending"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            v80 = b5.a(jsonReader0, customScalarAdapters0);
        }
        else {
            v80 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"LinkedAccountTransferFailure"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            u80 = a5.a(jsonReader0, customScalarAdapters0);
        }
        else {
            u80 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"LinkedAccountTransferSuccess"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            w80 = c5.a(jsonReader0, customScalarAdapters0);
        }
        return new y8(s, v80, u80, w80);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((y8)object0), "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, ((y8)object0).a);
        v8 v80 = ((y8)object0).b;
        if(v80 != null) {
            jsonWriter0.name("__typename");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, v80.a);
        }
        u8 u80 = ((y8)object0).c;
        if(u80 != null) {
            a5.b(jsonWriter0, customScalarAdapters0, u80);
        }
        w8 w80 = ((y8)object0).d;
        if(w80 != null) {
            jsonWriter0.name("__typename");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, w80.a);
        }
    }
}

