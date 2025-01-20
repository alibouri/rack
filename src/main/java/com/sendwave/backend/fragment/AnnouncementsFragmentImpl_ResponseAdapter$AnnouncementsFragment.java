package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.A;
import a9.v;
import a9.w;
import a9.z;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment implements Adapter {
    public static final AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment a;
    public static final List b;

    static {
        AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment.a = new AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment.b = q.L(new String[]{"id", "announcementsV3", "customerAnnouncements"});
    }

    public static AnnouncementsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        v v0 = null;
        w w0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    v0 = (v)Adapters.-obj$default(z.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    w0 = (w)Adapters.-obj(A.a, true).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "id");
        }
        if(v0 == null) {
            throw o.q(jsonReader0, "announcementsV3");
        }
        if(w0 == null) {
            throw o.q(jsonReader0, "customerAnnouncements");
        }
        return new AnnouncementsFragment(s, v0, w0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, AnnouncementsFragment announcementsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(announcementsFragment0, "value");
        jsonWriter0.name("id");
        String s = announcementsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("announcementsV3");
        Adapters.-obj$default(z.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, announcementsFragment0.b);
        jsonWriter0.name("customerAnnouncements");
        Adapters.-obj(A.a, true).toJson(jsonWriter0, customScalarAdapters0, announcementsFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        AnnouncementsFragmentImpl_ResponseAdapter.AnnouncementsFragment.b(jsonWriter0, customScalarAdapters0, ((AnnouncementsFragment)object0));
    }
}

