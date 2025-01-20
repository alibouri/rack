package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.M0;
import a9.O0;
import a9.Q0;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment implements Adapter {
    public static final ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment a;
    public static final List b;

    static {
        ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment.a = new ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment.b = q.L(new String[]{"pageInfo", "edges"});
    }

    public static ClaimedScratchCardsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        M0 m00 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment.b)) {
                case 0: {
                    m00 = (M0)Adapters.-obj$default(Q0.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    list0 = Adapters.-list(Adapters.-obj$default(O0.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(m00 == null) {
            throw o.q(jsonReader0, "pageInfo");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "edges");
        }
        return new ClaimedScratchCardsFragment(m00, list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, ClaimedScratchCardsFragment claimedScratchCardsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(claimedScratchCardsFragment0, "value");
        jsonWriter0.name("pageInfo");
        Adapters.-obj$default(Q0.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, claimedScratchCardsFragment0.a);
        jsonWriter0.name("edges");
        Adapters.-list(Adapters.-obj$default(O0.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, claimedScratchCardsFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        ClaimedScratchCardsFragmentImpl_ResponseAdapter.ClaimedScratchCardsFragment.b(jsonWriter0, customScalarAdapters0, ((ClaimedScratchCardsFragment)object0));
    }
}

