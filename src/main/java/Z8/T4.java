package Z8;

import Bb.q;
import Nb.j;
import Y8.D7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.SavingsFragment;
import com.sendwave.backend.fragment.SavingsFragmentImpl_ResponseAdapter.SavingsFragment;
import java.util.List;

public final class t4 implements Adapter {
    public static final t4 a;
    public static final List b;

    static {
        t4.a = new t4();  // initializer: Ljava/lang/Object;-><init>()V
        t4.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(t4.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        SavingsFragment savingsFragment0 = SavingsFragmentImpl_ResponseAdapter.SavingsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new D7(s, savingsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((D7)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((D7)object0).a);
        SavingsFragmentImpl_ResponseAdapter.SavingsFragment.b(jsonWriter0, customScalarAdapters0, ((D7)object0).b);
    }
}

