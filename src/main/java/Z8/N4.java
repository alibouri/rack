package Z8;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.v7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.AnnouncementFragment;
import com.sendwave.backend.fragment.AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment;
import java.util.List;

public final class n4 implements Adapter {
    public static final n4 a;
    public static final List b;

    static {
        n4.a = new n4();  // initializer: Ljava/lang/Object;-><init>()V
        n4.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(n4.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        AnnouncementFragment announcementFragment0 = AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new v7(s, announcementFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((v7)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((v7)object0).a);
        AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment.b(jsonWriter0, customScalarAdapters0, ((v7)object0).b);
    }
}

