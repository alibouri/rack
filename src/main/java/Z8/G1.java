package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.x2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.SecurityQuestionFragment;
import com.sendwave.backend.fragment.SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment;
import java.util.List;

public final class g1 implements Adapter {
    public static final g1 a;
    public static final List b;

    static {
        g1.a = new g1();  // initializer: Ljava/lang/Object;-><init>()V
        g1.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(g1.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        SecurityQuestionFragment securityQuestionFragment0 = SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new x2(s, securityQuestionFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((x2)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((x2)object0).a);
        SecurityQuestionFragmentImpl_ResponseAdapter.SecurityQuestionFragment.b(jsonWriter0, customScalarAdapters0, ((x2)object0).b);
    }
}

