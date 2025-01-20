package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.l4;
import a9.m4;
import a9.n4;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment implements Adapter {
    public static final LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment a;
    public static final List b;

    static {
        LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment.a = new LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment();  // initializer: Ljava/lang/Object;-><init>()V
        LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment.b = q.L(new String[]{"id", "linkedAccountTransferCounts", "linkedAccounts"});
    }

    public static LinkedAccountsFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        l4 l40 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    l40 = (l4)Adapters.-obj$default(n4.a, false, 1, null).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    list0 = Adapters.-list(Adapters.-obj(m4.a, true)).fromJson(jsonReader0, customScalarAdapters0);
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
        if(l40 == null) {
            throw o.q(jsonReader0, "linkedAccountTransferCounts");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "linkedAccounts");
        }
        return new LinkedAccountsFragment(s, l40, list0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, LinkedAccountsFragment linkedAccountsFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(linkedAccountsFragment0, "value");
        jsonWriter0.name("id");
        String s = linkedAccountsFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("linkedAccountTransferCounts");
        Adapters.-obj$default(n4.a, false, 1, null).toJson(jsonWriter0, customScalarAdapters0, linkedAccountsFragment0.b);
        jsonWriter0.name("linkedAccounts");
        Adapters.-list(Adapters.-obj(m4.a, true)).toJson(jsonWriter0, customScalarAdapters0, linkedAccountsFragment0.c);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        LinkedAccountsFragmentImpl_ResponseAdapter.LinkedAccountsFragment.b(jsonWriter0, customScalarAdapters0, ((LinkedAccountsFragment)object0));
    }
}

