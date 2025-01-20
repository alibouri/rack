package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.r4;
import a9.u4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment implements Adapter {
    public static final MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment a;
    public static final List b;

    static {
        MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment.a = new MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment();  // initializer: Ljava/lang/Object;-><init>()V
        MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment.b = q.L(new String[]{"id", "historyConnection"});
    }

    public static MostRecentTxHistoryFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        r4 r40 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    r40 = (r4)Adapters.-nullable(Adapters.-obj$default(u4.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new MostRecentTxHistoryFragment(s, r40);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, MostRecentTxHistoryFragment mostRecentTxHistoryFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(mostRecentTxHistoryFragment0, "value");
        jsonWriter0.name("id");
        String s = mostRecentTxHistoryFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("historyConnection");
        Adapters.-nullable(Adapters.-obj$default(u4.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, mostRecentTxHistoryFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        MostRecentTxHistoryFragmentImpl_ResponseAdapter.MostRecentTxHistoryFragment.b(jsonWriter0, customScalarAdapters0, ((MostRecentTxHistoryFragment)object0));
    }
}

