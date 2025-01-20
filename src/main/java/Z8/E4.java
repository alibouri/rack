package Z8;

import Bb.q;
import Nb.j;
import Y8.i7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.SmsTokenFragment;
import com.sendwave.backend.fragment.SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment;
import java.util.List;

public final class e4 implements Adapter {
    public static final e4 a;
    public static final List b;

    static {
        e4.a = new e4();  // initializer: Ljava/lang/Object;-><init>()V
        e4.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(e4.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        SmsTokenFragment smsTokenFragment0 = SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new i7(s, smsTokenFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((i7)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((i7)object0).a);
        SmsTokenFragmentImpl_ResponseAdapter.SmsTokenFragment.b(jsonWriter0, customScalarAdapters0, ((i7)object0).b);
    }
}

