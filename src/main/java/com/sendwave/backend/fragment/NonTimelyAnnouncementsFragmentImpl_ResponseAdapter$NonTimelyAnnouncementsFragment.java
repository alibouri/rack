package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.A4;
import a9.K4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment implements Adapter {
    public static final NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment a;
    public static final List b;

    static {
        NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment.a = new NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment.b = q.K("nonTimelyAnnouncement");
    }

    public static NonTimelyAnnouncementsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        A4 a40;
        for(a40 = null; jsonReader0.selectName(NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment.b) == 0; a40 = (A4)Adapters.-nullable(Adapters.-obj$default(K4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        return new NonTimelyAnnouncementsFragment(a40);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, NonTimelyAnnouncementsFragment nonTimelyAnnouncementsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(nonTimelyAnnouncementsFragment0, "value");
        jsonWriter0.name("nonTimelyAnnouncement");
        Adapters.-nullable(Adapters.-obj$default(K4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, nonTimelyAnnouncementsFragment0.a);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        NonTimelyAnnouncementsFragmentImpl_ResponseAdapter.NonTimelyAnnouncementsFragment.b(jsonWriter0, customScalarAdapters0, ((NonTimelyAnnouncementsFragment)object0));
    }
}

