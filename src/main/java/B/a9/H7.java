package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.ScratchCardDetailsFragment;
import com.sendwave.backend.fragment.ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment;
import java.util.List;

public final class h7 implements Adapter {
    public static final h7 a;
    public static final List b;

    static {
        h7.a = new h7();  // initializer: Ljava/lang/Object;-><init>()V
        h7.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(h7.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        ScratchCardDetailsFragment scratchCardDetailsFragment0 = ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new P6(s, scratchCardDetailsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((P6)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((P6)object0).a);
        ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment.b(jsonWriter0, customScalarAdapters0, ((P6)object0).b);
    }
}

