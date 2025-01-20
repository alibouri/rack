package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.J8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment implements Adapter {
    public static final TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment a;
    public static final List b;

    static {
        TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment.a = new TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment.b = q.K("tooltips");
    }

    public static TooltipsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0;
        for(list0 = null; jsonReader0.selectName(TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment.b) == 0; list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj(J8.a, true))).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new TooltipsFragment(list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, TooltipsFragment tooltipsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(tooltipsFragment0, "value");
        jsonWriter0.name("tooltips");
        Adapters.-nullable(Adapters.-list(Adapters.-obj(J8.a, true))).toJson(jsonWriter0, customScalarAdapters0, tooltipsFragment0.a);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        TooltipsFragmentImpl_ResponseAdapter.TooltipsFragment.b(jsonWriter0, customScalarAdapters0, ((TooltipsFragment)object0));
    }
}

