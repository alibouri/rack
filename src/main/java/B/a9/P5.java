package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class p5 implements Adapter {
    public static final p5 a;
    public static final List b;

    static {
        p5.a = new p5();  // initializer: Ljava/lang/Object;-><init>()V
        p5.b = q.L(new String[]{"__typename", "id", "shortDescription"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        n5 n50 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(p5.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"DealWithDetail"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            n50 = u5.a(jsonReader0, customScalarAdapters0);
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        return new i5(s, s1, s2, n50);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((i5)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((i5)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((i5)object0).b);
        jsonWriter0.name("shortDescription");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((i5)object0).c);
        n5 n50 = ((i5)object0).d;
        if(n50 != null) {
            u5.b(jsonWriter0, customScalarAdapters0, n50);
        }
    }
}

