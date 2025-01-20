package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.models.CurrencyAmount;
import java.util.List;

public final class AgentHistoryFragmentImpl_ResponseAdapter.AgentHistoryFragment implements Adapter {
    public static final AgentHistoryFragmentImpl_ResponseAdapter.AgentHistoryFragment a;
    public static final List b;

    static {
        AgentHistoryFragmentImpl_ResponseAdapter.AgentHistoryFragment.a = new AgentHistoryFragmentImpl_ResponseAdapter.AgentHistoryFragment();  // initializer: Ljava/lang/Object;-><init>()V
        AgentHistoryFragmentImpl_ResponseAdapter.AgentHistoryFragment.b = q.L(new String[]{"id", "balance"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        CurrencyAmount currencyAmount0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(AgentHistoryFragmentImpl_ResponseAdapter.AgentHistoryFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    currencyAmount0 = o.u(jsonReader0);
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
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        return new AgentHistoryFragment(currencyAmount0, s);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((AgentHistoryFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((AgentHistoryFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("balance");
        j.f(((AgentHistoryFragment)object0).b, "value");
        String s1 = ((AgentHistoryFragment)object0).b.k();
        j.e(s1, "toSerialized(...)");
        jsonWriter0.value(s1);
    }
}

