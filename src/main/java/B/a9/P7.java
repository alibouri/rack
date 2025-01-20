package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.fragment.RewardsPathRewardFragment;
import com.sendwave.backend.fragment.RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment;
import java.util.List;

public final class p7 implements Adapter {
    public static final p7 a;
    public static final List b;

    static {
        p7.a = new p7();  // initializer: Ljava/lang/Object;-><init>()V
        p7.b = q.K("__typename");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s;
        for(s = null; jsonReader0.selectName(p7.b) == 0; s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0)) {
        }
        jsonReader0.rewind();
        RewardsPathRewardFragment rewardsPathRewardFragment0 = RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment.a(jsonReader0, customScalarAdapters0);
        if(s == null) {
            throw o.q(jsonReader0, "__typename");
        }
        return new X6(s, rewardsPathRewardFragment0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((X6)object0), "value");
        jsonWriter0.name("__typename");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((X6)object0).a);
        RewardsPathRewardFragmentImpl_ResponseAdapter.RewardsPathRewardFragment.b(jsonWriter0, customScalarAdapters0, ((X6)object0).b);
    }
}

