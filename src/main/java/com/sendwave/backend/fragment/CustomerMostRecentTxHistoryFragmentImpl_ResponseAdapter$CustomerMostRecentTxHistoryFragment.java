package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.M1;
import a9.P1;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment implements Adapter {
    public static final CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment a;
    public static final List b;

    static {
        CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment.a = new CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment();  // initializer: Ljava/lang/Object;-><init>()V
        CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment.b = q.L(new String[]{"id", "historyConnection"});
    }

    public static CustomerMostRecentTxHistoryFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        M1 m10 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    m10 = (M1)Adapters.-nullable(Adapters.-obj$default(P1.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new CustomerMostRecentTxHistoryFragment(s, m10);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, CustomerMostRecentTxHistoryFragment customerMostRecentTxHistoryFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(customerMostRecentTxHistoryFragment0, "value");
        jsonWriter0.name("id");
        String s = customerMostRecentTxHistoryFragment0.getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("historyConnection");
        Adapters.-nullable(Adapters.-obj$default(P1.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, customerMostRecentTxHistoryFragment0.b);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        CustomerMostRecentTxHistoryFragmentImpl_ResponseAdapter.CustomerMostRecentTxHistoryFragment.b(jsonWriter0, customScalarAdapters0, ((CustomerMostRecentTxHistoryFragment)object0));
    }
}

