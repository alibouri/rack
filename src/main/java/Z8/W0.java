package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.r1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.CustomerHomeFragment;
import com.sendwave.backend.fragment.CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment;
import java.util.List;

public final class w0 implements Adapter {
    public static final w0 a;
    public static final List b;

    static {
        w0.a = new w0();  // initializer: Ljava/lang/Object;-><init>()V
        w0.b = q.L(new String[]{"__typename", "id", "opaqueId"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(w0.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        CustomerHomeFragment customerHomeFragment0 = CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(s2 == null) {
            throw o.q(jsonReader0, "opaqueId");
        }
        return new r1(s, s1, s2, customerHomeFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((r1)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((r1)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((r1)object0).b);
        jsonWriter0.name("opaqueId");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((r1)object0).c);
        CustomerHomeFragmentImpl_ResponseAdapter.CustomerHomeFragment.b(jsonWriter0, customScalarAdapters0, ((r1)object0).d);
    }
}

