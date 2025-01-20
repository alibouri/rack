package Z8;

import Bb.q;
import Nb.j;
import Y8.d0;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class x implements Adapter {
    public static final x a;
    public static final List b;

    static {
        x.a = new x();  // initializer: Ljava/lang/Object;-><init>()V
        x.b = q.L(new String[]{"label", "value", "isDisplayedAfterOtherFields"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        Boolean boolean0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(x.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "label");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "value");
        }
        if(boolean0 == null) {
            throw o.q(jsonReader0, "isDisplayedAfterOtherFields");
        }
        return new d0(s, s1, boolean0.booleanValue());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((d0)object0), "value");
        jsonWriter0.name("label");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((d0)object0).a);
        jsonWriter0.name("value");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((d0)object0).b);
        jsonWriter0.name("isDisplayedAfterOtherFields");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((d0)object0).c));
    }
}

