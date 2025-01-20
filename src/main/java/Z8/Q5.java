package Z8;

import Bb.q;
import Nb.j;
import Y8.O8;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.SupportCallingFragment;
import com.sendwave.backend.fragment.SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment;
import java.util.List;

public final class q5 implements Adapter {
    public static final q5 a;
    public static final List b;

    static {
        q5.a = new q5();  // initializer: Ljava/lang/Object;-><init>()V
        q5.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(q5.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        SupportCallingFragment supportCallingFragment0 = SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new O8(s, supportCallingFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((O8)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((O8)object0).a);
        SupportCallingFragmentImpl_ResponseAdapter.SupportCallingFragment.b(jsonWriter0, customScalarAdapters0, ((O8)object0).b);
    }
}

