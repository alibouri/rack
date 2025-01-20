package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.DealDetailFragment;
import com.sendwave.backend.fragment.DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment;
import java.util.List;

public final class g6 implements Adapter {
    public static final g6 a;
    public static final List b;

    static {
        g6.a = new g6();  // initializer: Ljava/lang/Object;-><init>()V
        g6.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(g6.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        DealDetailFragment dealDetailFragment0 = DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new b6(s, dealDetailFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((b6)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((b6)object0).a);
        DealDetailFragmentImpl_ResponseAdapter.DealDetailFragment.b(jsonWriter0, customScalarAdapters0, ((b6)object0).b);
    }
}

