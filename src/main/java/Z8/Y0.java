package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.w1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.AppActionFragment;
import com.sendwave.backend.fragment.AppActionFragmentImpl_ResponseAdapter.AppActionFragment;
import java.util.List;

public final class y0 implements Adapter {
    public static final y0 a;
    public static final List b;

    static {
        y0.a = new y0();  // initializer: Ljava/lang/Object;-><init>()V
        y0.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(y0.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        AppActionFragment appActionFragment0 = AppActionFragmentImpl_ResponseAdapter.AppActionFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new w1(s, appActionFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((w1)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((w1)object0).a);
        AppActionFragmentImpl_ResponseAdapter.AppActionFragment.b(jsonWriter0, customScalarAdapters0, ((w1)object0).b);
    }
}

