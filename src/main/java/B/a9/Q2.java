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

public final class q2 implements Adapter {
    public static final q2 a;
    public static final List b;

    static {
        q2.a = new q2();  // initializer: Ljava/lang/Object;-><init>()V
        q2.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        o2 o20;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        p2 p20 = null;
        String s;
        for(s = null; jsonReader0.selectName(q2.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"ElectronicCapture"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            o20 = w2.a(jsonReader0, customScalarAdapters0);
        }
        else {
            o20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"PhotoCapture"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            p20 = x2.a(jsonReader0, customScalarAdapters0);
        }
        return new i2(s, o20, p20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((i2)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((i2)object0).a);
        o2 o20 = ((i2)object0).b;
        if(o20 != null) {
            w2.b(jsonWriter0, customScalarAdapters0, o20);
        }
        p2 p20 = ((i2)object0).c;
        if(p20 != null) {
            jsonWriter0.name("warningForSkip");
            Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, p20.a);
        }
    }
}

