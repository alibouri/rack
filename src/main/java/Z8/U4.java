package Z8;

import Bb.q;
import Nb.j;
import Y8.F7;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.NonTimelyAnnouncementsFragment;
import com.sendwave.backend.fragment.NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment;
import java.util.List;

public final class u4 implements Adapter {
    public static final u4 a;
    public static final List b;

    static {
        u4.a = new u4();  // initializer: Ljava/lang/Object;-><init>()V
        u4.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(u4.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        NonTimelyAnnouncementsFragment nonTimelyAnnouncementsFragment0 = NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new F7(s, nonTimelyAnnouncementsFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((F7)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((F7)object0).a);
        NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment.b(jsonWriter0, customScalarAdapters0, ((F7)object0).b);
    }
}

