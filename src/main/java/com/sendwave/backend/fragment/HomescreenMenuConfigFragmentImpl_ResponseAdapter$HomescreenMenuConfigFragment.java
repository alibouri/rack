package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.g3;
import a9.h3;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class HomescreenMenuConfigFragmentImpl_ResponseAdapter.HomescreenMenuConfigFragment implements Adapter {
    public static final HomescreenMenuConfigFragmentImpl_ResponseAdapter.HomescreenMenuConfigFragment a;
    public static final List b;

    static {
        HomescreenMenuConfigFragmentImpl_ResponseAdapter.HomescreenMenuConfigFragment.a = new HomescreenMenuConfigFragmentImpl_ResponseAdapter.HomescreenMenuConfigFragment();  // initializer: Ljava/lang/Object;-><init>()V
        HomescreenMenuConfigFragmentImpl_ResponseAdapter.HomescreenMenuConfigFragment.b = q.K("homescreenMenuConfig");
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        g3 g30;
        for(g30 = null; jsonReader0.selectName(HomescreenMenuConfigFragmentImpl_ResponseAdapter.HomescreenMenuConfigFragment.b) == 0; g30 = (g3)Adapters.-nullable(Adapters.-obj$default(h3.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new HomescreenMenuConfigFragment(g30);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((HomescreenMenuConfigFragment)object0), "value");
        jsonWriter0.name("homescreenMenuConfig");
        Adapters.-nullable(Adapters.-obj$default(h3.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((HomescreenMenuConfigFragment)object0).a);
    }
}

