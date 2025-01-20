package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.BillFieldsFragment;
import com.sendwave.backend.fragment.BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment;
import java.util.List;

public final class t5 implements Adapter {
    public static final t5 a;
    public static final List b;

    static {
        t5.a = new t5();  // initializer: Ljava/lang/Object;-><init>()V
        t5.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(t5.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        BillFieldsFragment billFieldsFragment0 = BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new m5(s, billFieldsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((m5)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((m5)object0).a);
        BillFieldsFragmentImpl_ResponseAdapter.BillFieldsFragment.b(jsonWriter0, customScalarAdapters0, ((m5)object0).b);
    }
}

