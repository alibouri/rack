package Z8;

import Bb.q;
import Nb.j;
import Y8.j2;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class a1 implements Adapter {
    public static final a1 a;
    public static final List b;

    static {
        a1.a = new a1();  // initializer: Ljava/lang/Object;-><init>()V
        a1.b = q.K("magicLinkDescriptionAudioUrl");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(a1.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(s == null) {
            throw o.q(jsonReader0, "magicLinkDescriptionAudioUrl");
        }
        return new j2(s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((j2)object0), "value");
        jsonWriter0.name("magicLinkDescriptionAudioUrl");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((j2)object0).a);
    }
}

