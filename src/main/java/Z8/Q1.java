package Z8;

import Bb.q;
import Nb.j;
import Y8.H2;
import Y8.I2;
import Y8.J2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class q1 implements Adapter {
    public static final q1 a;
    public static final List b;

    static {
        q1.a = new q1();  // initializer: Ljava/lang/Object;-><init>()V
        q1.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        I2 i20;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        H2 h20 = null;
        String s;
        for(s = null; jsonReader0.selectName(q1.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"BillTypePromotionInfoActual"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            i20 = p1.a(jsonReader0, customScalarAdapters0);
        }
        else {
            i20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"AsyncPending"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            h20 = o1.a(jsonReader0, customScalarAdapters0);
        }
        return new J2(s, i20, h20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((J2)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((J2)object0).a);
        I2 i20 = ((J2)object0).b;
        if(i20 != null) {
            jsonWriter0.name("promotionText");
            Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, i20.a);
        }
        H2 h20 = ((J2)object0).c;
        if(h20 != null) {
            jsonWriter0.name("clientId");
            Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, h20.a);
        }
    }
}

