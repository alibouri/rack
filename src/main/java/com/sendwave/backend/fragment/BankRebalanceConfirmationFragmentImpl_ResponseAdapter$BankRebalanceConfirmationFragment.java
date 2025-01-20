package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import a9.U;
import a9.X;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class BankRebalanceConfirmationFragmentImpl_ResponseAdapter.BankRebalanceConfirmationFragment implements Adapter {
    public static final BankRebalanceConfirmationFragmentImpl_ResponseAdapter.BankRebalanceConfirmationFragment a;
    public static final List b;

    static {
        BankRebalanceConfirmationFragmentImpl_ResponseAdapter.BankRebalanceConfirmationFragment.a = new BankRebalanceConfirmationFragmentImpl_ResponseAdapter.BankRebalanceConfirmationFragment();  // initializer: Ljava/lang/Object;-><init>()V
        BankRebalanceConfirmationFragmentImpl_ResponseAdapter.BankRebalanceConfirmationFragment.b = q.L(new String[]{"id", "agentUser"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        U u0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(BankRebalanceConfirmationFragmentImpl_ResponseAdapter.BankRebalanceConfirmationFragment.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    u0 = (U)Adapters.-nullable(Adapters.-obj$default(X.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
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
        return new BankRebalanceConfirmationFragment(s, u0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((BankRebalanceConfirmationFragment)object0), "value");
        jsonWriter0.name("id");
        String s = ((BankRebalanceConfirmationFragment)object0).getId();
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, s);
        jsonWriter0.name("agentUser");
        Adapters.-nullable(Adapters.-obj$default(X.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, ((BankRebalanceConfirmationFragment)object0).b);
    }
}

