package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.e8;
import a9.m8;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment implements Adapter {
    public static final SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment a;
    public static final List b;

    static {
        SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment.a = new SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment.b = q.K("supportHours");
    }

    public static SupportHoursFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        e8 e80;
        for(e80 = null; jsonReader0.selectName(SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment.b) == 0; e80 = (e8)Adapters.-nullable(Adapters.-obj$default(m8.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new SupportHoursFragment(e80);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SupportHoursFragment supportHoursFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(supportHoursFragment0, "value");
        jsonWriter0.name("supportHours");
        Adapters.-nullable(Adapters.-obj$default(m8.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, supportHoursFragment0.a);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SupportHoursFragmentImpl_ResponseAdapter.SupportHoursFragment.b(jsonWriter0, customScalarAdapters0, ((SupportHoursFragment)object0));
    }
}

