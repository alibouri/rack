package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment implements Adapter {
    public static final ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment a;
    public static final List b;

    static {
        ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment.a = new ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment.b = q.L(new String[]{"iconUrl", "title", "body"});
    }

    public static ScratchCardDetailsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        String s2 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment.b)) {
                case 0: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    s2 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        return new ScratchCardDetailsFragment(s, s1, s2);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, ScratchCardDetailsFragment scratchCardDetailsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(scratchCardDetailsFragment0, "value");
        jsonWriter0.name("iconUrl");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, scratchCardDetailsFragment0.a);
        jsonWriter0.name("title");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, scratchCardDetailsFragment0.b);
        jsonWriter0.name("body");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, scratchCardDetailsFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        ScratchCardDetailsFragmentImpl_ResponseAdapter.ScratchCardDetailsFragment.b(jsonWriter0, customScalarAdapters0, ((ScratchCardDetailsFragment)object0));
    }
}

