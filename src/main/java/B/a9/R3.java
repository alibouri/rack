package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.IdPhotoStatusFragment;
import com.sendwave.backend.fragment.IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment;
import java.util.List;

public final class r3 implements Adapter {
    public static final r3 a;
    public static final List b;

    static {
        r3.a = new r3();  // initializer: Ljava/lang/Object;-><init>()V
        r3.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(r3.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        IdPhotoStatusFragment idPhotoStatusFragment0 = IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new o3(s, idPhotoStatusFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((o3)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((o3)object0).a);
        IdPhotoStatusFragmentImpl_ResponseAdapter.IdPhotoStatusFragment.b(jsonWriter0, customScalarAdapters0, ((o3)object0).b);
    }
}

