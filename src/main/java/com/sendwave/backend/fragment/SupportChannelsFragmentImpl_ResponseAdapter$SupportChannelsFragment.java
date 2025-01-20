package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.V7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment implements Adapter {
    public static final SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment a;
    public static final List b;

    static {
        SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment.a = new SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment.b = q.K("supportChannels");
    }

    public static SupportChannelsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0;
        for(list0 = null; jsonReader0.selectName(SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment.b) == 0; list0 = Adapters.-list(Adapters.-obj$default(V7.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "supportChannels");
        }
        return new SupportChannelsFragment(list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SupportChannelsFragment supportChannelsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(supportChannelsFragment0, "value");
        jsonWriter0.name("supportChannels");
        Adapters.-list(Adapters.-obj$default(V7.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, supportChannelsFragment0.a);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SupportChannelsFragmentImpl_ResponseAdapter.SupportChannelsFragment.b(jsonWriter0, customScalarAdapters0, ((SupportChannelsFragment)object0));
    }
}

