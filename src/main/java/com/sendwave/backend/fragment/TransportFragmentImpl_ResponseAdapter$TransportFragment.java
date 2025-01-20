package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.d9;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class TransportFragmentImpl_ResponseAdapter.TransportFragment implements Adapter {
    public static final TransportFragmentImpl_ResponseAdapter.TransportFragment a;
    public static final List b;

    static {
        TransportFragmentImpl_ResponseAdapter.TransportFragment.a = new TransportFragmentImpl_ResponseAdapter.TransportFragment();  // initializer: Ljava/lang/Object;-><init>()V
        TransportFragmentImpl_ResponseAdapter.TransportFragment.b = q.K("transportPartners");
    }

    public static TransportFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0;
        for(list0 = null; jsonReader0.selectName(TransportFragmentImpl_ResponseAdapter.TransportFragment.b) == 0; list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj(d9.a, true))).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new TransportFragment(list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, TransportFragment transportFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(transportFragment0, "value");
        jsonWriter0.name("transportPartners");
        Adapters.-nullable(Adapters.-list(Adapters.-obj(d9.a, true))).toJson(jsonWriter0, customScalarAdapters0, transportFragment0.a);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return TransportFragmentImpl_ResponseAdapter.TransportFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        TransportFragmentImpl_ResponseAdapter.TransportFragment.b(jsonWriter0, customScalarAdapters0, ((TransportFragment)object0));
    }
}

