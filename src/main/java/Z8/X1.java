package Z8;

import Bb.q;
import Nb.j;
import Y8.c3;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.CustomerHistoryNodeFragment;
import com.sendwave.backend.fragment.CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment;
import java.util.List;

public final class x1 implements Adapter {
    public static final x1 a;
    public static final List b;

    static {
        x1.a = new x1();  // initializer: Ljava/lang/Object;-><init>()V
        x1.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(x1.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        CustomerHistoryNodeFragment customerHistoryNodeFragment0 = CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new c3(s, customerHistoryNodeFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((c3)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((c3)object0).a);
        CustomerHistoryNodeFragmentImpl_ResponseAdapter.CustomerHistoryNodeFragment.b(jsonWriter0, customScalarAdapters0, ((c3)object0).b);
    }
}

