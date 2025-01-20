package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.LinkedAccountFieldFragment;
import com.sendwave.backend.fragment.LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment;
import java.util.List;

public final class h4 implements Adapter {
    public static final h4 a;
    public static final List b;

    static {
        h4.a = new h4();  // initializer: Ljava/lang/Object;-><init>()V
        h4.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(h4.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        LinkedAccountFieldFragment linkedAccountFieldFragment0 = LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new a4(s, linkedAccountFieldFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((a4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((a4)object0).a);
        LinkedAccountFieldFragmentImpl_ResponseAdapter.LinkedAccountFieldFragment.b(jsonWriter0, customScalarAdapters0, ((a4)object0).b);
    }
}

