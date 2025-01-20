package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.b7;
import a9.t7;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class ScratchCardsFragmentImpl_ResponseAdapter.ScratchCardsFragment implements Adapter {
    public static final ScratchCardsFragmentImpl_ResponseAdapter.ScratchCardsFragment a;
    public static final List b;

    static {
        ScratchCardsFragmentImpl_ResponseAdapter.ScratchCardsFragment.a = new ScratchCardsFragmentImpl_ResponseAdapter.ScratchCardsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        ScratchCardsFragmentImpl_ResponseAdapter.ScratchCardsFragment.b = q.L(new String[]{"id", "scratchCards"});
    }

    public static ScratchCardsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        b7 b70 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(ScratchCardsFragmentImpl_ResponseAdapter.ScratchCardsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    b70 = (b7)Adapters.-nullable(Adapters.-obj$default(t7.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new ScratchCardsFragment(s, b70);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, ScratchCardsFragment scratchCardsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(scratchCardsFragment0, "value");
        jsonWriter0.name("id");
        String s = scratchCardsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("scratchCards");
        Adapters.-nullable(Adapters.-obj$default(t7.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, scratchCardsFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return ScratchCardsFragmentImpl_ResponseAdapter.ScratchCardsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        ScratchCardsFragmentImpl_ResponseAdapter.ScratchCardsFragment.b(jsonWriter0, customScalarAdapters0, ((ScratchCardsFragment)object0));
    }
}

