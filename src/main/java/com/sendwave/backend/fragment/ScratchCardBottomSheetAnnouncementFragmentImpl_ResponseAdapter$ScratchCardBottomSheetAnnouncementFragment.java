package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.K6;
import a9.L6;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment implements Adapter {
    public static final ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment a;
    public static final List b;

    static {
        ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment.a = new ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment();  // initializer: Ljava/lang/Object;-><init>()V
        ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment.b = q.L(new String[]{"id", "scratchCardBottomSheetAnnouncement"});
    }

    public static ScratchCardBottomSheetAnnouncementFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        K6 k60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    k60 = (K6)Adapters.-nullable(Adapters.-obj$default(L6.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new ScratchCardBottomSheetAnnouncementFragment(s, k60);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, ScratchCardBottomSheetAnnouncementFragment scratchCardBottomSheetAnnouncementFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(scratchCardBottomSheetAnnouncementFragment0, "value");
        jsonWriter0.name("id");
        String s = scratchCardBottomSheetAnnouncementFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("scratchCardBottomSheetAnnouncement");
        Adapters.-nullable(Adapters.-obj$default(L6.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, scratchCardBottomSheetAnnouncementFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        ScratchCardBottomSheetAnnouncementFragmentImpl_ResponseAdapter.ScratchCardBottomSheetAnnouncementFragment.b(jsonWriter0, customScalarAdapters0, ((ScratchCardBottomSheetAnnouncementFragment)object0));
    }
}

