package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.HistoryNodeFragment;
import com.sendwave.backend.fragment.HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment;
import java.util.List;

public final class v4 implements Adapter {
    public static final v4 a;
    public static final List b;

    static {
        v4.a = new v4();  // initializer: Ljava/lang/Object;-><init>()V
        v4.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(v4.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        HistoryNodeFragment historyNodeFragment0 = HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new s4(s, historyNodeFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((s4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((s4)object0).a);
        HistoryNodeFragmentImpl_ResponseAdapter.HistoryNodeFragment.b(jsonWriter0, customScalarAdapters0, ((s4)object0).b);
    }
}

