package Z8;

import Bb.q;
import Nb.j;
import Y8.l4;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.NonTimelyAnnouncementsFragment;
import com.sendwave.backend.fragment.NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment;
import java.util.List;

public final class f2 implements Adapter {
    public static final f2 a;
    public static final List b;

    static {
        f2.a = new f2();  // initializer: Ljava/lang/Object;-><init>()V
        f2.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(f2.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        NonTimelyAnnouncementsFragment nonTimelyAnnouncementsFragment0 = NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new l4(s, nonTimelyAnnouncementsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((l4)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((l4)object0).a);
        NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment.b(jsonWriter0, customScalarAdapters0, ((l4)object0).b);
    }
}

