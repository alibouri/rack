package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.g9;
import a9.j9;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class TxHistoryOfflineSyncPropsFragmentImpl_ResponseAdapter.TxHistoryOfflineSyncPropsFragment implements Adapter {
    public static final TxHistoryOfflineSyncPropsFragmentImpl_ResponseAdapter.TxHistoryOfflineSyncPropsFragment a;
    public static final List b;

    static {
        TxHistoryOfflineSyncPropsFragmentImpl_ResponseAdapter.TxHistoryOfflineSyncPropsFragment.a = new TxHistoryOfflineSyncPropsFragmentImpl_ResponseAdapter.TxHistoryOfflineSyncPropsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        TxHistoryOfflineSyncPropsFragmentImpl_ResponseAdapter.TxHistoryOfflineSyncPropsFragment.b = q.L(new String[]{"id", "user"});
    }

    public static TxHistoryOfflineSyncPropsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        g9 g90 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(TxHistoryOfflineSyncPropsFragmentImpl_ResponseAdapter.TxHistoryOfflineSyncPropsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    g90 = (g9)Adapters.-obj$default(j9.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
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
        if(g90 == null) {
            throw o.q(jsonReader0, "user");
        }
        return new TxHistoryOfflineSyncPropsFragment(s, g90);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, TxHistoryOfflineSyncPropsFragment txHistoryOfflineSyncPropsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(txHistoryOfflineSyncPropsFragment0, "value");
        jsonWriter0.name("id");
        String s = txHistoryOfflineSyncPropsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("user");
        Adapters.-obj$default(j9.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, txHistoryOfflineSyncPropsFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return TxHistoryOfflineSyncPropsFragmentImpl_ResponseAdapter.TxHistoryOfflineSyncPropsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        TxHistoryOfflineSyncPropsFragmentImpl_ResponseAdapter.TxHistoryOfflineSyncPropsFragment.b(jsonWriter0, customScalarAdapters0, ((TxHistoryOfflineSyncPropsFragment)object0));
    }
}

