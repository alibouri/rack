package Z8;

import Bb.q;
import Nb.j;
import Y8.o4;
import Y8.q4;
import Y8.v4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class p2 implements Adapter {
    public static final p2 a;
    public static final List b;

    static {
        p2.a = new p2();  // initializer: Ljava/lang/Object;-><init>()V
        p2.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        q4 q40;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        o4 o40 = null;
        String s;
        for(s = null; jsonReader0.selectName(p2.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"PayBill"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            q40 = k2.a(jsonReader0, customScalarAdapters0);
        }
        else {
            q40 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"AsyncPending"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            o40 = i2.a(jsonReader0, customScalarAdapters0);
        }
        return new v4(s, q40, o40);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((v4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((v4)object0).a);
        q4 q40 = ((v4)object0).b;
        if(q40 != null) {
            k2.b(jsonWriter0, customScalarAdapters0, q40);
        }
        o4 o40 = ((v4)object0).c;
        if(o40 != null) {
            jsonWriter0.name("clientId");
            Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, o40.a);
        }
    }
}

