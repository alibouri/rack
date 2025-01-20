package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import a9.d;
import a9.e;
import a9.n;
import a9.o;
import a9.t;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment implements Adapter {
    public static final AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment a;
    public static final List b;

    static {
        AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment.a = new AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment();  // initializer: Ljava/lang/Object;-><init>()V
        AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment.b = q.L(new String[]{"id", "title", "message", "sortOrder", "icon", "actionUri", "animationUrl", "frequency", "voiceMessageUri", "detail", "styling"});
    }

    public static AnnouncementFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
        Integer integer0 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        e e0 = null;
        String s6 = null;
        d d0 = null;
        a9.j j0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    integer0 = (Integer)Adapters.NullableIntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    s3 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    s4 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    s5 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 7: {
                    e0 = (e)Adapters.-nullable(Adapters.-obj$default(o.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 8: {
                    s6 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 9: {
                    d0 = (d)Adapters.-nullable(Adapters.-obj$default(n.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 10: {
                    j0 = (a9.j)Adapters.-nullable(Adapters.-obj$default(t.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw Y8.o.q(jsonReader0, "id");
        }
        if(s1 == null) {
            throw Y8.o.q(jsonReader0, "title");
        }
        if(s2 == null) {
            throw Y8.o.q(jsonReader0, "message");
        }
        return new AnnouncementFragment(s, s1, s2, integer0, s3, s4, s5, e0, s6, d0, j0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, AnnouncementFragment announcementFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(announcementFragment0, "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.getId());
        jsonWriter0.name("title");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.b);
        jsonWriter0.name("message");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.c);
        jsonWriter0.name("sortOrder");
        Adapters.NullableIntAdapter.toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.d);
        jsonWriter0.name("icon");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.e);
        jsonWriter0.name("actionUri");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.f);
        jsonWriter0.name("animationUrl");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.g);
        jsonWriter0.name("frequency");
        Adapters.-nullable(Adapters.-obj$default(o.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.h);
        jsonWriter0.name("voiceMessageUri");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.i);
        jsonWriter0.name("detail");
        Adapters.-nullable(Adapters.-obj$default(n.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.j);
        jsonWriter0.name("styling");
        Adapters.-nullable(Adapters.-obj$default(t.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, announcementFragment0.k);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        AnnouncementFragmentImpl_ResponseAdapter.AnnouncementFragment.b(jsonWriter0, customScalarAdapters0, ((AnnouncementFragment)object0));
    }
}

