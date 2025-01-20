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

public final class s2 implements Adapter {
    public static final s2 a;
    public static final List b;

    static {
        s2.a = new s2();  // initializer: Ljava/lang/Object;-><init>()V
        s2.b = q.L(new String[]{"__typename", "fieldName", "displayName", "defaultValue", "isRequired", "isReviewable", "isEditable", "isVisible"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        m2 m20;
        n2 n20;
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        l2 l20 = null;
        Boolean boolean0 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        Boolean boolean1 = null;
        Boolean boolean2 = null;
        Boolean boolean3 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(s2.b)) {
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
                case 3: {
                    s3 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    boolean2 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 7: {
                    boolean3 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
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
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"DocumentTextField"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            n20 = v2.a(jsonReader0, customScalarAdapters0);
        }
        else {
            n20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"DocumentMultiChoiceField"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            m20 = u2.a(jsonReader0, customScalarAdapters0);
        }
        else {
            m20 = null;
        }
        if(BooleanExpressions.evaluate(BooleanExpressions.possibleTypes(new String[]{"DocumentDateField"}), customScalarAdapters0.falseVariables, s, customScalarAdapters0.deferredFragmentIdentifiers, null)) {
            jsonReader0.rewind();
            l20 = t2.a(jsonReader0, customScalarAdapters0);
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "fieldName");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isRequired");
        }
        boolean z = boolean0.booleanValue();
        if(boolean1 == null) {
            throw o.q(jsonReader0, "isReviewable");
        }
        boolean z1 = boolean1.booleanValue();
        if(boolean2 == null) {
            throw o.q(jsonReader0, "isEditable");
        }
        boolean z2 = boolean2.booleanValue();
        if(boolean3 == null) {
            throw o.q(jsonReader0, "isVisible");
        }
        return new k2(s, s1, s2, s3, z, z1, z2, boolean3.booleanValue(), n20, m20, l20);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((k2)object0), "value");
        jsonWriter0.name("__typename");
        Adapter adapter0 = Adapters.StringAdapter;
        adapter0.toJson(jsonWriter0, customScalarAdapters0, ((k2)object0).a);
        jsonWriter0.name("fieldName");
        adapter0.toJson(jsonWriter0, customScalarAdapters0, ((k2)object0).b);
        jsonWriter0.name("displayName");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k2)object0).c);
        jsonWriter0.name("defaultValue");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((k2)object0).d);
        jsonWriter0.name("isRequired");
        o.E(((k2)object0).e, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "isReviewable");
        o.E(((k2)object0).f, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "isEditable");
        o.E(((k2)object0).g, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "isVisible");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((k2)object0).h));
        n2 n20 = ((k2)object0).i;
        if(n20 != null) {
            jsonWriter0.name("inputType");
            adapter0.toJson(jsonWriter0, customScalarAdapters0, n20.a);
        }
        m2 m20 = ((k2)object0).j;
        if(m20 != null) {
            u2.b(jsonWriter0, customScalarAdapters0, m20);
        }
        l2 l20 = ((k2)object0).k;
        if(l20 != null) {
            t2.b(jsonWriter0, customScalarAdapters0, l20);
        }
    }
}

