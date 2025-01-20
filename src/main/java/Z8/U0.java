package Z8;

import Bb.q;
import Nb.j;
import Y8.j1;
import Y8.o1;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.OverdraftFragment;
import com.sendwave.backend.fragment.OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment;
import java.util.List;

public final class u0 implements Adapter {
    public static final u0 a;
    public static final List b;

    static {
        u0.a = new u0();  // initializer: Ljava/lang/Object;-><init>()V
        u0.b = q.L(new String[]{"__typename", "id", "customerAnnouncements"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        j1 j10 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(u0.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    j10 = (j1)Adapters.-obj(p0.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        jsonReader0.rewind();
        OverdraftFragment overdraftFragment0 = OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "id");
        }
        if(j10 == null) {
            throw o.q(jsonReader0, "customerAnnouncements");
        }
        return new o1(s, s1, j10, overdraftFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((o1)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((o1)object0).a);
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((o1)object0).b);
        jsonWriter0.name("customerAnnouncements");
        Adapters.-obj(p0.a, true).toJson(jsonWriter0, customScalarAdapters0, ((o1)object0).c);
        OverdraftFragmentImpl_ResponseAdapter.OverdraftFragment.b(jsonWriter0, customScalarAdapters0, ((o1)object0).d);
    }
}

