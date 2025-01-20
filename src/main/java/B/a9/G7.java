package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.ClaimedScratchCardsFragment;
import com.sendwave.backend.fragment.ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment;
import java.util.List;

public final class g7 implements Adapter {
    public static final g7 a;
    public static final List b;

    static {
        g7.a = new g7();  // initializer: Ljava/lang/Object;-><init>()V
        g7.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(g7.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        ClaimedScratchCardsFragment claimedScratchCardsFragment0 = ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new O6(s, claimedScratchCardsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((O6)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((O6)object0).a);
        ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment.b(jsonWriter0, customScalarAdapters0, ((O6)object0).b);
    }
}

