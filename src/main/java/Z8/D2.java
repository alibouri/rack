package Z8;

import Bb.q;
import Nb.j;
import Y8.i4;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.OverdraftFragment;
import com.sendwave.backend.fragment.OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment;
import java.util.List;

public final class d2 implements Adapter {
    public static final d2 a;
    public static final List b;

    static {
        d2.a = new d2();  // initializer: Ljava/lang/Object;-><init>()V
        d2.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(d2.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        OverdraftFragment overdraftFragment0 = OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new i4(s, overdraftFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((i4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((i4)object0).a);
        OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment.b(jsonWriter0, customScalarAdapters0, ((i4)object0).b);
    }
}

