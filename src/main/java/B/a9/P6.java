package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.DocumentEntryFragment;
import com.sendwave.backend.fragment.DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment;
import java.util.List;

public final class p6 implements Adapter {
    public static final p6 a;
    public static final List b;

    static {
        p6.a = new p6();  // initializer: Ljava/lang/Object;-><init>()V
        p6.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(p6.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        DocumentEntryFragment documentEntryFragment0 = DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new o6(s, documentEntryFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((o6)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((o6)object0).a);
        DocumentEntryFragmentImpl_ResponseAdapter.DocumentEntryFragment.b(jsonWriter0, customScalarAdapters0, ((o6)object0).b);
    }
}

