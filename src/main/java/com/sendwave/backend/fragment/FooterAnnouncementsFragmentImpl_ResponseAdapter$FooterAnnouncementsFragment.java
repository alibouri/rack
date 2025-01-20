package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.M2;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class FooterAnnouncementsFragmentImpl_ResponseAdapter.FooterAnnouncementsFragment implements Adapter {
    public static final FooterAnnouncementsFragmentImpl_ResponseAdapter.FooterAnnouncementsFragment a;
    public static final List b;

    static {
        FooterAnnouncementsFragmentImpl_ResponseAdapter.FooterAnnouncementsFragment.a = new FooterAnnouncementsFragmentImpl_ResponseAdapter.FooterAnnouncementsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        FooterAnnouncementsFragmentImpl_ResponseAdapter.FooterAnnouncementsFragment.b = q.K("footerAnnouncements");
    }

    public static FooterAnnouncementsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        List list0;
        for(list0 = null; jsonReader0.selectName(FooterAnnouncementsFragmentImpl_ResponseAdapter.FooterAnnouncementsFragment.b) == 0; list0 = Adapters.-list(Adapters.-obj$default(M2.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0)) {
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "footerAnnouncements");
        }
        return new FooterAnnouncementsFragment(list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, FooterAnnouncementsFragment footerAnnouncementsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(footerAnnouncementsFragment0, "value");
        jsonWriter0.name("footerAnnouncements");
        Adapters.-list(Adapters.-obj$default(M2.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, footerAnnouncementsFragment0.a);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return FooterAnnouncementsFragmentImpl_ResponseAdapter.FooterAnnouncementsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        FooterAnnouncementsFragmentImpl_ResponseAdapter.FooterAnnouncementsFragment.b(jsonWriter0, customScalarAdapters0, ((FooterAnnouncementsFragment)object0));
    }
}

