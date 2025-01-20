package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.BillFavoriteFragment;
import com.sendwave.backend.fragment.BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment;
import java.util.List;

public final class s5 implements Adapter {
    public static final s5 a;
    public static final List b;

    static {
        s5.a = new s5();  // initializer: Ljava/lang/Object;-><init>()V
        s5.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(s5.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        BillFavoriteFragment billFavoriteFragment0 = BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new l5(s, billFavoriteFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((l5)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((l5)object0).a);
        BillFavoriteFragmentImpl_ResponseAdapter.BillFavoriteFragment.b(jsonWriter0, customScalarAdapters0, ((l5)object0).b);
    }
}

